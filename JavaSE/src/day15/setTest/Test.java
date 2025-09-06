package day15.setTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/*
* HashSet 底层原理  jdk8以前：数组+链表  jkd8以后：数组+链表+红黑树
* HashSet 去重原理  1. hashCode方法确定数组存储位置  2. equals方法判断新添加的元素是否重复
* */
public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();	//无序、无索引、不重复
        set.add("a");
        set.add("c");
        set.add("c");
        set.add("b");
        System.out.println(set);

        Set<Integer> set0 = new LinkedHashSet<>(); //有序、无索引、不重复
        set0.add(1);
        set0.add(3);
        set0.add(0);
        set0.add(2);
        System.out.println(set0);

        Set<String> set1 = new TreeSet<>(); //可排序(升序)、无索引、不重复
        set1.add("A");
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        set1.add("Z");
        System.out.println(set1);
    }
}
