package day10.Interface;
/*
* 1. 接口中有 成员变量（常量）和 成员方法（抽象方法）
* 2. 接口是要被类实现的 该类称为实现类
* 3. 实现类可以实现多个接口 类实现接口必须重写所有接口的抽象方法 否则该类必须是抽象类
* */
public interface Interface {
    public static final String SCHOOL = "Tju";
    public abstract void print();//public abstract 可以省略
    private void print1(){};
    static void print2(){};
    default void print3(){};
    void print4();
}
