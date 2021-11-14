package CretionalPatterns.singleton.singleton;

public class Client {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Singleton1Example singleton1Example = Singleton1Example.getInstance();
            singleton1Example.printName();
        }

        Singleton1Example s1 = Singleton1Example.getInstance();
        Singleton1Example s2 = Singleton1Example.getInstance();

        if (s1==s2){
            System.out.println("The same object !");
        }
        else System.out.println("different object");
    }
}
