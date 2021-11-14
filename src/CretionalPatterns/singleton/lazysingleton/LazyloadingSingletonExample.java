package CretionalPatterns.singleton.lazysingleton;

public class LazyloadingSingletonExample {

    private static LazyloadingSingletonExample instance;

    private static int count;
    private String name;

    private LazyloadingSingletonExample() {
        count++;
        name = "Lazy Singleton" + count;
    }

    public static LazyloadingSingletonExample getInstance() {
        if (instance == null) {
            instance = new LazyloadingSingletonExample();
        }
        return instance;
    }

    public void printName() {
        System.out.println(name);
    }

}
