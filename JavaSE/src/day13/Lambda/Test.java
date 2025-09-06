package day13.Lambda;
// Lambda 表达式 用于简化匿名内部类代码的书写 使用前必须先有一个接口 接口中只能有一个抽象方法
public class Test {
    public static void main(String[] args) {
        //1.创建正常的Swimming接口的匿名内部类对象
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("------1------");
            }
        };
        s.swim();
        //2.使用Lambda表达式对Swimming接口的匿名内部类进行简化
        Swimming s1 = () -> System.out.println("------2------");
        s1.swim();
    }
}
