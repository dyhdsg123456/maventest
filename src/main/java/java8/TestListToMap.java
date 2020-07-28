package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author dyh
 * @date 2020/7/20
 */
public class TestListToMap {
    public static void main(String[] args) {

        ArrayList<Dict> dicts = new ArrayList<>();
        dicts.add(Dict.builder().id(1).name("123").build());
        dicts.add(Dict.builder().id(1).name("321").build());
        Map<Integer, String> collect = dicts.stream().collect(Collectors.toMap(Dict::getId, Dict::getName, (key1, key2) -> key1));
        for (Integer integer : collect.keySet()) {
            System.out.println(integer);
            System.out.println(collect.get(integer));
        }
        String test="";
        System.out.println(test.equals("321"));
    }


}
