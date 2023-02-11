public class Producer implements Runnable{

    Query query;
    //object instantiation will start the thread
    Producer(Query query){
        this.query=query;
        Thread t2=new Thread(this,"Producer");
        t2.start();
    }

    public void run(){

        for(int i=0;i<10;i++)query.setData(i);
    }
}
