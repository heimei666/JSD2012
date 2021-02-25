package thread;

/**
 * sleep方法要求必须处理中断异常。（Thread还提供来了其他会导致线程阻塞的方法，很多都要求处理
 * 这个异常，情况是一样的。）
 *
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中此时该线程的interrupt方法被调用时，会中断
 * 这个阻塞过程，此时该方法会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林：刚美完容，睡一会吧...");
                try {
                    Thread.sleep(100000000);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢！干嘛呢！干嘛呢！都破了相了！");
                }
                System.out.println("林：醒了！");
            }
        };
        Thread huang = new Thread(){
            public void run(){
                System.out.println("黄：大锤80！小锤40！开始砸墙！");
                for (int i = 0; i < 5; i++) {
                    System.out.println("黄：80！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("咣当！");
                System.out.println("黄：搞定！");
                lin.interrupt();//中断lin线程的睡眠阻塞
            }
        };
        lin.start();
        huang.start();
    }
}
