package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author dyh
 * @date 2020/6/18
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] ints = new int[]{3,30,34,5,9};
        String s = largestNumber(ints);
        System.out.println(s);
    }

    public static  String largestNumber(int[] nums) {
        String args[]=new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            args[i]=String.valueOf(nums[i]);

        }
        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a=o1+o2;
                String b=o2+o1;
                return b.compareTo(a);
            }
        });

        if(args[0].equals("0")){
            return "0";
        }
        String largestNumberStr = new String();
        for (String numAsStr : args) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;

    }
}
