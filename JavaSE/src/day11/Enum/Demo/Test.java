package day11.Enum.Demo;

public class Test {
    public static void main(String[] args) {
        provideInfo(Constant.BOY);
    }
    public static void provideInfo(Constant constant){
        switch (constant){ //jdk14之后新特性
            case BOY -> System.out.println("展示信息给男生看");
            case GIRL -> System.out.println("展示信息给女生看");
        }
    }
}
