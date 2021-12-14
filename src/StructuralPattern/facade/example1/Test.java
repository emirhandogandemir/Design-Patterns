package StructuralPattern.facade.example1;

public class Test {

    public static void main(String[] args) {
        Sistem2Operations sistem2Operations = new Sistem2Operations();
        Sistem1Kontrol sistem1Kontrol = new Sistem1Kontrol();
        TcKimlikSistem tcKimlikSistem = new TcKimlikSistem();
        Facade facade = new Facade(sistem1Kontrol,sistem2Operations,tcKimlikSistem);
        facade.sistemUyeEkle("12344556");

    }
}
