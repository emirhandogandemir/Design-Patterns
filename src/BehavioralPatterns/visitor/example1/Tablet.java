package BehavioralPatterns.visitor.example1;

public abstract class Tablet {
    private String model;
    private String marka;

    public Tablet(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public abstract void Accept(IVisitor visitor);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
