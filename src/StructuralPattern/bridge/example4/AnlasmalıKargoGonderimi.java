package StructuralPattern.bridge.example4;

public class Anlasmal─▒KargoGonderimi extends KargoGonder{

    public Anlasmal─▒KargoGonderimi(KargoService kargoService) {
        super(kargoService);
    }

    @Override
    public void gonder() {
        kargoService.kargoGonder(gonderen,alici);
    }
}
