package CretionalPatterns.singleton.doublecheckingsingleton;

public class DoubleCheckedLockingExample {

    private static volatile DoubleCheckedLockingExample instance;
    private static int count;
    private String name;

    private DoubleCheckedLockingExample() {
        count++;
        name = "DoubleChecked" + count;
    }

    public static DoubleCheckedLockingExample getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingExample.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingExample();
                }
            }
        }
        return instance;
    }

    public void printName() {
        System.out.println(name);
    }
}
