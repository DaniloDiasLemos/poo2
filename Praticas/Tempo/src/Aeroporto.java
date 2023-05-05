public class Aeroporto implements Observer {
    private int temperatura;
    private int umidade;
    private boolean chuva;
    private int velocidadeVento;

    public Aeroporto(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;
        this.velocidadeVento = velocidadeVento;
    }

    @Override
    public void update(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        if (this.velocidadeVento != velocidadeVento) {
            System.out.println("\nAeroporto reagiu à mudança de velocidade do vento.");
        }
    }
}
