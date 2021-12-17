package StructuralPattern.bridge.example3;

public class DbRefinedAbstraction extends DbAbstraction{


    public DbRefinedAbstraction(DbImplementor dbImplementor) {
        super(dbImplementor);
    }

    @Override
    public void execute(String sql) {
        dbImplementor.execute(sql);
    }

    @Override
    public void conOpen(String conStr) {
    dbImplementor.openCon(conStr);
    }
}
