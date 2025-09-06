package day9.Extend;

public class A {
    public int i;
    public void print1(){
        System.out.println("===print1====");
    }

    private int j;
    private void print2(){
        System.out.println("===print2====");
    }

    public A(){
        System.out.println("父类无参构造器执行");
    }

}
