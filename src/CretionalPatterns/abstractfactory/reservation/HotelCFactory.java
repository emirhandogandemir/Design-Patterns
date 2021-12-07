package CretionalPatterns.abstractfactory.reservation;

public class HotelCFactory implements FactoryForHotelC{
    @Override
    public Musteri createMusteri() {
        return new Musteri();
    }

    @Override
    public Oda createOda() {
        return new Oda();
    }

    @Override
    public Rezervasyon createRezervasyon() {
        return new Rezervasyon();
    }

    @Override
    public Odeme createOdeme() {
        return new Odeme();
    }
}
