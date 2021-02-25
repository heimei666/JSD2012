package thread;

/**
 * 静态方法上如果使用synchronized修饰，那么该方法一定具有同步效果
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        //静态方法与对象无关，只要静态方法有synchronized一定具有同步效果
//        Boo b1 = new Boo();
//        Boo b2 = new Boo();
        Thread t1 = new Thread(){
            public void run(){
//                b1.dosome();
                Boo.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
//                b2.dosome();
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}
class Boo{
    /*
        静态方法上使用synchronized，同步监视器对象为当前类的类对象（Class的实例）
        JVM中每个被加载的类都有且只有一个Class的实例与之对应，静态方法就是锁定该对象。
        Class类对象会在后面反射的知识中介绍
     */
//    public synchronized static void dosome(){
    public static void dosome(){
        /*
            使用同步块时，通常指定的也是当前类的类对象，获取方式为：类名.class
         */
        synchronized (Boo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + "：正在执行dosome方法...");
                Thread.sleep(5000);
                System.out.println(t.getName() + "：执行dosome方法完毕！");
            } catch (InterruptedException e) {
            }
        }
    }
}