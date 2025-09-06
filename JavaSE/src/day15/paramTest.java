package day15;

import java.util.Arrays;
//可变参数是一种特殊形式的参数 定义在方法和构造器的形参列表 可以接收多个同类型的实际参数
//可变参数在方法内部本质是一个数组
//一个方法里面只能有一个可变参数
//一个形参列表中如果有多个参数 可变参数需要写到最后面

public class paramTest {
    public static void main(String[] args){
        //不传递参数，下面的nums长度则为0, 打印元素是[]
        test();

        //传递3个参数，下面的nums长度为3，打印元素是[10, 20, 30]
        test(10,20,30);

        //传递一个数组，下面数组长度为4，打印元素是[10,20,30,40]
        int[] arr = new int[]{10,20,30,40};
        test(arr);
    }

    public static void test(int...nums){
        //可变参数在方法内部，本质上是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("----------------");
    }
}
