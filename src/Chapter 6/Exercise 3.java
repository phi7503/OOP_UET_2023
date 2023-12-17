package javaapplication9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            // Open the Scanner object to read from the file
            Scanner input = new Scanner(new File("C:\\Tmp\\test.txt"));

            // Set delimiters to ignore characters other than a..z or A..Z
            input.useDelimiter(Pattern.compile("[^a-zA-Z]+"));

            // Read and print each word to the screen, ignoring the .,:…
            while (input.hasNext()) {
                // Bỏ qua các kí tự không phải a..z hay A..Z
                input.skip("[^a-zA-Z]*");
                String word = input.next();
                System.out.println(word);
            }

            // Close the Scanner object after using it
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
