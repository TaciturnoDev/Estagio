package FibonacciChecker.java;

import java.util.Scanner;

public class FibonacciChecker { 

    // Função para verificar se o número informado pertence à sequência de Fibonacci
    public static boolean pertenceFibonacci(int num) {
        // Valores iniciais da sequência de Fibonacci
        int a = 0;
        int b = 1;
        
        // Enquanto o valor de 'a' for menor ou igual ao número informado
        while (a <= num) {
            if (a == num) {
                return true; // O número pertence à sequência de Fibonacci
            }
            // Calcula o próximo valor na sequência
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false; // O número não pertence à sequência de Fibonacci
    }

    public static void main(String[] args) {
        // Para leitura do número inserido via entrada padrão (Scanner)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Chama a função para verificar se o número pertence à sequência de Fibonacci
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}


