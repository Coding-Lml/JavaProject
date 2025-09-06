package day10.polymorphism;

public class Student extends People{
    @Override
    public void print(){
        System.out.println("我是学生！");
    }
    public void study(){
        System.out.println("我会上学！");
    }
}
