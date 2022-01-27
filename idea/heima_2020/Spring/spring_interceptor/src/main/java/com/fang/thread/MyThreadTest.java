package com.fang.thread;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadTest {
    public static void main(String[] args) {
        //初始化只有一个线程的线程池
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        //指定线程数的线程池
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        //线程池大小完全依赖于操作系统
        //ExecutorService executorService = Executors.newCachedThreadPool();
//        for (int i = 1; i <= 10; i++) {
//            executorService.execute(new MyThread(i));
//        }
//        executorService.shutdown();


//        ScheduledThreadPoolExecutor atpe = new ScheduledThreadPoolExecutor(4);//设置线程个数
//        for (int i =1; i <= 5; i++) {
//            atpe.execute(new ScheduledThread(i));//普通的提交方式，只提交一次，执行结束，线程不会退出。
//        }

        ScheduledThreadPoolExecutor atpe = new ScheduledThreadPoolExecutor(4);//设置线程个数
        for (int i = 0; i < 5; i++) {
            //参数1：initialDelay表示首次执行任务的延迟时间，参数2：period表示每次执行任务的间隔时间，参数3：TimeUnit.MILLISECONDS执行的时间间隔数值单位
            atpe.scheduleAtFixedRate(new ScheduledThread(i),1000,2000, TimeUnit.MILLISECONDS);//以固定频率重复执行线程
        }

    }
}
