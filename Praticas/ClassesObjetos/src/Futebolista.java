public class Futebolista extends Atleta {
    
    public Futebolista(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public void jogar() {
        System.out.println("Jogando bola");
    }
}
