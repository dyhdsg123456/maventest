import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * @author dyh
 * @date 2020/7/15
 */
public class testTime {
    public static void main(String[] args) {
        byte b = Byte.parseByte("1");
        System.out.println(b);
        LocalDate parse = LocalDate.parse("2017-09-03");
        System.out.println(parse);
        System.out.println( UUID.randomUUID());

    }

}
