import java.util.LinkedList;

/**
 * @author dyh
 * @date 2020/6/28
 */
public class GTest {
    public static void main(String[] args) {

        LinkedList<String> objects = new LinkedList<>();
        objects.add("111");
        objects.add("111");
        objects.add("112");
        for (String object : objects) {
            System.out.println(object);
        }
        objects.stream().distinct().forEach(System.out::println);

    }
}
