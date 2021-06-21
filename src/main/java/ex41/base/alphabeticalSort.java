/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex41.base;

import java.util.List;

public class alphabeticalSort { //this method takes in a list of the names and sorts them
    public static void sortFunction(List<String> listOfNames) {
        //sort list of names
        listOfNames.sort(String.CASE_INSENSITIVE_ORDER);
    }
}
