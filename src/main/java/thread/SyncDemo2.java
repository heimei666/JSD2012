package thread;

/**
 * 有效的缩小同步范围可以在保证并发安全的前提下提高并发的效率。
 * 同步块：
 * synchronized（同步监视器对象）{
 *     需要多线程同步执行的代码片段
 * }
 * 同步块可以更准确的锁定需要同步执行的代码片段。
 *
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    /*
        在方法上使用synchronized时，指定的同步监视器对象就是this。
     */
//    public synchronized void buy(){
    public void buy(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在挑衣服...");
            Thread.sleep(5000);
            /*
                同步块要求指定同步监视器对象，即：上锁的对象
                该对象可以是java中任何引用类型的实例，可结合将来实际开发情况选择。
                只要保证一点：多个需要同步执行该代码片段的线程看到的该对象是同一个即可。
             */
            synchronized (this){
//                synchronized (new Object){//无效！没有同步效果！
                System.out.println(t.getName()+":正在试衣服...");
                Thread.sleep(5000);
            }

            System.out.println(t.getName()+":结账离开!");
        } catch (InterruptedException e) {
        }
    }
}