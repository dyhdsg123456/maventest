package java8;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author dyh
 * @date 2020/6/8
 */
public class TestSort {
    public static void main(String[] args){
        int[][] ints = new int[][]{{3,5},{1,2},{6,9},{4,7}};
        Arrays.sort(ints,(v1,v2)->v1[0] - v2[0]);
        for (int[] anInt : ints) {
            System.out.println(anInt[0]);
        }
        int[][] ints1 = new int[ints.length][2];
        System.out.println(ints1);
        int i=2;
        int[] test = new int[]{1,2,5,6,8};
        test[++i]=4;
        System.out.println(i);
        System.out.println(test);

    }
}
