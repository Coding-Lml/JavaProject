package day15.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// 第二种在集合中实现对象的排序方式 在Collections.sort()方法中传入Comparable接口的实现类对象 使用匿名内部类完成
public class Student1 {
    private String name;
    private int age;
    private double height;


    public Student1(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class Test2{
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("蜘蛛精",23,169.7));
        students.add(new Student1("紫霞",22,169.8));
        students.add(new Student1("紫霞",22,169.8));
        students.add(new Student1("至尊宝",26,169.5));
//        Collections.sort(students,new Comparator<Student1>() {                匿名内部类
//            public int compare(Student1 o1, Student1 o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        //Collections.sort(students,(o1,o2)->{return o1.getAge()- o2.getAge();}); Lambda表达式

        students.sort(Comparator.comparing(Student1::getAge));

        System.out.println(students);
    }
}
