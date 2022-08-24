package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares = quantPares + 1;

            else quantImpares = quantImpares + 1;

            count = count + 1;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}
