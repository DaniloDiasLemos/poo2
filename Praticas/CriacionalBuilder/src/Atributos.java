import java.util.Random;

public class Atributos {
    private final int forca;
    private final int agilidade;
    private final int carisma;
    private final int vitalidade;
    private final int destreza;

    public Atributos() {
        Random random = new Random();
        this.forca = random.nextInt(0, 10);
        this.agilidade = random.nextInt(0, 10);
        this.carisma = random.nextInt(0, 10);
        this.vitalidade = random.nextInt(0, 10);
        this.destreza = random.nextInt(0, 10);
    }

    public void getAtributos() {
        System.out.println("Força: " + this.forca);
        System.out.println("Agilidade: " + this.agilidade);
        System.out.println("Carisma: " + this.carisma);
        System.out.println("Vitalidade: " + this.vitalidade);
        System.out.println("Destreza: " + this.destreza);
    }
}
