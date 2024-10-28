package VerificaLetraA;

import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a string ao usuário
        System.out.print("Digite uma frase ou palavra: ");
        String entrada = scanner.nextLine();

        // Variável para contar a quantidade de ocorrências da letra 'a' ou 'A'
        int contador = 0;

        // Verifica cada caractere na string
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        // Exibe o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }
}



