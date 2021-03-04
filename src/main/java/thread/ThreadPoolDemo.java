package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池是线程的管理机制，主要解决两个问题：
 * 1：重用线程。
 * 2：控制线程数量
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建一个容量为2的固定大小线程池。池内线程数量就2个。
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread t = Thread.currentThread();//获取运行该任务的线程
                        System.out.println(t+"：正在执行任务...");
                        Thread.sleep(5000);
                        System.out.println(t+"：执行任务完毕！");
                    }catch (Exception e){

                    }
                }
            };
            threadPool.execute(r);//将任务指派给线程池
        }
//        threadPool.shutdownNow();
        threadPool.shutdown();
        System.out.println("线程池停止了");
    }
}
