package day03;

import java.util.Random;

/*如果是对一个范围进行判断，建议使用if分支结构
- 如果是与一个一个的值比较的时候，建议使用switch分支结构*/
/*1.表达式类型只能是byte、short、int、char
	JDK5开始支持枚举，JDK7开始支持String
	不支持double、float、double
- 2.case给出的值不允许重复，且只能是字面量，不能是变量。
- 3.正常使用switch的时候，不要忘记写break，否则会出现穿透现象
* */
public class if_while_for {
    public static void main(String[] args) {
        double score = 298;
        if (score >= 90) {
            System.out.println("您的绩效为 A");
        }else if (score >= 80) {
            System.out.println("您的绩效为 B");
        }else if (score >= 60) {
            System.out.println("您的绩效为 C");
        }else{
            System.out.println("您的绩效为 D");
        }

        String week = "z";
        switch (week) {
            case "zhouyi":
                System.out.println("111");
                break;
            case "zhouer":
                System.out.println("222");
                break;
            case "zhousan":
                System.out.println("333");
                break;
            case "zhousi":
                System.out.println("444");
                break;
            case "zhouwu":
                System.out.println("555");
                break;
            default:
                System.out.println("666777");
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        Random random = new Random();
        int x = random.nextInt(100);
//      x 属于 [0,100)
        System.out.println(x);

    }
}
