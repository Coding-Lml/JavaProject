package day12.Jdk8Date;

import java.time.Instant;

public class instant {
    public static void main(String[] args) {
        // 1、创建Instant的对象，获取此刻时间信息
        Instant now = Instant.now(); // 不可变对象

        // 2、获取总秒数
        long second1 = now.getEpochSecond();
        System.out.println(second1);

        // 3、不够1秒的纳秒数
        int nano = now.getNano();
        System.out.println(nano);
        for (int i = 0; i < 1000000;i++){
            System.out.println(i);
        }
        long second2 = Instant.now().getEpochSecond();
        System.out.println(now.getEpochSecond());
        System.out.println("时间消耗为："+ (second2 - second1) +"s");
        Instant instant = now.plusNanos(111);

        // Instant对象的作用：做代码的性能分析，或者记录用户的操作时间点
        Instant now1 = Instant.now();
        // 代码执行。。。。
        Instant now2 = Instant.now();

    }
}
