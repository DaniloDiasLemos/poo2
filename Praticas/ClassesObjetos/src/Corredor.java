public class Corredor extends Atleta{

    public Corredor(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public void jogar() {
        System.out.println("Jogando tennis");
    }
}
