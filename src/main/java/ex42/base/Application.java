/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex42.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main (String[] args)  {
        //pull CSV data from input.txt
        String filePath = "input/exercise42_input.txt";
        //create class object
        employeeList application = new employeeList();

        printStatements();
        employeeList.fileReader(filePath);
    }



    private static void printStatements() {
        //displaying labels formatted as table
        System.out.printf("%-10s", "Last");
        System.out.printf("%-10s", "First");
        System.out.printf("%-10s%n", "Salary");
        System.out.print("--------------------------\n");
    }
}
