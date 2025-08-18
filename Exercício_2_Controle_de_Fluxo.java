import java.util.Scanner;

/**
 Exercicio 1 
Faça um programa em que o usuário informe um número. O programa deverá informar
 se esse número é: negativo, positivo, par ou ímpar.
 
 */
class NumberInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        switch (Integer.signum(numero)) {
            case 1:
                System.out.println("O número é positivo.");
                break;
            case -1:
                System.out.println("O número é negativo.");
                break;
            case 0:
                System.out.println("O número é zero.");
                break;
        }

        switch (numero % 2) {
            case 0:
                System.out.println("O número é par.");
                break;
            case 1:
            case -1:
                System.out.println("O número é ímpar.");
                break;
        }
/**
 Exercicio 2 
Altere o programa do exercício 1 para imprimir uma mensagem na tela quando o número for
múltiplo de 3 ou múltiplo de 5.

 */
        switch (numero % 3) {
            case 0:
                System.out.println("O número é múltiplo de 3.");
                break;
            default:
                System.out.println("O número nao é múltiplo de 3.");
                break;
        }

        switch (numero % 5) {
            case 0:
                System.out.println("O número é múltiplo de 5.");
                break;
            default:
                System.out.println("O número nao é múltiplo de 5.");
                break;
        }

    }
}
/**
 Exercicio 3
Faça um programa que imprima os números de 1 a N. O usuário deverá digitar o valor de N.


 */

class NumberFor1_a_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de N: ");
        int N = scanner.nextInt();

        System.out.println("Números de 1 a " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}

/**
 Exercicio 4
Faça um programa que imprima o fatorial de 1 a N. O usuário deverá digitar o valor de N.
 */

class FactorialFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de N: ");
        int N = scanner.nextInt();

        System.out.println("Fatorial de 1 a " + N + ":");
        for (int i = 1; i <= N; i++) {
            int fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println(i + " = " + fatorial);
        }
    }
}

/**
 Exercicio 5
Imprima os números quadrados perfeitos de 1 a 1000. Um número quadrado perfeito
 é um número inteiro positivo que é o produto de si mesmo. Em outras palavras
 , é o resultado da multiplicação de um número por ele mesmo. Por exemplo
 , 1, 4, 9, 16, 25, 36, 49, 64, 81 e 100 são números quadrados perfeitos.
 */
class PerfectSquares {
    public static void main(String[] args) {
        System.out.println("Números quadrados perfeitos de 1 a 1000:");
        for (int i = 1; i * i <= 1000; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
}

// Adicione ao final do seu arquivo Exercício_2_Controle_de_Fluxo.java

public class Exercício_2_Controle_de_Fluxo {
    public static void main(String[] args) {
        System.out.println("Executando Exercício 1:");
        NumberInfo.main(new String[]{});

        System.out.println("\nExecutando Exercício 3:");
        NumberFor1_a_N.main(new String[]{});

        System.out.println("\nExecutando Exercício 4:");
        FactorialFrom1ToN.main(new String[]{});

        System.out.println("\nExecutando Exercício 5:");
        PerfectSquares.main(new String[]{});
    }
}

/*  Resultados
at.java\\jdt_ws\\JAVAZAO_cc9c7166\\bin Exercício_2_Controle_de_Fluxo 
Executando Exercício 1:
Informe um número: 10
O número é positivo.
O número é par.
O número nao é múltiplo de 3.
O número é múltiplo de 5.

Executando Exercício 3:
Informe o valor de N: 10
Números de 1 a 10:
1 2 3 4 5 6 7 8 9 10

Executando Exercício 4:
Informe o valor de N: 10
Fatorial de 1 a 10:
1 = 1
2 = 2
3 = 6
4 = 24
5 = 120
6 = 720
7 = 5040
8 = 40320
9 = 362880
10 = 3628800

Executando Exercício 5:
Números quadrados perfeitos de 1 a 1000:
1 4 9 16 25 36 49 64 81 100 121 144 169 196 225 256 289 324
 361 400 441 484 529 576 625 676 729 784 841 900 961
*/