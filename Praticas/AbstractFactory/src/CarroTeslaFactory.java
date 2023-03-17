public class CarroTeslaFactory implements CarroFactory{
    
    @Override
    public Carro createCarro() {
        return new CarroTesla();
    }
}
