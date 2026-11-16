
import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "java is powerful java is popular";

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : sentence.split(" ")) {

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
