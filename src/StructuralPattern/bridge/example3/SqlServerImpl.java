package StructuralPattern.bridge.example3;

public class SqlServerImpl extends DbImplementor{
    @Override
    public void execute(String sql) {
        System.out.println("sql server işletildi"+ sql);
    }

    @Override
    public void openCon(String sqlCon) {
        System.out.println("sql server con açıldı"+sqlCon);
    }
}
