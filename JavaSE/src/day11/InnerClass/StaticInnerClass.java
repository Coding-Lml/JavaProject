package day11.InnerClass;
// 静态内部类
public class StaticInnerClass {
    private int age = 99;
    public static String schoolName="黑马";

    // 静态内部类
    public static class Inner{
        //静态内部类访问外部类的静态变量，是可以的；
        //静态内部类访问外部类的实例变量，是不行的
        public void test(){
            System.out.println(schoolName); //99
            //System.out.println(age);   //报错
        }
    }
}

//内部类对象创建方法
class Test{
    public static void main(String[] args) {
        //格式：外部类.内部类 变量名 = new 外部类.内部类();
        StaticInnerClass.Inner in = new StaticInnerClass.Inner();
        in.test();
    }
}