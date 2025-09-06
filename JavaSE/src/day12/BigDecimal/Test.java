package day12.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        double x = 0.1;
        double y = 0.2;
        System.out.println(x+y); //会出现精度缺失
        BigDecimal bigDecimal1 = BigDecimal.valueOf(x);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(y);
        System.out.println(bigDecimal1.add(bigDecimal2)); //使用BigDecimal类加法 不会出现这些问题
        System.out.println(bigDecimal1.subtract(bigDecimal2));//减法
        System.out.println(bigDecimal1.multiply(bigDecimal2));//乘法
        System.out.println(bigDecimal1.divide(bigDecimal2,2, RoundingMode.HALF_UP));//除法 精确几位 舍入模式

        double a = bigDecimal1.doubleValue();
        double b = bigDecimal2.doubleValue();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

    }
}
