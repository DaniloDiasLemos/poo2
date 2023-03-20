import java.util.Scanner;

public class AppFabrica {

    public static ClientApp configureApp() {
        CarroFactory carroFactory;
        MotorFactory motorFactory;
        AcessorioFactory acessorioFactory;
        ClientApp clientApp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja criar um carro de qual marca: 1 - Ford ; 2 - Tesla ; 3 - Fiat");
        int i = sc.nextInt();

        sc.close();

        switch (i) {
            case 1:
                carroFactory = new CarroFordFactory();
                motorFactory = new MotorFordFactory();
                acessorioFactory = new AcessorioFordFactory();
                break;

            case 2:
                carroFactory = new CarroTeslaFactory();
                motorFactory = new MotorTeslaFactory();
                acessorioFactory = new AcessorioTeslaFactory();
                break;

            case 3:
                carroFactory = new CarroFiatFactory();
                motorFactory = new MotorFiatFactory();
                acessorioFactory = new AcessorioFiatFactory();
                break;

            default:
                carroFactory = new CarroFordFactory();
                motorFactory = new MotorFordFactory();
                acessorioFactory = new AcessorioFordFactory();
                break;
        }

        clientApp = new ClientApp(carroFactory, motorFactory, acessorioFactory);

        return clientApp;
    }

    public static void main(String[] args) throws Exception {
        ClientApp app = configureApp();
        app.carroCriado();
    }
}
