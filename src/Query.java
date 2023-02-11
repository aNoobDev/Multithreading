public class Query {

    int data;
    boolean setData=false;

    public synchronized void getData() {
        while(!setData){
            try{
                wait();
            }
            catch(Exception ignored){

            }
        }
        System.out.println("Get "+data);
        setData = false;
        notify();
    }

    public synchronized void setData(int data) {
        while(setData){
            try{
                wait();
            }
            catch(Exception ignored){

            }
        }
        this.data=data;
        System.out.println("Set "+this.data);
        setData = true;
        notify();
    }
}
