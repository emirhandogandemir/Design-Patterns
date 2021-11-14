package CretionalPatterns.singleton.lazysingleton;

public class LazySingleton {

  // Lazy Loading singletonun problemi ise multithread ortamlarda probleme yol açmasıdır
    // null kontrolünü birden fazla kanalın yapması birden fazla singleton nesnesinin oluşmasına yol açar
    private static LazySingleton instance;

    private LazySingleton(){

    }

    private static LazySingleton getInstance(){
        if(instance ==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
