package thread;

/**
 * 多线程并发的安全问题
 * 当多个线程并发操作同一临界资源，由于线程切换时机不确定，导致执行操作的顺序混乱，出现和
 * 程序设计执行结果不同的情况。严重时可能导致系统瘫痪。
 *
 * 临界资源：操作过程同时只能被单一线程完整执行的资源。
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Table{
    private int beans = 20;//桌子上有20个豆子

    /**
     * 当一个方法使用关键字synchronized修饰后，这个方法称为同步方法。
     * 即：多个线程不能同时在该方法内部执行。
     * 将操作临界资源的执行过程从多线程并发操作改为同步有先后顺序的排队执行可以解决
     * 并发安全问题
     */
    public synchronized int getBean(){
        if (beans==0){
            throw new RuntimeException("没有豆子了！");
        }
        //当判断完毕，且在进行下面的--操作之前发生线程切换可能出现并发安全问题
        Thread.yield();//主动放弃执行该方法的线程的剩余时间片，模拟到这里没时间发生线程切换
        return beans--;
    }
}