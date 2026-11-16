
import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency: " + map);
    }
}
