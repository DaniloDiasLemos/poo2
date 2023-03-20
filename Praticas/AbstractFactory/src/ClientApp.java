public class ClientApp {
    private Carro carro;
    private Motor motor;
    private Acessorio acessorio;

    public ClientApp(CarroFactory carroFactory, MotorFactory motorFactory, AcessorioFactory acessorioFactory) {
        carro = carroFactory.createCarro();
        motor = motorFactory.createMotor();
        acessorio = acessorioFactory.createAcessorio();
    }

    public void carroCriado() {
        carro.criado();
        motor.criado();
        acessorio.criado();
    }
}
