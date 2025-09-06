package day11.Generic.MyArrayList;

public class Test {
    public static void main(String[] args){
        //1.确定MyArrayList集合中，元素类型为String类型
        MyArrayList<String> list = new MyArrayList<>();
        //此时添加元素时，只能添加String类型
        list.add("张三");
        list.add("李四");
        System.out.println(list);
        //2.确定MyArrayList集合中，元素类型为Integer类型
        MyArrayList<Integer> list1 = new MyArrayList<>();
        //此时添加元素时，只能添加String类型
        list1.add(100);
        list1.add(200);
        System.out.println(list1);
        System.out.println(list.toString());//包名+类名+@十六进制哈希值
    }
}
