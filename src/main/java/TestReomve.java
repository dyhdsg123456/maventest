import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dyh
 * @date 2020/7/9
 */
public class TestReomve {
    public static void main(String[] args) {

        ArrayList<String> integers = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayList<String> integers1 = new ArrayList<>(Arrays.asList("3", "45", "2", "32", "41"));

        integers.removeAll(integers1);
        for (String integer : integers) {
            System.out.println(integer);
        }
    }
}
