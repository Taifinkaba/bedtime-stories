package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    static void main() {
        Scanner myScanner = new Scanner(System.in);

        // user input for files
        System.out.println("Enter the name of a story: ");
        String fileName = myScanner.nextLine();


        try {
            // fileReader to bufferedReader
            FileReader fileReader = new FileReader("src/main/resources/" + fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            int lineNumber = 1;

            while((input = bufferedReader.readLine()) != null){
                System.out.printf("%d, %s%n", lineNumber, input);
                lineNumber++;
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Your story isn't here!");
            e.printStackTrace();
        }

        myScanner.close();
    }
}
