package day05;

import java.util.Scanner;
/*1.什么是方法重载？
	答：一个类中，多个方法的名称相同，但它们形参列表不同。
2.方法重载需要注意什么？
	- 一个类中，只要一些方法的名称相同、形参列表不同，那么它们就是方法重载了，
	  其它的都不管（如：修饰符，返回值类型是否一样都无所谓）。
	- 形参列表不同指的是：形参的个数、类型、顺序不同，不关心形参的名称。
* */
public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a,b));
    }
    static int sum(int a, int b){
        return a+b;
    }
}

