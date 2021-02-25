package thread;

/**
 *  线程提供了一个方法：
 *  void join（）
 *  该方法允许一个线程在另一个线程上等待，直到该线程结束后才会结束等待进行自己后续操作。
 *  例如：
 *  A，B是两条线程
 *  当A线程调用B.join（）后，A线程处于阻塞状态，直到B线程结束，A线程才能解除阻塞执行join
 *  方法后续代码。
 *  join方法可以协调线程的同步运行。
 *  同步运行：多个线程执行存在先后顺序执行。
 *  异步运行：多个线程各干各的，线程之间本身就是异步允许的。
 */
public class JoinDemo {
    private static boolean isFinish = false;//表示图片是否下载完毕的状态
    public static void main(String[] args) {
        /*
            一个方法的局部内部类中若引用了这个方法的其他局部变量，这个变量必须被声明
            为final的（JDK8之后，可以不再显示的使用final关键字修饰这个局部变量，但是
            如果该方法的其他局部变量引用时，它仍然是final的）
         */
//        final boolean isFinish = false;
        Thread download = new Thread(){
            public void run(){
                System.out.println("down:开始下载图片...");
                for (int i = 1; i <=100; i++) {
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("down：图片下载完毕！");
                isFinish = true;
            }
        };
        Thread show = new Thread(){
            public void run(){
                /*
                    show线程与download线程启动后时并发运行的。
                    其中show线程中显示文字的工作是可以和download同时运行的。
                 */
                System.out.println("show:开始显示文字...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println("show:显示文字完毕！");
                //但是显示图片这件事必须等待download执行完毕（图片下载完毕）再进行！
                //阻塞show线程，直到download执行完毕后再进行后续工作
                try {
                    System.out.println("show:开始等待download下载图片...");
                    download.join();//使show线程排在download后面等待其完成
                    System.out.println("show：等待download完毕！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println("show：开始显示图片...");
                if (!isFinish){
                    //当一个异常抛出到线程任务的run方法之外时，这个线程就会结束。
                    throw new RuntimeException("图片加载失败！");
                }
                System.out.println("show:图片显示完毕！");
            }
        };
        download.start();
        show.start();

    }
}
