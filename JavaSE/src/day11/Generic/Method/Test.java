package day11.Generic.Method;
// 泛型方法
public class Test {
    public static void main(String[] args){
        // 类方法可以属于类可以直接调用 实例方法必须通过对象调用 test方法必须使用static修饰
        // 调用 test 方法，传递字符串数据，那么 T = String
        String rs = test("test");
        System.out.println(rs);

        // 调用 test 方法，传递 Dog 对象，那么 T = Dog
        Dog d = test(new Dog());
        System.out.println(d);
    }

    // 泛型方法：<T> 表示声明一个类型变量 T
    public static <T> T test(T t) {
        return t;
    }
}

class Dog {
    @Override
    public String toString() {
        return "I am a Dog";
    }
}
