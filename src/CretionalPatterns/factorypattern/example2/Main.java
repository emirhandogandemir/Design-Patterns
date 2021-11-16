package CretionalPatterns.factorypattern.example2;

public class Main {
    public static void main(String[] args) {
        ArabaFabrika arabaFabrika1 = new BmwFabrika();

        ArabaFabrika arabaFabrika2 = new AudiFabrika();

        for (Araba araba : arabaFabrika1.getArabaListesi()){
            System.out.println(
                    araba.getBeygirGucu() + araba.getMarka() + araba.getModel()
            );
        }
        for (Araba araba : arabaFabrika2.getArabaListesi()){
            System.out.println(
                    araba.getBeygirGucu() + araba.getMarka() + araba.getModel()
            );
        }
    }
}
