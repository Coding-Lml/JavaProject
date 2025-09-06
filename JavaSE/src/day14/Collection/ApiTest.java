package day14.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/*
* 集合分为 Collection单列集合 和 Map双列集合
* List系列 添加的元素是有序、可重复、有索引 ： ArrayList LinkedList
* Set系列 添加的元素是无序、不重复、无索引
*   - HashSet 无序、不重复、无索引
*   - LinkedHashSet 有序、不重复、无索引
*   - TreeSet 默认按大小升序、不重复、无索引
* */
public class ApiTest {
    public static void main(String[] args) {
        //一.不同类型Collection的存取顺序不同 -------------------------------------

        ArrayList<String> list = new ArrayList<>(); //存取顺序一致，可以重复，有索引
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        System.out.println(list); //[java1, java2, java1, java2]

        HashSet<String> list1 = new HashSet<>(); //存取顺序不一致，不重复，无索引
        list1.add("java1");
        list1.add("java2");
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");
        list1.add("ava4");
        System.out.println(list1); //[java3, java2, java1]
        System.out.println(list1);

        //二.Collection集合的常用方法--------------------------------------------

        Collection<String> c = new ArrayList<>();
        //1.public boolean add(E e): 添加元素到集合
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        System.out.println(c); //打印: [java1, java1, java2, java2, java3]

        //2.public int size(): 获取集合的大小
        System.out.println(c.size()); //5

        //3.public boolean contains(Object obj): 判断集合中是否包含某个元素
        System.out.println(c.contains("java1")); //true
        System.out.println(c.contains("Java1")); //false

        //4.public boolean remove(E e): 删除某个元素，如果有多个重复元素只能删除第一个
        System.out.println(c.remove("java1")); //true
        System.out.println(c); //打印: [java1,java2, java2, java3]

        //5.public void clear(): 清空集合的元素
        c.clear();
        System.out.println(c); //打印：[]

        //6.public boolean isEmpty(): 判断集合是否为空 是空返回true 反之返回false
        System.out.println(c.isEmpty()); //true

        //7.public Object[] toArray(): 把集合转换为数组
        Object[] array = c.toArray();
        System.out.println(Arrays.toString(array)); //[java1,java2, java2, java3]

        //8.如果想把集合转换为指定类型的数组，可以使用下面的代码
        String[] array1 = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(array1)); //[java1,java2, java2, java3]

        //9.还可以把一个集合中的元素，添加到另一个集合中
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2); //把c2集合中的全部元素，添加到c1集合中去
        System.out.println(c1); //[java1, java2, java3, java4]
    }
}
