package one;

import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dyh
 * @date 2020/6/15
 */
public class Tewteas {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 201; i++) {
            stringBuilder.append(i+",");

        }
        System.out.println(stringBuilder);
//        System.out.println(1200/500);
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.add(1);
//        objects.add(2);
//        List<Object> objects1 = objects.subList(0, 2);
//        for (Object o : objects1) {
//            System.out.println(o);
//        }
//        for (int i = 1; i < 201; i++) {
//            System.out.println(RandomUtils.nextInt(0,500));
//        }

    }
}
