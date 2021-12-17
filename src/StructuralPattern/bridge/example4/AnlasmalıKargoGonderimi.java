package StructuralPattern.bridge.example4;

public class AnlasmalıKargoGonderimi extends KargoGonder{

    public AnlasmalıKargoGonderimi(KargoService kargoService) {
        super(kargoService);
    }

    @Override
    public void gonder() {
        kargoService.kargoGonder(gonderen,alici);
    }
}
