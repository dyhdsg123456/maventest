package sort;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author dyh
 * @date 2020/6/18
 */
public class SortColour {
    public static void main(String[] args) {
        int[] ints = new int[]{2, 0, 2, 1, 1, 0};
        sortColour(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void sortColour(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            Integer key = entry.getKey();
            for (int j = 0; j < value; j++) {
                nums[i] = key;
                i++;
            }
        }
    }

    public static void sortColour2(int[] nums) {

    }
}
