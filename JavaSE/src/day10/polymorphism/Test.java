package day10.polymorphism;

import day10.Final.FinalDemo;

/*
1. p1 和 p2 都是People类型 但是指向的对象不一样 称为对象多态
2. p1 和 p2 本质代表不同对象 却可以执行相同的方法 但行为不一样 称为行为多态
* */
public class Test {
    public static void main(String[] args) {
        People p1 = new Teacher();
//        p1.teach(); 多态情况下不能使用子类特有方法  但是转型之后可以调用
        if(p1 instanceof Teacher){ //判断p1接收的是子类Teacher对象
            Teacher p11 = (Teacher) p1;
            p11.teach();
        }
        go(p1);
        People p2 = new Student();
//        p2.study();
        go(p2);
    }
    public static void go(People people){
        System.out.println("----start!-----");
        people.print();
        System.out.println("----end!-----");
        System.out.println(FinalDemo.SCHOOL);
    }
}
