import java.io.IOException;
import java.util.*;

public class Command {
    public int howManyFruits() throws IOException {
        int count = 0;
        String path = "src/main/java/picnic.txt";
        HashMap<String, Integer> fruits = new ReadFile().Read(path);

        String[] keyFru = fruits.keySet().toArray(new String[0]);
        for (String key: keyFru
             ) {
            count += fruits.get(key);
        }
        return count;
    }

    public String theLongestName() throws IOException {
        String path = "src/main/java/picnic.txt";
        HashMap<String, Integer> fruits = new ReadFile().Read(path);
        int maxLength = 0;
        String longestName = null;
        String[] keyFru = fruits.keySet().toArray(new String[0]);
        for (String key: keyFru
        ) {
            if(key.length() > maxLength){
                longestName = key;
                maxLength = key.length();
            }
        }
        return longestName;
    }

    public void seeAllFruits() throws IOException {
        String path = "src/main/java/picnic.txt";
        HashMap<String, Integer> fruits = new ReadFile().Read(path);
        for (String name: fruits.keySet()) {
            String value = fruits.get(name).toString();
            System.out.println(name + ": " + value);
        }
    }

    public String mostPopularFruit() throws IOException {
        String path = "src/main/java/picnic.txt";
        HashMap<String, Integer> fruits = new ReadFile().Read(path);
        int count = 0;
        String mostPopularFruit = null;
        String[] keyFru = fruits.keySet().toArray(new String[0]);
        for (String key: keyFru
        ) {
            if(fruits.get(key) >= count){
                mostPopularFruit = key;
                count = fruits.get(key);
            }
        }
        return mostPopularFruit;
    }
}
