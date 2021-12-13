package StructuralPattern.adapter.adapterexample1;

import java.util.Scanner;

public class Adaptee {
    public double IskontoluTutarıHesapla(double fiyat,double adet){
        System.out.println("Lütfen iskonto miktarını giriniz");
        Scanner iskonto = new Scanner(System.in);
        int iskontoTutarı = iskonto.nextInt();
        return fiyat*adet*(1-iskontoTutarı);
    }
}
