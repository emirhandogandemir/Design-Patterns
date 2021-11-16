package CretionalPatterns.factorypattern.example2;

public class BmwFabrika extends ArabaFabrika{

    @Override
    public void createAuto() {
        getArabaListesi().add(new Z4(170));
    }
}
