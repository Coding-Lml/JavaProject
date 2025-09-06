package day16.Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamCreate {
    public static void main(String[] args) {
        // 获得List集合的stream流
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        Stream<String> stream = list.stream();

        //获得set集合的stream流
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "a", "b", "c");
        Stream<String> stream2 = set.stream();

        //获得map集合的stream流
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("马尔扎哈", 166.3);
        map.put("卡尔扎巴", 168.3);

        Collection<String> keys = map.keySet();
        Stream<String> ks = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        //获得数组的stream流
        String[] names2 = {"张翠山", "东方不败", "唐大山", "独孤求败"};
        Stream<String> s1 = Arrays.stream(names2);
        Stream<String> s2 = Stream.of(names2);
    }
}
