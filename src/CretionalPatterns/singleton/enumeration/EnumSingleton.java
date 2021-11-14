package CretionalPatterns.singleton.enumeration;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {

    SINGLETON;

    private EnumSingleton(){
        System.out.println("in EnumSingleton Object");
    }
    public static EnumSingleton getInstance(){
        return SINGLETON;
    }

}
