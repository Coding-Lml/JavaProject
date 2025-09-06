package day15.Collections;

//想在集合中存储Student对象并根据对象内容排序 需要实现Comparable接口
//这是第一种在集合中存储对象并进行排序的方式
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
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

class Test1{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精",23,169.7));
        students.add(new Student("紫霞",22,169.8));
        students.add(new Student("紫霞",22,169.8));
        students.add(new Student("至尊宝",26,169.5));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
