package day15.mapTest;

import java.util.*;

/*
1.首先可以将80个学生选择的景点放到一个集合中去（也就是说，集合中的元素是80个任意的ABCD元素）
2.准备一个Map集合用来存储景点，以及景点被选择的次数
3.遍历80个学生选择景点的集合，得到每一个景点，判断Map集合中是否包含该景点
	如果不包含，则存储"景点=1"
    如果包含，则存获取该景点原先的值，再存储"景点=原来的值+1"; 此时新值会覆盖旧值
* */
public class Demo {
    public static void main(String[] args) {
        // 1、把80个学生选择的景点数据拿到程序中来。
        List<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 1; i <= 80; i++) {
            // 每次模拟一个学生选择一个景点，存入到集合中去。
            int index = r.nextInt(4); // 0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);

        // 2、开始统计每个景点的投票人数
        // 准备一个Map集合用于统计最终的结果
        Map<String, Integer> result = new HashMap<>();

        // 3、开始遍历80个景点数据
        for (String s : data) {
            // 问问Map集合中是否存在该景点
            if(result.containsKey(s)){
                // 说明这个景点之前统计过。其值+1. 存入到Map集合中去
                result.put(s, result.get(s) + 1);
            }else {
                // 说明这个景点是第一次统计，存入"景点=1"
                result.put(s, 1);
            }
        }
        System.out.println(result);
    }
}
