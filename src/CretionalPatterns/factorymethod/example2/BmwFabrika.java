package CretionalPatterns.factorymethod.example2;

import java.util.ArrayList;

public class BmwFabrika extends ArabaFabrika{

    @Override
    public void createAuto() {
        getArabaListesi().add(new Z4(170));
    }
}
