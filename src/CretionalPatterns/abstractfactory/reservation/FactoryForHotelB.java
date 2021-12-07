package CretionalPatterns.abstractfactory.reservation;

public interface FactoryForHotelB {
    Musteri createMusteri();
    Oda createOda();
    Rezervasyon createRezervasyon();
    Odeme createOdeme();
}
