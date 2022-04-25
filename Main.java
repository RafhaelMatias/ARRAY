import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menor = 0, maior= 0, soma = 0, pares = 0;

        int[] numeros = new int[10];


        for (int i=0; i< numeros.length; i++){
            System.out.println("Entre com um número " + (i+1) + ": ");
            numeros[i] = scan.nextInt();

            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            } else if (numeros[i] > maior){
                maior = numeros[i];
            }

            soma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares += numeros[i];
            }

        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma total dos números: " + soma);
        System.out.println("Soma total dos números pares: " + pares);

    }
}
