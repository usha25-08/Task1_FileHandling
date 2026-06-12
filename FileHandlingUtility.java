import java.io.*;

public class FileHandlingUtility {

    public static void writeFile(String fileName) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

            bw.write("Welcome to Java File Handling Project");
            bw.newLine();
            bw.write("This file demonstrates write operation.");

            bw.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;

            System.out.println("\nFile Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void appendFile(String fileName) {
        try {
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter(fileName, true));

            bw.newLine();
            bw.write("This line is appended later.");

            bw.close();

            System.out.println("\nData appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String fileName = "sample.txt";

        writeFile(fileName);

        readFile(fileName);

        appendFile(fileName);

        System.out.println("\nAfter Appending:");

        readFile(fileName);
    }
}