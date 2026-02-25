import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReadWriteSample1 {
    public static void main(String[] args) {
        
        String[] inputFiles = {"Sample1.txt", "Sample2.txt"};
        String[] outputFiles = {"Sample1Copy.txt", "Sample2Copy.txt"};

        for (int j = 0; j < inputFiles.length; j++) {
            try (FileInputStream fis = new FileInputStream(inputFiles[j]);
                 FileOutputStream fos = new FileOutputStream(outputFiles[j])) {

                System.out.println("Reading from " + inputFiles[j] + " and writing to " + outputFiles[j]);
                int i;
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i); 
                    fos.write(i);              
                }

            } catch (IOException e) {
                System.out.println("Error with file " + inputFiles[j] + ": " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}