package day11.Enum;
// X Y Z 其实都是A类的对象，每个枚举项都是被public static final修饰 故可以用类名调用且不能更改
public class Test {
    public static void main(String[] args) {
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(A.X);
        System.out.println(A.Y);
        System.out.println(A.Z);
    }
}
