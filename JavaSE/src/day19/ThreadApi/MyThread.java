package day19.ThreadApi;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name); //1.执行父类Thread(String name)构造器，为当前线程设置名字了
    }
    public MyThread(){

    }
    @Override
    public void run() {
        //2.currentThread() 哪个线程执行它，它就会得到哪个线程对象。
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            //3.getName() 获取线程名称
            System.out.println(t.getName() + "输出：" + i);
        }
    }
}

class test{
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("1号线程"); //设置线程名称;
        t1.start();
        System.out.println(t1.getName());  //Thread-0

        Thread t2 = new MyThread("2号线程");
        // t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); // Thread-1

        // 主线程对象的名字
        // 哪个线程执行它，它就会得到哪个线程对象。
        Thread m = Thread.currentThread();
        m.setName("最牛的线程");
        System.out.println(m.getName()); // main

        for (int i = 1; i <= 5; i++) {
            System.out.println(m.getName() + "线程输出：" + i);
        }
    }
}

class test1{
    public static void main(String[] args) throws InterruptedException {
        // join方法作用：让当前调用这个方法的线程先执行完。
        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();
    }
}