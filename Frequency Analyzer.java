import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {
            10, 20, 10, 30, 20, 10, 40, 30, 50, 10
        };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
        }

        int maxFrequency = 0;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Frequency Map: " + map);
        System.out.println("Most Frequent: " + mostFrequent);
        System.out.println("Maximum Frequency: " + maxFrequency);

        System.out.println("Duplicates:");

        map.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " = " + value);
            }
        });
    }
}
