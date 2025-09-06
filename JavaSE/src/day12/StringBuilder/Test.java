package day12.StringBuilder;
// StringBuffer 代表可变字符串对象 相当于一个容器
// 比String 更适合做字符串的修改操作 效率更高 代码更简洁
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);
        sb.append("World").append("\n").append("Hello"); //链式编程
        System.out.println(sb);
        sb.reverse(); //反转
        System.out.println(sb);
        System.out.println(sb.length());//长度
        String s = sb.toString();//转成字符串
        System.out.println(s);
    }
}
