package day19.ThreadCreate;
/*1.先定义一个Callable接口的实现类，重写call方法
2.创建Callable实现类的对象
3.创建FutureTask类的对象，将Callable对象传递给FutureTask
4.创建Thread对象，将Future对象传递给Thread
5.调用Thread的start()方法启动线程(启动后会自动执行call方法)
   等call()方法执行完之后，会自动将返回值结果封装到FutrueTask对象中
6.调用FutrueTask对的get()方法获取返回结果*/
import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("线程执行：" + Thread.currentThread().getName());
        return 42; // 返回结果
    }
}

public class MyThread3 {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = new MyCallable();
        FutureTask<Integer> future = new FutureTask<>(task);
        Thread t1 = new Thread(future);
        t1.start();

        // 获取返回值（阻塞等待）
        Integer result = future.get();
        System.out.println("返回结果: " + result);
    }
}

