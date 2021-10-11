package CretionalPatterns.factory;

public abstract class Car {
    private String brand ;
    private String model ;
    private int power ;

    public Car(final String brand, final String model, final int power) {
        setBrand(brand);
        setModel(model);
        setPower(power);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(final int power) {
        this.power = power;
    }
}
