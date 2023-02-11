public class Consumer implements Runnable{

    Query query;
    Consumer(Query query){
        this.query=query;
        Thread t1=new Thread(this,"Producer");
        t1.start();
    }

    public void run(){

        for(int i=0;i<10;i++)query.getData();
    }
}
