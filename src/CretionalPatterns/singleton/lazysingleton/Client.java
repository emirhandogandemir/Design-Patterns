package CretionalPatterns.singleton.lazysingleton;

public class Client extends Thread {

    public static void main(String[] args) {
        // bunda bir sıkıntı olmaz
        /*
        for (int i=0;i<100;i++){
            LazyloadingSingletonExample singleton = LazyloadingSingletonExample.getInstance();
            singleton.printName();
        }
*/
        for (int i = 0; i < 100; i++) {
            new Client().start();
        }
    }

    public void run() {
        LazyloadingSingletonExample instance = LazyloadingSingletonExample.getInstance();
        instance.printName();
    }
}
