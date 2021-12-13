package StructuralPattern.adapter.adapterexample1;

import java.util.Scanner;

public class Client {
    public void odenecekMeblayıHesapla(ITutarHesaplayici tutarHesaplayici){
        System.out.println("Lütfen fiyatı giriniz");
        Scanner scanner = new Scanner(System.in);
        double fiyat = scanner.nextDouble();
        System.out.println("lÜTFEN miktarı giriniz");
        Scanner scanner1 = new Scanner(System.in);
        int miktar = scanner1.nextInt();
        System.out.println(tutarHesaplayici.Hesapla(fiyat,miktar));
        System.out.println(" ");
    }
}
