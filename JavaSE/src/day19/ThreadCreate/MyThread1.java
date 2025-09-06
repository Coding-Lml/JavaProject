package day19.ThreadCreate;
/* 方法一： 继承Thread类 重写run方法 利用对象的start()方法启动线程
1.定义一个子类继承Thread类，并重写run方法
2.创建Thread的子类对象
3.调用start方法启动线程（启动线程后，会自动执行run方法中的代码）*/
public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程输出"+i);
        }
    }
}
//发现MyThread和main线程在相互抢夺CPU的执行权（哪一个线程先执行，哪一个线程后执行，目前我们是无法控制的，每次输出结果都会不一样）
class test{
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        myThread.start();
//        myThread.run();  不能直接去调用run方法，如果直接调用run方法就不认为是一条线程启动了，而是把Thread当做一个普通对象
//        此时run方法中的执行的代码会成为主线程的一部分。
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程输出:"+i);
        }
    }
}