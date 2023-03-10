import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String2 {
    // Faça um programa que lê uma string e conta os
    // caracteres que aparecem nela, colocando caracteres e
    // suas quantidades em um HashMap.Ao terminar
    // a leitura, o programa mostra os caracteres
    // e a quantidade de cada um.

    static void count(String String) {
        
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        char[] charArray = String.toCharArray();

        for (char c : charArray) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }

        for (Map.Entry entry : count.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira String: ");
        String string = sc.nextLine();
        count(string);
    }
}
