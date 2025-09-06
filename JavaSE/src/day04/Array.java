package day04;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5};
        System.out.println(arr[0]);

        String[] arr1 = {"1","2","3","4","5"};
        System.out.println(arr1[0]);
//      数组也是引用数据类型 创建需要new对象也可以直接写{}

//      1  静态初始化
        int[] arr2 = new int[]{1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};
//      2  数组长度
        System.out.println(arr2.length);
//      3  数组动态初始化 只需指定元素类型和元素长度即可
        int[] arr4 = new int[4];

    }
}
