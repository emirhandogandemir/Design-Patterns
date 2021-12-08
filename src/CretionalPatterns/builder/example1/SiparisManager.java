package CretionalPatterns.builder.example1;

public class SiparisManager {
    private SiparisBuilder siparisBuilder;

    public Araba createOrder(String marka,String model,String renk,int beygirGucu){
        if (marka.equals("FORD")){
            siparisBuilder = new FordSiparisBuilder();
        }
        else if(marka.equals("AUDI")){
            siparisBuilder = new AudiSiparisBuilder();
        }
        this.siparisBuilder.setMarka(marka);
        this.siparisBuilder.setModel(model);
        this.siparisBuilder.setRenk(renk);
        this.siparisBuilder.setBeygirgucu(beygirGucu);
        return this.siparisBuilder.getAraba();
    }
}
