import java.util.Date;

public abstract class Atleta {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Atleta(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void aquecer(int min) {
        System.out.println("O aquecimento deve durar " + min + " minuto(s)");
    }

    public abstract void jogar();

    public String toString() {
        StringBuilder result = new StringBuilder();
        String NL = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object {" + NL);
        result.append(" Nome: " + this.nome + NL);
        result.append(" Idade: " + this.idade + NL);
        result.append(" Peso: " + this.peso + NL);
        result.append(" Altura: " + this.altura + NL);
        result.append("}");

        return result.toString();
    }

    public static Date calcularProximaOlimpiada() {
        // 26/07/2024
        Date today;
    }
}
