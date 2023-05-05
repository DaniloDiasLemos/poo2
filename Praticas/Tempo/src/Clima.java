import java.util.Scanner;

public class Clima {
    public static void main(String[] args) throws Exception {
        PrevisaoTempo previsaoTempo = new PrevisaoTempo(21, 50, false, 10);
        Jornal jornal = new Jornal(21, 50, false, 10);
        Aeroporto aeroporto = new Aeroporto(21, 50, false, 10);
        Agricultor agricultor = new Agricultor(21, 50, false, 10);
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1 - Adicionar observador");
            System.out.println("2 - Remover observador");
            System.out.println("3 - Executar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nQual observador deseja adicionar?");
                    System.out.println("1 - Jornal");
                    System.out.println("2 - Aeroporto");
                    System.out.println("3 - Agricultor");
                    int observer = sc.nextInt();
                    switch (observer) {
                        case 1:
                            previsaoTempo.addObserver(jornal);
                            System.out.println("\nJornal adicionado como observador.\n");
                            break;
                        case 2:
                            previsaoTempo.addObserver(aeroporto);
                            System.out.println("\nAeroporto adicionado como observador.\n");
                            break;
                        case 3:
                            previsaoTempo.addObserver(agricultor);
                            System.out.println("\nAgricultor adicionado como observador.\n");
                            break;
                        default:
                            System.out.println("\nObservador inválido. Escolha um dos 3 observadores.\n");
                    }
                    break;
                case 2:
                    System.out.println("\nQual observador deseja remover?");
                    System.out.println("1 - Jornal");
                    System.out.println("2 - Aeroporto");
                    System.out.println("3 - Agricultor");
                    int observer2 = sc.nextInt();
                    switch (observer2) {
                        case 1:
                            previsaoTempo.removeObserver(jornal);
                            System.out.println("\nJornal removido como observador.\n");
                            break;
                        case 2:
                            previsaoTempo.removeObserver(aeroporto);
                            System.out.println("\nAeroporto removido como observador.\n");
                            break;
                        case 3:
                            previsaoTempo.removeObserver(agricultor);
                            System.out.println("\nAgricultor removido como observador.\n");
                            break;
                        default:
                            System.out.println("\nObservador inválido. Escolha um dos 3 observadores.\n");
                    }
                    break;
                case 3:
                    while (true) {
                        previsaoTempo.mudarEstado();
                        Thread.sleep(5000);
                    }
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        } while (opcao != 0);
        sc.close();
    }
}
