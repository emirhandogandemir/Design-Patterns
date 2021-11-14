package CretionalPatterns.singleton.threadsafesingleton;

public class ThreadSafeLazySingletonExample {
    private static volatile ThreadSafeLazySingletonExample instance;

    private static int count;

    private String name;

    private ThreadSafeLazySingletonExample() {
        count++;
        name = "Thread SafeLazySingleton " + count;
    }

    public static ThreadSafeLazySingletonExample getInstance() {
        synchronized (ThreadSafeLazySingletonExample.class) {
            if (instance == null) {

                instance = new ThreadSafeLazySingletonExample();
            }
            return instance;
        }
    }

    public void printName() {
        System.out.println(name);
    }


}
