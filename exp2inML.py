import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler

data = pd.read_csv(r"C:\Users\Shreya Gangwar\Downloads\archive\Housing.csv")

numeric_data = data.select_dtypes(include=[np.number])
X = numeric_data.drop("price", axis=1).values
y = numeric_data["price"].values.reshape(-1, 1)

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)





scaler = StandardScaler()
X_train = scaler.fit_transform(X_train)
X_test = scaler.transform(X_test)

X_train = np.c_[np.ones((X_train.shape[0], 1)), X_train]
X_test = np.c_[np.ones((X_test.shape[0], 1)), X_test]




np.random.seed(42)
beta_sgd = np.random.randn(X_train.shape[1], 1)
beta_mbgd = beta_sgd.copy()




learning_rate = 0.01
epochs = 50
batch_size = 32

loss_sgd = []
loss_mbgd = []



def mse_loss(X, y, beta):
    return (1 / len(y)) * np.sum((y - X @ beta) ** 2)

for epoch in range(epochs):
    for i in range(X_train.shape[0]):
        xi = X_train[i:i+1]
        yi = y_train[i:i+1]
        gradient = 2 * xi.T @ (xi @ beta_sgd - yi)
        beta_sgd = beta_sgd - learning_rate * gradient

    loss = mse_loss(X_train, y_train, beta_sgd)
    loss_sgd.append(loss)
    print(f"Epoch {epoch+1} SGD Beta:", beta_sgd.flatten())





for epoch in range(epochs):
    indices = np.random.permutation(X_train.shape[0])
    X_shuffled = X_train[indices]
    y_shuffled = y_train[indices]

    for i in range(0, X_train.shape[0], batch_size):
        X_batch = X_shuffled[i:i+batch_size]
        y_batch = y_shuffled[i:i+batch_size]
        m = len(y_batch)
        gradient = (2 / m) * X_batch.T @ (X_batch @ beta_mbgd - y_batch)
        beta_mbgd = beta_mbgd - learning_rate * gradient

    loss = mse_loss(X_train, y_train, beta_mbgd)
    loss_mbgd.append(loss)
    print(f"Epoch {epoch+1} MiniBatch Beta:", beta_mbgd.flatten())


    

plt.figure(figsize=(8,6))
plt.plot(loss_sgd, label="SGD")
plt.plot(loss_mbgd, label="Mini-Batch GD")
plt.xlabel("Epochs")
plt.ylabel("MSE")
plt.legend()
plt.show()
