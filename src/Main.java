public class Main {
    public static void main(String[] args) throws Exception{

        System.out.println("Hello world!");
        /*
        * Thread created using lambda expression
        *
        * */
        Counter c=new Counter();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++)c.increment();
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++)c.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);

        /*
        *
        * Thread created by extending Thread class or implementing Runnable Interface
        * */
        MyThread m1=new MyThread(c);
        //Thread t3=new Thread(m1);
        MyThread m2=new MyThread(c);

       // Thread t4=new Thread(m2);
        m1.start();
        m2.start();
        m1.join();
        m2.join();
        System.out.println(c.count);


    }
}