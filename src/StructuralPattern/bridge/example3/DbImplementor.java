package StructuralPattern.bridge.example3;

public abstract class DbImplementor {
    public abstract void execute(String sql);
    public abstract void openCon(String SqlCon);
}
