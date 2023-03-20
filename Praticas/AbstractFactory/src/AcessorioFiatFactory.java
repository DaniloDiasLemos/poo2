public class AcessorioFiatFactory implements AcessorioFactory{
    
    @Override
    public Acessorio createAcessorio() {
        return new AcessorioFiat();
    }
}
