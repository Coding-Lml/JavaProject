package day9.Extend;

public class B extends A {
    public void print3(){
        System.out.println("===print3===");
        System.out.println(i);
        print1();

//        私有方法和变量不能被继承
//        System.out.println(j);
//        print2();
    }
    @Override
    public void print1(){
        System.out.println("重写的print1");
    }

    public B() {
        super();
        System.out.println("子类无参构造器执行");
    }
}
