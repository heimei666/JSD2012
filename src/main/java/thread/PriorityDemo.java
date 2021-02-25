package thread;

/**
 * 线程的优先级
 * 线程有10个优先级，分别是用整数1-10表示。其中1为最低，5为默认，10为最高
 * 当线程start方法执行后，该线程纳入到线程调度器中统一管理。线程只能被动的分配时间片与其他
 * 线程并发执行，而不能主动获取时间片。线程调度器尽可能均匀的分配时间片给每个线程。
 * 改变一个线程的优先级可以最大程度的改善该线程获取时间片的几率。优先级越高获取时间片的次数
 * 月多。
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("min");
                }
            }
        };
        Thread nor = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("nor");
                }
            }
        };
        Thread max = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("max");
                }
            }
        };
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        nor.start();
        max.start();
    }
}
