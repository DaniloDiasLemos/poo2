public class CarroFiatFactory implements CarroFactory{
    
    @Override
    public Carro createCarro() {
        return new CarroFiat();
    }
}
