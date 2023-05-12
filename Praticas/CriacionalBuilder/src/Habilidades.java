public class Habilidades {
    private final String habilidade1;
    private final String habilidade2;
    private final String habilidade3;

    public Habilidades(String habilidade1, String habilidade2, String habilidade3) {
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
        this.habilidade3 = habilidade3;
    }

    public void getHabilidades() {
        System.out.println("Habilidade 1: " + this.habilidade1);
        System.out.println("Habilidade 2: " + this.habilidade2);
        System.out.println("Habilidade 3: " + this.habilidade3);
    }
}
