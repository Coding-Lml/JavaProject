package day11.Generic.MyArrayList;

public class MyArrayList<E> {
    private Object[] array =  new Object[10];
    private static int index;
//    1.添加元素
    public void add(E e) {
        array[index++] = e;
    }
//    2.查找元素
    public E get(int index) {
        return (E) array[index];
    }
}
