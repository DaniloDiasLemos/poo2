import java.util.Scanner;

public class String1 {
    // Faça um programa que lê 2 strings e checa se a primeira termina com os caracteres da segunda.
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira String: ");
        String string1 = sc.nextLine();
        System.out.println("Digite a segunda String: ");
        String string2 = sc.nextLine();

        if (string1.endsWith(string2)) {
            System.out.println("String 1 termina com os caracteres da String 2");
        }else{
            System.out.println("String 1 não termina com os caracteres da String 2");
        }
    }
}
