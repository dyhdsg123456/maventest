import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dyh
 * @date 2020/7/23
 */
public class Test123 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("123");
        List<String> list = Arrays.asList("123", "3213");
        System.out.println(list.contains(objects.get(0)));
        System.out.println(list);

    }
}
