package day10.Interface;
/*
* jkd8以后接口新特性
* 1.默认方法必须使用default修饰，私有方法使用private修饰，静态方法使用static修饰，默认会被public修饰
* 2.默认方法使用对象调用，私有方法子类无法调用，静态方法直接使用接口名进行调用，抽象方法进行重写
* */
public class Test {
    public static void main(String[] args) {
        ImplementClass x = new ImplementClass();
//        System.out.println(ImplementClass.SCHOOL);
//        System.out.println(Interface.SCHOOL);
        x.print();
    }
}
