package day11.PackagingClass;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//1.创建Integer对象，封装基本类型数据10   已经移除！！！
//        Integer a = new Integer(10);

//2.使用Integer类的静态方法valueOf(数据)
        Integer b = Integer.valueOf(10);
//3.还有一种自动装箱的写法（意思就是自动将基本类型转换为引用类型）
        Integer c = 10;
//4.有装箱肯定还有拆箱（意思就是自动将引用类型转换为基本类型）
        int d = c;
//5.装箱和拆箱在使用集合时就有体现
        ArrayList<Integer> list = new ArrayList<>();
//添加的元素是基本类型，实际上会自动装箱为Integer类型
        list.add(100);
//获取元素时，会将Integer类型自动拆箱为int类型
        int e = list.get(0);

//1.字符串转换为数值型数据
        String ageStr = "29";
        int age1 = Integer.parseInt(ageStr);

        String scoreStr = "3.14";
        double score = Double.parseDouble(scoreStr);

//2.整数转换为字符串，以下几种方式都可以（挑中你喜欢的记一下）
        Integer a = 23;
        String s1 = Integer.toString(a);
        String s2 = a.toString();
        String s3 = a+"";
        String s4 = String.valueOf(a);
    }
}
