/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class websiteGenerator {
    String nameofSite;
    String authorofSite;
    String filePath;


    public String javaScriptFolder() {
        //generating the JavaScript folder
        String directory = filePath + nameofSite + "/js";
        File folder = new File(directory);

        folder.mkdirs();

        return directory;
    }

    public String HTMLFolder() {
        //generating the HTML folder
        String directory = filePath + nameofSite + "/index.html";
        String HTML = "<title> "  + nameofSite + "</title>\n<meta> " + authorofSite + "</meta>\n";

        File folder = new File(directory);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(folder));

            writer.write(HTML);
            writer.close();

            return directory;
        } catch(Exception ex) {
            return "Failure";
        }
    }




    public String CSSFolder() {
        //generating the CSS folder
        String directory = filePath + nameofSite + "/css";
        File folder = new File(directory);

        folder.mkdirs();

        return directory;
    }


    public  String websiteGenerator() {
        //generating the website folder
        String directory = filePath + nameofSite;
        File folder = new File(directory);

        folder.mkdirs();

        return directory;
    }


}
