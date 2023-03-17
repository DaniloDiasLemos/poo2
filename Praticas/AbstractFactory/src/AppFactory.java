import java.util.Scanner;

public class AppFactory {

    public static ClientApp configureApp() {
        CarroFactory carroFactory;
        ClientApp clientApp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja criar um carro de qual marca: 1 - Ford ; 2 - Tesla ; 3 - Fiat");
        int i = sc.nextInt();

        sc.close();

        switch (i) {
            case 1:
                carroFactory = new CarroFordFactory();
                break;

            case 2:
                carroFactory = new CarroTeslaFactory();
                break;

            case 3:
                carroFactory = new CarroFiatFactory();
                break;

            default:
                carroFactory = new CarroFordFactory();
                break;
        }

        clientApp = new ClientApp(carroFactory);

        return clientApp;
    }

    public static void main(String[] args) throws Exception {
        ClientApp app = configureApp();
        app.carroCriado();
    }
}
