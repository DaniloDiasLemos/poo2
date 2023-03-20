public class AcessorioFordFactory implements AcessorioFactory{
    
    @Override
    public Acessorio createAcessorio() {
        return new AcessorioFord();
    }
}
