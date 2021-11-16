package CretionalPatterns.factorymethod.example2;

import java.util.ArrayList;

public class AudiFabrika extends ArabaFabrika{

    @Override
    public void createAuto() {
        getArabaListesi().add(new R8(130));
        getArabaListesi().add(new Z4(452));
    }
}
