/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex43.base;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String nameofSite;
    private static String authorofSite;
    private static String javaScript;
    private static String cssFile;


    public static void main (String[] args) {

        //creating websiteGenerator class object
        websiteGenerator application = new websiteGenerator();

        promptUserInput();


        application.nameofSite = nameofSite;
        application.authorofSite = authorofSite;
        application.filePath = "output/";

        System.out.printf("Created " + application.websiteGenerator());
        System.out.printf("Created " + application.HTMLFolder());

        ifFolderNeeded(application);

    }

    private static void ifFolderNeeded(websiteGenerator application) {
        if(javaScript.equals("y") || javaScript.equals("Y")) {
            System.out.printf("Created " + application.javaScriptFolder());
        }
        if(cssFile.equals("y") || cssFile.equals("Y")) {
            System.out.printf("Created " + application.CSSFolder());
        }
    }

    private static void promptUserInput() {
        //prompt user for the name of the site
        System.out.printf("Site name: ");
        nameofSite = in.nextLine();
        //application. = author;

        //Prompt for the author of the site.
        System.out.printf("Author: ");
        authorofSite = in.nextLine();
        //application.siteName = authorofSite;

        //Ask if the user wants a folder for JavaScript files.
        System.out.printf("Do you want a folder for JavaScript? ");
        javaScript = in.nextLine();

        //Ask if the user wants a folder for CSS files.
        System.out.printf("Do you want a folder for CSS? ");
        cssFile = in.nextLine();
    }
}

