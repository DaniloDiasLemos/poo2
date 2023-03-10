public class Tenista extends Atleta{

    public Tenista(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public void jogar() {
        System.out.println("Correndo");
    }
}
