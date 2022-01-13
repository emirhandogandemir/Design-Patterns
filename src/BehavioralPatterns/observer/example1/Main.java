package BehavioralPatterns.observer.example1;

public class Main {
    public static void main(String[] args) {
        AbsUrun absUrun = new Product1(100,"şeker portakalı");
        absUrun.getUyeList().add(new Uye("emirhandgndmrægmail.com"));
        absUrun.getUyeList().add(new Uye("hasan@gmail.com"));
        absUrun.setFiyat(90);

    }
}
