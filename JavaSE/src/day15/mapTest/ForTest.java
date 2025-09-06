package day15.mapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class ForTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        System.out.println(map);
        System.out.println("-----------------------");

        //1.使用map.keySet()找到键的Set集合 再用map.get(key)来找到键对应的值
        Set<String> set = map.keySet();
        for(String key:set){
            System.out.println(key+"---->"+map.get(key));
        }
        System.out.println("-----------------------");
        //2.调用Map集合提供entrySet方法，把Map集合转换成键值对类型的Set集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "---->" + value);
        }
        System.out.println("-----------------------");

        //3.在jdk8以后的版本 可以使用forEach结合Lambda表达式
        map.forEach(new BiConsumer<String, Integer>() { //匿名内部类
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "---->" + integer);
            }
        });
        System.out.println("-----------------------");

        map.forEach((k,v)->{System.out.println(k+"---->"+v);});
    }
}
