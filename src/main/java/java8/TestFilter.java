package java8;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dyh
 * @date 2020/5/13
 */
public class TestFilter {
    public static void main(String[] args) {

        List<Object> collect = Arrays.asList("udasd", " ", "", "dasd").stream().filter(e -> StringUtils.isNotBlank(e)).map(e->e+"哈哈哈").collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        System.out.println(collect.size());
    }
}
