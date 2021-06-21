/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex41.base;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class outputToFile {
    public static void outputToFile(List<String> listOfNames) throws IOException { //this method takes in a list fo strings
        //Create new file in project folder
        FileWriter output = new FileWriter("output/exercise41_output.txt");
        //write to the output file number of names
        output.write("Total of " + listOfNames.size() + " names\n" +
                "-----------------\n");
        //print in loop list of sorted names
        for(String i: listOfNames) {
            output.write(i+"\n");
        }
        //close file
        output.close();
    }
}
