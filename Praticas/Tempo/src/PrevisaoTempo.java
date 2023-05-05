import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrevisaoTempo implements Observable {
    private int temperatura;
    private int umidade;
    private boolean chuva;
    private int velocidadeVento;
    private List<Observer> observers = new ArrayList<>();

    public PrevisaoTempo(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;
        this.velocidadeVento = velocidadeVento;
    }

    public void mudarEstado() {
        Random r = new Random();
        int temperaturaAntiga = temperatura;
        int umidadeAntiga = umidade;
        boolean chuvaAntiga = chuva;
        int velocidadeVentoAntiga = velocidadeVento;

        temperatura += r.nextInt(11) - 5;
        umidade += r.nextInt(11) - 5;
        chuva = r.nextBoolean();
        velocidadeVento += r.nextInt(21) - 10;

        System.out.println("\n---------------------------------------------------------------------------");
        System.out.println("\nTemperatura mudou de " + temperaturaAntiga + " para " + temperatura);
        System.out.println("\nUmidade mudou de " + umidadeAntiga + " para " + umidade);
        System.out.println("\nChuva mudou de " + chuvaAntiga + " para " + chuva);
        System.out.println("\nVelocidade do vento mudou de " + velocidadeVentoAntiga + " para " + velocidadeVento);
        System.out.println("\n---------------------------------------------------------------------------");

        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura, umidade, chuva, velocidadeVento);
        }
    }
}
