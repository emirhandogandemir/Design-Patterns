package CretionalPatterns.factory;

/*

Genel bir araba fabrikasını tanımlar . Soyut olduğu için bu sınıftan nesneler oluşturulamaz . Belirli bir marka ve modelini üretebilmek için bu sınıfın
altsınıfı oluşturulması gerekmektedir
 */

import java.util.ArrayList;

public abstract class CarFactory {
    /*
    Bir araba fabrikasının ürettiği değişik modeldeki arabaların içinde yer aldığı liste
     */
    private ArrayList<Car> carList = new ArrayList<Car>();
    /*
    Alt sınıflarda bir fabrikanın (nesnenin) oluşturulması ile beraber , createAuto() metodu işleme girer , yani fabrika araba üretime başlamış olur
     */
    public CarFactory() {
        createAuto();
    }
    /*
    Alt sınıflar tarafından implemente edilir . Belirli bir marka ve modelin oluşturulmasında kullanılır
     */
    public abstract void createAuto();

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(final ArrayList<Car> carList) {
        this.carList = carList;
    }

}
