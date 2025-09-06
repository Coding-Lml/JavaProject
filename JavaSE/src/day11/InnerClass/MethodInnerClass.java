package day11.InnerClass;
//局部内部类 该类定义在一个类的成员方法中 和局部变量一样 只在方法中有效故只能在方法内创建对象 一般开发不用
public class MethodInnerClass {
    public void test(){
        //局部内部类
        class Inner{
            public void show(){
                System.out.println("Inner...show");
            }
        }

        //局部内部类只能在方法中创建对象，并使用
        Inner in = new Inner();
        in.show();
    }
}
