/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex45.base;

import java.io.*;
import java.util.Scanner;

public class fileEditor {
    private static final Scanner in = new Scanner(System.in);
    static void fileReader(String filePath) throws IOException {
        //read the data with buffer read
        String line = "";
        String oldtext = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                oldtext += line + "\r\n";
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String newName = askingUserForName();

        replacerNode(oldtext, newName);


    }

    private static void replacerNode(String oldtext, String newName) throws IOException {
        String badWord = "utilize";
        String goodWord ="use";
        String replacer = oldtext.replaceAll(badWord, goodWord);

        FileWriter writer = new FileWriter("output/" + newName + ".txt");
        writer.write(replacer);
        writer.close();
    }

    private static String askingUserForName() {
        //Prompt user for the name of the output file
        System.out.print("Enter the name of the new output file. ");
        String newName = in.nextLine();
        return newName;
    }
}
