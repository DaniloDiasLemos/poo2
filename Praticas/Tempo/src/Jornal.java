public class Jornal implements Observer {
    private int temperatura;
    private int umidade;
    private boolean chuva;
    private int velocidadeVento;

    public Jornal(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;
        this.velocidadeVento = velocidadeVento;
    }

    @Override
    public void update(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        if (this.temperatura != temperatura) {
            System.out.println("\nJornal reagiu à mudança de temperatura.");
        }
        if (this.chuva != chuva) {
            System.out.println("\nJornal reagiu à mudança de chuva.");
        }
    }
}
