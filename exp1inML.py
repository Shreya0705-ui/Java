import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error
from sklearn.preprocessing import StandardScaler


data = pd.read_csv(
    r"C:\Users\Shreya Gangwar\Downloads\archive\Housing.csv"
)


numeric_data = data.select_dtypes(include=[np.number])

X = numeric_data.drop("price", axis=1)
y = numeric_data["price"]



X = X.fillna(X.mean())



X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)



scaler = StandardScaler()
X_train_scaled = scaler.fit_transform(X_train)
X_test_scaled = scaler.transform(X_test)



model = LinearRegression()
model.fit(X_train_scaled, y_train)


y_pred = model.predict(X_test_scaled)


mse_sklearn = mean_squared_error(y_test, y_pred)
print("MSE (sklearn):", mse_sklearn)

# =========================
# MSE = (1/n) * Σ (yi - ŷi)^2
# =========================
errors = y_test.values - y_pred       
squared_errors = errors ** 2           
mse_manual = np.mean(squared_errors)    

print("MSE (manual):", mse_manual)



coefficients = pd.DataFrame({
    "Feature": X.columns,
    "Coefficient": model.coef_
})

print("\nRegression Coefficients:")
print(coefficients)


plt.figure(figsize=(8, 6))
plt.scatter(y_test, y_pred, alpha=0.6)
plt.xlabel("True House Prices")
plt.ylabel("Predicted House Prices")
plt.title("True vs Predicted House Prices")


plt.plot(
    [y_test.min(), y_test.max()],
    [y_test.min(), y_test.max()],
)

plt.show()
