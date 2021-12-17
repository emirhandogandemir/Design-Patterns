package StructuralPattern.bridge.example3;

public class OracleImplementor extends DbImplementor{

    @Override
    public void execute(String sql) {
        System.out.println("oracle çalıştırıldı"+sql);
    }

    @Override
    public void openCon(String SqlCon) {
        System.out.println("oracle connection açıldı"+SqlCon);
    }
}
