package CretionalPatterns.singleton.singleton;

public class Singleton1 {
    // Bu şekilde singleton1 nesnesi sınıf yüklenirken oluşturuluyor . Static alanlar sınıf yüklenirken yüklenirler . Eager Loading
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }

}
