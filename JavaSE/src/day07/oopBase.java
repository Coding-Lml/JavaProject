package day07;
// 一个代码文件只有一个类可以使用public修饰 并且该类名必须是代码文件名
// 一个代码文件可以有多个类
// 对象与对象之间的数据不会互相影响 但是多个变量指向一个对象时就会互相影响了
// 如果某个对象没有一个变量引用 则该对象无法被操作成为垃圾对象
public class oopBase {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 1;
        s1.name = "lml";
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.print();
        System.out.println(s1);
        s1.printthis();
//      this指当前类的对象
    }
}
