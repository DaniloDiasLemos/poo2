import java.util.Scanner;

public class PersonagemApp {

    public static void main(String[] args) {
        PersonagemBuilder builder = new PersonagemBuilder();
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1. Digitar nome");
            System.out.println("2. Selecionar profissão");
            System.out.println("3. Selecionar equipamento");
            System.out.println("4. Selecionar habilidades");
            System.out.println("5. Rolar atributos aleatoriamente");
            System.out.println("6. Exibir detalhes do personagem");
            System.out.println("7. Ir para a aventura!!!!");
            System.out.println("8. Terminar de montar o personagem");
            System.out.print("\nSelecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    builder.setNome(input.next());
                    break;
                case 2:
                    System.out.println("1- mago; 2- guerreiro; 3- Arqueiro");
                    builder.setProfissao(input.nextInt());
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Deseja usar escudo leve, medio ou pesado?");
                    String escudo = input.nextLine();
                    System.out.println("Deseja usar qual arma?");
                    String arma = input.nextLine();
                    System.out.println("Deseja usar armadura leve, medio ou pesado?");
                    String armadura = input.nextLine();
                    System.out.println("Deseja usar amuleto inteligencia, força ou destreza?");
                    String amuleto = input.nextLine();
                    Equipamento equipamento = new Equipamento(escudo, arma, armadura, amuleto);
                    builder.setEquipamento(equipamento);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("Qual sua primeira habilidade?");
                    String hab1 = input.nextLine();
                    System.out.println("Qual sua segunda habilidade?");
                    String hab2 = input.nextLine();
                    System.out.println("Qual sua terceira habilidade?");
                    String hab3 = input.nextLine();

                    Habilidades habilidades = new Habilidades(hab1, hab2, hab3);
                    builder.setHabilidades(habilidades);
                    break;
                case 5:
                    Atributos atributos = new Atributos();
                    builder.setAtributos(atributos);
                    atributos.getAtributos();
                    break;
                case 6:
                    builder.getPersonagem();
                    break;
                case 7:
                    System.out.println("\nVoce está pronto para sair da cidade, no horizonte você vê 2 lugares. Qual caminho deseja tomar?");
                    System.out.println("1- Pantano; 2- Templo abandonado");
                    int lugar = input.nextInt();
                    switch (lugar) {
                        case 1:
                            System.out.println("No pantano você encontra um monstro de lama. Você escolhe: ");
                            System.out.println("1- atacar; 2- dialogar; 3- fugir");
                            int escolha1 = input.nextInt();
                            switch (escolha1) {
                                case 1:
                                    System.out.println("Você ataca o monstro e acaba gravemente ferido!");
                                    break;
                            
                                case 2:
                                    System.out.println("Você fala com o mostro, que educadamente responde dizendo que seu nome é Juão");
                                    System.out.println("Vocês conversam por horas e assim nasce uma grande amizade");
                                    break;
                            
                                case 3:
                                    System.out.println("Você foge do monstro desesperado e não percebe a areia movediça, onde cai e encontra seu fim");
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("No templo você encontra um livro negro em cima de um altar.Você escolhe: ");
                            System.out.println("1- pegar o livro; 2- deixar o livro");
                            int escolha2 = input.nextInt();
                            switch (escolha2) {
                                case 1:
                                    System.out.println("Você pega o livro e constrai uma maldição poderosa que te transforma em um esqueleto sem pensamentos");
                                    break;
                            
                                case 2:
                                    System.out.println("Você deixa o livro em paz e ao virar as costas um poderoso deus te parabeniza pelo auto controle e te consede uma benção maior");
                                    break;
                            }
                            break;
                    }
                    break;
                case 8:
                    System.out.println("\nPersonagem criado com sucesso!\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 8);
    }
}