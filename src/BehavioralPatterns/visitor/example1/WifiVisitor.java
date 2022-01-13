package BehavioralPatterns.visitor.example1;

public class WifiVisitor implements IVisitor{
    @Override
    public void visit(Tablet tablet) {
        if(tablet instanceof IPad){
            System.out.println("Ipad wifi has open");
        }else if(tablet instanceof GalaxyTab){
            System.out.println("Galaxy does not have wifi option");
        }else{
            System.out.println("This object is not a tablet");
        }
    }
}
