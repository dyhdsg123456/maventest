/**
 * @author dyh
 * @date 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
        int i = 900;
        int aa = 800;
        String s = String.valueOf(i);
        String vv = String.valueOf(aa);
        char c = s.charAt(0);
        char b = vv.charAt(0);
        char d = "0".charAt(0);
        System.out.println(c>d);

        System.out.println("123".substring(0,3));
        System.out.println("303".compareTo("330"));
    }
}
