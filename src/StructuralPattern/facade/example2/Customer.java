package StructuralPattern.facade.example2;

public class Customer {

    private int customerNumber;

    private String fullName;

    private String idNo;

    private double cashAmount;


    public Customer(int customerNumber, String fullName, String idNo, double cashAmount) {
        this.customerNumber = customerNumber;
        this.fullName = fullName;
        this.idNo = idNo;
        this.cashAmount = cashAmount;
    }

    public Customer(){

    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }
}
