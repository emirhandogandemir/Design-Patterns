package StructuralPattern.facade.example2;



public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer(11122,"Ahmet","1000012020",982382983.12);
        Customer customer2= new Customer(145122,"Hasan","1000232020",982382983.12);

        Facade facade = new Facade();
        facade.sendEft(customer1,customer2,12134);
        facade.useCredit(customer2);

    }
}
