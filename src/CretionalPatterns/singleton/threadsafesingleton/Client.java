package CretionalPatterns.singleton.threadsafesingleton;

public class Client extends Thread{
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Client().start();
        }
    }
    public void run(){
        ThreadSafeLazySingletonExample instance = ThreadSafeLazySingletonExample.getInstance();
        instance.printName();
    }
}
