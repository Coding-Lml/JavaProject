package day15.mapTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>(); //无序、不重复、无索引
        map.put("1",1);
        map.put("6",2);
        map.put("2",2);
        map.put("3",3);
        System.out.println(map);

        Map<String,Integer> map1 = new LinkedHashMap<>(); //有序、不重复、无索引
        map1.put("1",1);
        map1.put("6",2);
        map1.put("2",2);
        map1.put("2",4); //重复会覆盖
        map1.put("3",3);
        System.out.println(map1);

        Map<String,Integer> map2 = new TreeMap<>(); //有序、不重复、无索引
        map2.put("1",1);
        map2.put("6",2);
        map2.put("2",2);
        map2.put("2",4);
        System.out.println(map2);
    }
}
