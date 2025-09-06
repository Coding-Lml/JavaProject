package day19.ThreadCreate;
//第二种创建线程方法

//1.定义实现类实现Runnable接口
public class MyThread2 implements Runnable{
    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程输出："+ i);
        }
    }
}
class Test1{
    public static void main(String[] args) {
        //3.创建实现类的对象
        MyThread2 target = new MyThread2();
        //4.把实现类对象交给一个线程对象处理
        new Thread(target).start();
        /*
        * / 简化形式1：
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("子线程2输出：" + i);
                }
            }
        }).start();

        // 简化形式2：
        new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("子线程3输出：" + i);
                }
        }).start();
        * */


        for (int i = 0; i < 10; i++) {
            System.out.println("主线程："+i);
        }
    }
}
