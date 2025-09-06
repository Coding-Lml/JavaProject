package day07;
/*
构造器其实是一种特殊的方法，但是这个方法没有返回值类型，方法名必须和类名相同。
分为有参构造器和无参构造器，帮助类创建对象时的对象初始化
* */
//1.在设计一个类时，如果不写构造器，Java会自动生成一个无参数构造器。
//2.一定定义了有参数构造器，Java就不再提供空参数构造器，此时建议自己加一个无参数构造器。
//3.在创建对象时，new对象的时候执行构造方法

//封装性：合理暴露、合理隐藏
public class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(){}
    void print(){
        System.out.println("name = " + name + ", age = " + age);
    }
    public void printthis(){
        System.out.println(this);
    }
}
