public class ClientApp {
    private Carro carro;

    public ClientApp(CarroFactory carroFactory) {
        carro = carroFactory.createCarro();
    }

    public void carroCriado() {
        carro.criado();
    }
}
