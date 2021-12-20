package StructuralPattern.facade.example3;

public class Test {
    public static void main(String[] args) {

        Facade facade = new Facade("Antalya", "ankara", "business");
        facade.rezervasyonYap();

    }
}
