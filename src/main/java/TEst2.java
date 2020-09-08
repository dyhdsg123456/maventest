import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author dyh
 * @date 2020/8/5
 */
public class TEst2 {
    public static void main(String[] args) {
        String b="";
        String s="Country_Ename";
        String countryEname = getString(b, s);
        System.out.println(countryEname);
        System.out.println(TimeUnit.DAYS.toMillis(1)*30);
        System.out.println(TimeUnit.DAYS.toMillis(30));
    }

    private static String getString(String b, String s) {
        String[] s1 = s.split("_");
        for (String s2 : s1) {
            b=b+s2;
        }
        return StringUtils.uncapitalize(b);
    }

}
