
import java.util.HashMap;

public class MergeExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java", 50);
        map.put("Python", 30);

        map.merge("Java", 20, Integer::sum);
        map.merge("C++", 40, Integer::sum);

        System.out.println(map);
    }
}
