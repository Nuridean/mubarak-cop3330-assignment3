package ex46.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] array = new String[]{"badger", "mushroom", "snake" };
        int[] count = new int[]{0,0,0};

        File file = new File("input/exercise46_input.txt");
        wordChecker(array, count);

        wordPrinter(array, count);


    }

    private static void wordPrinter(String[] array, int[] count) {
        for(int k = 0; k < array.length; k++ ){
            System.out.print(array[k] + ": ");

            for(int j = 0; j < count[k]; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void wordChecker(String[] array, int[] count) {
        while(in.hasNext()) {
            String word = in.next();
            for(int i = 0; i < array.length; i++) {
                if(word.equals(array[i])) {
                    count[i]++;
                }
            }
        }
    }
}
