import cn.hutool.crypto.SecureUtil;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


/**
 * @author dyh
 * @date 2020/6/22
 */
public class TestPassword {
    public static void main(String[] args) {
        String s = SecureUtil.md5("1qaz@#$%^&*()-");

        String s2 = SecureUtil.md5("654321");
        s = s.substring(0, 20);
        System.out.println(s);
        System.out.println(s2.substring(0, 20));
//        System.out.println(MessageFormat.format("12341{0}","das"));
        HashMap<String, String> map = new HashMap<>();
        map.put("123","321");
        map.put("321","4321");
        System.out.println(map.toString());
        System.out.println(95*0.4+90*0.25+85*0.15+95*0.2);
        System.out.println(TimeUnit.DAYS.toDays(30));
        System.out.println(TimeUnit.DAYS.toMillis(1));
        String format = MessageFormat.format("1234{0},1312{1}", "大师", "法大使馆");
        System.out.println(format);
    }
}
