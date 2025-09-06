package day14.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListTest {
    public static void main(String[] args) {
        //List的增删改查
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3,1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(1,4);
        System.out.println(list);
        int x = list.get(1);
        System.out.println(x);
        System.out.println(list);

        //List的遍历
        //1 for循环遍历
        for(int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            System.out.println(a);
        }
        System.out.println("-------------");
        //2 增强for循环
        for(int b : list){
            System.out.println(b);
        }
        System.out.println("--------------");
        //3 迭代器遍历
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------");
        //4 forEach遍历
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("--------------");
        //5 lambda表达式遍历\方法引用
        list.forEach(s-> System.out.println(s));
        System.out.println("--------------");
        list.forEach(System.out::println);
        System.out.println("--------------");
    }
}
