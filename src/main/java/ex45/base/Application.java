package ex45.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        fileEditor application = new fileEditor();
        String fileData = "input/exercise45_input.txt";

        String list;
        application.fileReader(fileData);



    }


}
