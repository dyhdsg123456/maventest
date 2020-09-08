import org.apache.commons.lang3.RandomUtils;

import java.text.MessageFormat;
import java.util.regex.Pattern;

/**
 * @author dyh
 * @date 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
//        int i = 900;
//        int aa = 800;
//        String s = String.valueOf(i);
//        String vv = String.valueOf(aa);
//        char c = s.charAt(0);
//        char b = vv.charAt(0);
//        char d = "0".charAt(0);
//        System.out.println(c>d);
//
//        System.out.println("123".substring(0,3));
//        System.out.println("303".compareTo("330"));

        String rex="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,30}$";
        System.out.println(Pattern.matches(rex,"1234123D@1312321"));
//        for (int j = 0; j < 1000; j++) {
//            int i= (int) ((Math.random() * 9 + 1) * 1000);
//            System.out.println(i);
//            System.out.println(MessageFormat.format("您的验证码为:{0}十分钟内有效，请尽快处理！",i+"" ));
//        }
String s="{\"code\":\""+(int) ((Math.random() * 9 + 1) * 1000)+"\"}";
        System.out.println(s);
        String format = String.format("'%s%%'", "123");
        System.out.println(format);
    }
}
