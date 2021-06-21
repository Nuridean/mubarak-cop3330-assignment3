/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex41.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        //create object for sorting class
        alphabeticalSort sorter = new alphabeticalSort();
        //create object for output class
        outputToFile output = new outputToFile();

        List<String> lines = getStrings();
        sorter.sortFunction(lines);
        output.outputToFile(lines);


    }


    private static List<String> getStrings() throws IOException {
        //read in file from project folder
        List<String> lines = Files.readAllLines(Path.of("input/exercise41_input.txt"));
        //return list of strings
        return lines;
    }
    //load contents of file
    //creating an array to place content files in
    //fill array with contents from file dont hardcode the number of names
    //loop to sort the content withtin the array
    ///then print out the sorted list to a file called 'exercise41_output.txt'

}
