/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex42.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class employeeList {
    static double fileReader(String filePath) {
        //read the data with buffer read
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] inputValues = line.split(",");
                //print out file data in table
                System.out.printf("%-10s", inputValues[0]);
                System.out.printf("%-10s", inputValues[1]);
                System.out.printf("%-10s%n", inputValues[2]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
