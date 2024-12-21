import java.util.HashMap;

public class Majority_Element {
    public int majorityElement(int[] nums) {

        Integer frequency = Integer.MIN_VALUE;

        // I used a Hashmap to store element as key and
        // its frequency as values
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (Integer x : nums) {

            // Hashmap contains our item then upate its frequency
            // set its frequency 1 otherwise
            if (map.containsKey(x)) {
                Integer value = map.get(x) + 1;
                map.put(x, value);
            } else {
                map.put(x, 1);
            }
        }

        // iterate over each key in map and find element
        // with highest frequency
        for (Integer x : map.keySet()) {
            if (map.get(x) >= frequency) {
                frequency = map.get(x);
                result = x;
            }

        }

        return (int) result;
    }
}
