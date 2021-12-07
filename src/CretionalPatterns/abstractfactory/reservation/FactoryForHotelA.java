package CretionalPatterns.abstractfactory.reservation;

public interface FactoryForHotelA {
    Musteri createMusteri();
    Oda createOda();
    Rezervasyon createRezervasyon();
    Odeme createOdeme();
}
