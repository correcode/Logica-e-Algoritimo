import java.util.Scanner;

public class SumAverage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int num2 = sc.nextInt();
        System.out.println("Numero 3: ");
        int num3 = sc.nextInt();

        int soma = num1 + num2 + num3;

        int media = soma / 3;

        System.out.println("A soma deu: " + soma + " A media deu: " + media);
    }
}
