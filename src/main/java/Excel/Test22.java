package Excel;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dyh
 * @date 2020/9/3
 */
public class Test22 {
    public static void main(String[] args) {
        String newString = filterString("");
        System.out.println(StringUtils.isBlank(newString));
        System.out.println(newString);
    }

    private static String filterString(String s) {
        String regEx="[\n`~!#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
        Matcher matcher = Pattern.compile(regEx).matcher(s);
        return matcher.replaceAll("").trim();
    }
}
