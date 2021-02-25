package thread;

/**
 * java中所有的代码都是靠线程运行的，main方法也不例外。运行main方法的线程是系统创建的
 * 并且起名为main。我们自己定义的线程如果不指定名字，默认叫Thread-X.X是一个数字，从0开始。
 *
 * static Thread currentThread（）
 * 线程提供了一个静态方法currentThread，可以获取运行这个方法的线程。
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        //获取运行main方法的线程
        Thread main = Thread.currentThread();
        System.out.println("运行main方法的线程是："+main);
        //让主线程调用dosome方法，进去该方法执行其中代码
        dosome();
        //让主线程再创建一条线程，并将其启动，与主线程并发运行
        Thread t = new Thread(){
            public void run(){
                //获取的就是自定义线程
                Thread t = Thread.currentThread();
                System.out.println("自定义线程："+t);
                dosome();
                for (int i = 0; i < 1000; i++) {
                    System.out.println(t+"循环"+i+"次");
                }
                System.out.println(t+"线程结束");
            }
        };
        t.start();//t线程一旦start后，该线程中的run方法就和main方法下面的代码并发运行了
        for (int i = 0; i < 1000; i++) {
            System.out.println(main+"循环"+i+"次");
        }
        System.out.println("main方法执行完毕，主线程结束。");
    }
    public static void dosome(){
        //获取运行dosome方法的线程
        Thread t = Thread.currentThread();
        System.out.println("运行dosome方法的线程是："+t);
    }
}
