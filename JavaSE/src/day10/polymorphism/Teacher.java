package day10.polymorphism;

public class Teacher extends People{
    @Override
    public void print(){
        System.out.println("我是老师！");
    }
    public void teach(){
        System.out.println("我可以教书！");
    }
}
