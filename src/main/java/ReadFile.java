import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;


public class ReadFile {

    public HashMap<String, Integer> Read(String path) throws IOException {
        String result = new  String(Files.readAllBytes (Paths.get(path)));
        
        HashMap<String, Integer> fruits = new HashMap<>();

        for (String item : result.split(" +")) {
            if(!fruits.containsKey(item)){
                fruits.put(item, 1);
            } else {
                int temp = fruits.get(item);
                fruits.put(item, temp+1);
            }
        }

        return fruits;
    }
}