package CretionalPatterns.builder.example1;

public class FordSiparisBuilder extends SiparisBuilder {
    @Override
    public void setMarka(String marka) {
        getAraba().setMarka(new Marka(marka));
    }

    @Override
    public void setModel(String model) {
        getAraba().setModel(new Model(model));
    }

    @Override
    public void setRenk(String renk) {
        getAraba().setRenk(renk);
    }

    @Override
    public void setBeygirgucu(int bg) {
        getAraba().setBeygirGucu(bg);
    }
}
