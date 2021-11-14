package CretionalPatterns.singleton.threadsafesingleton;

import CretionalPatterns.singleton.lazysingleton.LazySingleton;

public class ThreadSafeLazySingleton {

    private static volatile ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton(){

    }

    private static ThreadSafeLazySingleton getInstance(){

      synchronized (ThreadSafeLazySingleton.class){
          if(instance ==null){
              instance = new ThreadSafeLazySingleton();
          }
      }
        return instance;
    }
}
