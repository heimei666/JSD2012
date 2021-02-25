package thread;

/**
 *  守护线程
 *  守护线程是通过普通线程调用setDaemon（boolean on）设置而转变而来的。
 *  因此创建上与普通线程没有区别。主要区别在于结束时机上有一点不同：进程的结束。
 *  当java进程中没有任何普通线程运行时，该进程就会结束，因此会杀死所有正在运行的守护线程。
 *
 *  守护线程一般也称为后台线程。
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("rose:let me go!!!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("rose:啊啊啊啊AAAAAAaaaaaa.....");
                System.out.println("噗通！");
            }
        };
        Thread jack = new Thread(){
            public void run(){
                while (true){
                    System.out.println("jack:you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        rose.start();
        //必须在线程启动之前设置守护线程
        jack.setDaemon(true);
        jack.start();
    }
}
