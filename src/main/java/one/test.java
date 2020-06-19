package one;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author dyh
 * @date 2020/5/15
 */
public class test {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.subList(0,1);
        strings.add("1");
        strings.add("2");
        int i=1;
        for (String string : strings) {
            System.out.println(i);
            i++;
            if("1".equals(string)){
                strings.remove(string);
            }
        }
        System.out.println(strings);
    }
}
