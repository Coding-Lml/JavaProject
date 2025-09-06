package day9;
/*  static可以用来修饰成员变量和成员方法
    1. 修饰成员变量-类变量、实例变量
        -类变量用static修饰 计算机只有一份 会被类的全部对象共享
        -实例变量无static修饰 属于对象自己
    2. 修饰成员方法-类方法、实例方法
        -类方法用static修饰 调用时直接用类名调用
        -实例方法属于对象 调用时需要使用对象调用
* */
public class staticDemo {
    public static final String SCHOOL = "Henu-Tju";
    public static void main(String[] args) {
        System.out.println(SCHOOL);
    }
}
