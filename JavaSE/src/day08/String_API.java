package day08;
/*
1.使用直接创建的字符串会存储到字符串常量池当中，相同的字符串只会存储一次 s1==s2
2.通过new出来的字符串对象，每次new都会产生一个新的对象放到堆内存当中 s1!=s2
* */
public class String_API {
    public static void main(String[] args) {
//        一：创建字符串

//        直接创建字符串
        String s = "123你好啊";
//        String类有四种构造器
//        1. 无参构造器
        String s1 = "";
//        2. 根据传入的字符串内容创建字符串对象
        String s2 = new String("123");
//        3. 根据字符数组的内容创建字符串对象
        char[] chars = new char[]{'1','2','3'};
        String s3 = new String(chars);
//        4. 根据字节数组的内容创建字符串对象 只能是byte类型数组
        byte[] s4 = {97,98,99,100,101,102};
        String s5 = new String(s4);
        System.out.println(s1+" "+s2+" "+s3+" "+s5);
        String name = "name";
        name = "张三";
        System.out.println(name);

//      二：字符串是不可变对象
        String s11 = "hello";
        String s22 = s11;

        s11 = s11 + " world";

        System.out.println(s11); // hello world
        System.out.println(s22); // hello


//       三：String的常见方法
        System.out.println(chars.length); //数组的长度 arr.length   对象的属性
        System.out.println(s3.length());  //字符串的长度 s.length() 对象的方法

        System.out.println(s3.charAt(0)); //返回s3[0]
        System.out.println(s2.equals(s3)); //返回两个字符串的内容是否相同
        System.out.println(s2.equalsIgnoreCase(s3)); //忽略大小写判断字符串内容是否相同
        System.out.println(s3.substring(0,2)); //获得子串包前不包后
        System.out.println(s3.substring(2)); //从索引开始取到后


        // 8、把字符串中的某个内容替换成新内容，并返回新的字符串对象给我们
        String info = "这个电影简直是个垃圾，垃圾电影！！";
        String rs3 = info.replace("垃圾", "**");
        System.out.println(rs3);

        // 9、判断字符串中是否包含某个关键字
        String info2 = "Java是最好的编程语言之一，我爱Java,Java不爱我！";
        System.out.println(info2.contains("Java"));
        System.out.println(info2.contains("java"));
        System.out.println(info2.contains("Java2"));

        // 10、判断字符串是否以某个字符串开头。
        String rs4 = "张三丰";
        System.out.println(rs4.startsWith("张"));
        System.out.println(rs4.startsWith("张三"));
        System.out.println(rs4.startsWith("张三2"));

        // 11、把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回给我们
        String rs5 = "张无忌,周芷若,殷素素,赵敏";
        String[] names = rs5.split(",");
        for (String string : names) {
            System.out.println(string);
        }
    }
}
