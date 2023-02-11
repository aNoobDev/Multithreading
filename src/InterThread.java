public class InterThread {

    public static void main(String[] args) {
        Query q=new Query();
        new Producer(q);
        new Consumer(q);
    }
}
