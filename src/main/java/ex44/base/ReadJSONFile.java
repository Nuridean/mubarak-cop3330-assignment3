
package ex44.base;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class ReadJSONFile {

    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("input/exercise44_input.json"));

            JSONObject jsonObject = (JSONObject)obj;

            //Reading products array from  the file
            JSONArray subjects = (JSONArray)jsonObject.get("products");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            //Flag for current string
            int flag = 0;
            input = userInput(bufferedReader);
            Iterator iterator = subjects.iterator();
            flag = productCheck(input, flag, iterator);
            //if statement to send user back
            if(flag == 0){
                System.out.println("Sorry, that product was not found in our inventory");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static int productCheck(String input, int flag, Iterator iterator) {
        while (iterator.hasNext()) {
            JSONObject json = (JSONObject) iterator.next();
            String name = (String)json.get("name");
            if(input.toLowerCase().equals(name.toLowerCase())){
                System.out.println("Name: "+ name );
                System.out.println("Price: "+ json.get("price"));
                System.out.println("Quantity: "+ json.get("quantity"));
                flag = 1;
            }
        }
        return flag;
    }

    private static String userInput(BufferedReader bufferedReader) throws IOException {
        String input;
        System.out.print("What is the product name? ");
        input = bufferedReader.readLine();
        return input;
    }
}


