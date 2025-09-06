package day12.StringJoiner;

import java.util.StringJoiner;

// StringJoiner 是 拼接神器 效率高 并且代码简洁
public class Test1 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("a");
        joiner.add("b");
        joiner.add("c");
        System.out.println(joiner.toString());
        //参数1：间隔符
        //参数2：开头
        //参数3：结尾
        StringJoiner joiner1 = new StringJoiner(",","[","]");
        joiner1.add("a");
        joiner1.add("b");
        joiner1.add("c");
        System.out.println(joiner1.toString());
    }
}
