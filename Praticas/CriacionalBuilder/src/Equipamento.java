public class Equipamento {
    private final String escudo;
    private final String arma;
    private final String armadura;
    private final String amuleto;

    public Equipamento(String escudo, String arma, String armadura, String amuleto) {
        this.escudo = escudo;
        this.arma = arma;
        this.armadura = armadura;
        this.amuleto = amuleto;
    }

    public void getEquipamento() {
        System.out.println("Escudo: " + this.escudo);
        System.out.println("Arma: " + this.arma);
        System.out.println("Armadura: " + this.armadura);
        System.out.println("Amuleto: " + this.amuleto);
    }
}
