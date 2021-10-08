package CretionalPatterns;

import CretionalPatterns.factory.AudiFactory;
import CretionalPatterns.factory.BmwFactory;
import CretionalPatterns.factory.Car;
import CretionalPatterns.factory.CarFactory;

public class Main {
    public static void main(String[] args) {
        /*
        Bmw marka araçların üretildiği bir fabrika üretiyoruz
         */
        CarFactory bmw = new BmwFactory();

        /*
        Audi marka araçların üretildiği bir fabrika üretiyoruz
        */
        CarFactory audi = new AudiFactory();

        for (final Car car : bmw.getCarList()) {
            System.out.println(car.getBrand() + " " + car.getModel() + "," + car.getPower());
        }

        for (final Car car : audi.getCarList()) {
            System.out.println(car.getBrand() + " " + car.getModel() + "," + car.getPower());
        }
    }
}
