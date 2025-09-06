package day20.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    ExecutorService pool = new ThreadPoolExecutor(
            3,	//核心线程数有3个
            5,  //最大线程数有5个。   临时线程数=最大线程数-核心线程数=5-3=2
            8,	//临时线程存活的时间8秒。 意思是临时线程8秒没有任务执行，就会被销毁掉。
            TimeUnit.SECONDS,//时间单位（秒）
            new ArrayBlockingQueue<>(4), //任务阻塞队列，没有来得及执行的任务在，任务队列中等待
            Executors.defaultThreadFactory(), //用于创建线程的工厂对象
            new ThreadPoolExecutor.CallerRunsPolicy() //拒绝策略
    );
}
