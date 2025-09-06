package day14.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class ForTest {
    public static void main(String[] args) {
        //1.迭代器遍历Collection集合 ------------------------------
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c); //[赵敏, 小昭, 素素, 灭绝]

        //第一步：先获取迭代器对象
        //解释：Iterator就是迭代器对象，用于遍历集合的工具)
        Iterator<String> it = c.iterator();

        //第二步：用于判断当前位置是否有元素可以获取
        //解释：hasNext()方法返回true，说明有元素可以获取；反之没有
        while(it.hasNext()){
            //第三步：获取当前位置的元素，然后自动指向下一个元素.
            String e = it.next();
            System.out.println(e);
        }

        //2.增强for循环 ------------------------------------------
        //使用增强for遍历集合
        for(String s: c){
            System.out.println(s);
        }

        //再尝试使用增强for遍历数组
        String[] arr = {"迪丽热巴", "古力娜扎", "稀奇哈哈"};
        for(String name: arr){
            System.out.println(name);
        }
        System.out.println("-------------------");
        //3.forEach遍历 ------------------------------------------
        //调用forEach方法
        //由于参数是一个Consumer接口，所以可以传递匿名内部类
        c.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });

        //也可以使用lambda表达式对匿名内部类进行简化
        c.forEach(s->System.out.println(s)); //[赵敏, 小昭, 素素, 灭绝]

        //方法引用
        c.forEach(System.out::println);
    }
}
