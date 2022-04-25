import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menor = 0, maior= 0, soma = 0, pares = 0;

        int[] numeros = new int[10];


        for (int i=0; i< numeros.length; i++){
            System.out.println("Digite um número " + (i+1) + ": ");
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

        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("A soma de todos os números pares é: " + pares);

    }
}