import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros diferentes!");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maior = Math.max(a, Math.max(b, c));

        System.out.println("O maior dos numeros é: " + maior);
    }
}