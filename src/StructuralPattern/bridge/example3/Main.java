package StructuralPattern.bridge.example3;

public class Main {
    public static void main(String[] args) {
        DbAbstraction dbAbstraction = new DbRefinedAbstraction(new SqlServerImpl());
        dbAbstraction.conOpen("e-ticaret db");
        dbAbstraction.execute("select * from Urun");
        dbAbstraction = new DbRefinedAbstraction(new OracleImplementor());
        dbAbstraction.conOpen("e-ticaret db");
        dbAbstraction.execute("select * from urun");

    }
}
