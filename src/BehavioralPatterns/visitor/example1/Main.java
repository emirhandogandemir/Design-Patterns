package BehavioralPatterns.visitor.example1;

public class Main {
    public static void main(String[] args) {
        IPad iPad = new IPad("Ipad mini","Apple");
        GalaxyTab galaxyTab = new GalaxyTab("Galaxy Tab","Samsung");
        iPad.Accept(new WifiVisitor());
        galaxyTab.Accept(new WifiVisitor());

        iPad.Accept(new ThreeGVisitor());
        galaxyTab.Accept(new ThreeGVisitor());
    }
}
