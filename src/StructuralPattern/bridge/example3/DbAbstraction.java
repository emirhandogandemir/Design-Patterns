package StructuralPattern.bridge.example3;

public abstract class DbAbstraction {

    protected DbImplementor dbImplementor;

    public DbAbstraction(DbImplementor dbImplementor) {
        this.dbImplementor = dbImplementor;
    }

    public void setDbImplementor(DbImplementor dbImplementor) {
        this.dbImplementor = dbImplementor;
    }

    public abstract void execute(String sql);
    public abstract void conOpen(String conStr);
}
