import java.util.Random;
import java.util.Scanner;

public class QuenteFrio {
    public static void dica(int palpite, int numero) {
        if (palpite > numero) {
            System.out.println("Seu palpite é maior que o número gerado.");
        } else {
            if (palpite < numero) {
                System.out.println("Seu palpite é menor que o número gerado.");
            } else {
                System.out.println("Parabéns, você acertou! O número era " + numero);
            }
        }

    }

    public static void main(String[] args) {
        int palpite = 0, num;

        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        num = r.nextInt(100) + 1;
        System.out.println("Gerado um numero entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            dica(palpite, num);
        } while (palpite != num);

    }
}
