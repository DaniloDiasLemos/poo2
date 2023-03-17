public class CarroFordFactory implements CarroFactory{
    
    @Override
    public Carro createCarro() {
        return new CarroFord();
    }
}
