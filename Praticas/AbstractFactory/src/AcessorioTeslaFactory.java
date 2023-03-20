public class AcessorioTeslaFactory implements AcessorioFactory{
    
    @Override
    public Acessorio createAcessorio() {
        return new AcessorioTesla();
    }
}
