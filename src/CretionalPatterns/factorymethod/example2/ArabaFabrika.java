package CretionalPatterns.factorymethod.example2;

import java.util.ArrayList;

public abstract class ArabaFabrika {
    private ArrayList<Araba> arabaListesi = new ArrayList<Araba>();

    public ArabaFabrika() {
        this.createAuto();
    }
    public abstract void createAuto();

    public ArrayList<Araba> getArabaListesi(){
        return arabaListesi;
    }

    public void setArabaListesi(ArrayList<Araba> arabaListesi) {
        this.arabaListesi = arabaListesi;
    }
}
