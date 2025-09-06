package day10.Interface;

public class ImplementClass implements Interface {
    public static final String SCHOOL = "tju";
    @Override
    public void print(){
        System.out.println("实现类重写接口方法");
        System.out.println("实现类的成员变量："+SCHOOL);
        System.out.println("接口的成员变量："+Interface.SCHOOL);
    }
    @Override
    public void print4(){
        System.out.println("重写接口方法4");
    }
}
