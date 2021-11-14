package CretionalPatterns.singleton.singleton;

public class Singleton1Example {
    private static Singleton1Example singleton1Example = new Singleton1Example();

    private static int count;
    private String name;

    private Singleton1Example(){
        count ++;
        name ="Singleton " +count;
    }
    public static Singleton1Example getInstance(){
        return singleton1Example;
    }
    public void printName(){
        System.out.println(name);
    }
}
