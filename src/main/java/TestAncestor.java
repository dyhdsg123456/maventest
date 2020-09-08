import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dyh
 * @date 2020/8/11
 */
public class TestAncestor {
    public static void main(String[] args) {
        String s="14348/14360/14369/14359/";
        String s1="14348/14360/14361/";
        String target="2657/2659/14353/14360/";
        String ancestor="2657/2659/14353/";

        System.out.println(s1.indexOf("/14360/"));
        int i = s1.indexOf("/14360/");
        System.out.println(ancestor+s1.substring(i+1));
        System.out.println(ancestor+s.substring(i+1));
        System.out.println("14348/14360/".indexOf("14360"));
        System.out.println("2657/23".startsWith("2657/"));

        List<Integer> collect = Arrays.asList(322, 12, 4323, 1, 3214).stream().sorted().collect(Collectors.toList());
        for (Integer integer : collect) {
            System.out.println(integer);
        }
    }
}
