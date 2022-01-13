package BehavioralPatterns.visitor.example1;

public class ThreeGVisitor implements IVisitor{
    @Override
    public void visit(Tablet tablet) {
        if (tablet instanceof IPad){
            System.out.println("Ipad wifi does not have 3g option");
        }else if(tablet instanceof GalaxyTab){
            System.out.println("galaxytab 3g has open");

        }else {
            System.out.println("this object is not a tablet");
        }
    }
}
