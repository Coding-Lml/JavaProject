package day17.Unicode;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String data = "a我爱你b";
        byte[] bytes = data.getBytes();  //默认UTF-8编码方式
        System.out.println(Arrays.toString(bytes));

        //按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //解码
        String str = new String(bytes1, "GBK");
        System.out.println(str);
        String str1 = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(str1);
    }
}
