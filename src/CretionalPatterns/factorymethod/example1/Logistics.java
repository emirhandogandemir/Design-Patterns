package CretionalPatterns.factorymethod.example1;

public abstract class Logistics {
    public String planDelivery(){
        return "Logictic planı";
    }

    public abstract Transport getTransport();

}
