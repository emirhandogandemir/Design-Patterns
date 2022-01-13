package BehavioralPatterns.visitor.example2;

public abstract class IVisitor {

private String output="";
private String Output;

    public String getOutput() {
        return Output;
    }

    public void setOutput(String output) {
        Output = output;
    }

    public abstract void Visit(PlainText plainText);
    public abstract void Visit(BoldText boldText);
    public abstract void Visit(HyperLink hyperLink);

}
