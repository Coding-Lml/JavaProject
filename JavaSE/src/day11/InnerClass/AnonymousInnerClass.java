package day11.InnerClass;
//匿名内部类 是 一个没有名字的子类对象或者接口的实现类对象 本质是一个对象
//只有在调用方法时，当方法的形参是一个接口或者抽象类，为了简化代码书写，而直接传递匿名内部类对象给方法。
public class AnonymousInnerClass {
    Animal a = new Animal(){
        @Override
        public void cry(){
            System.out.println("喵喵喵");
        }
    };
}
class Test1 {
    public static void main(String[] args){
        Swimming s1 = new Swimming(){
            public void swim(){
                System.out.println("狗刨飞快");
            }
        };
        go(s1);

        Swimming s2 = new Swimming(){
            public void swim(){
                System.out.println("猴子游泳也还行");
            }
        };
        go(s2);
    }
    //形参是Swimming接口，实参可以接收任意Swimming接口的实现类对象
    public static void go(Swimming s){
        System.out.println("开始~~~~~~~~");
        s.swim();
        System.out.println("结束~~~~~~~~");
    }
}