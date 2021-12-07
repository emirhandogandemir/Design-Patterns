package CretionalPatterns.abstractfactory.reservation;

public interface FactoryForHotelC {
    Musteri createMusteri();
    Oda createOda();
    Rezervasyon createRezervasyon();
    Odeme createOdeme();

}
