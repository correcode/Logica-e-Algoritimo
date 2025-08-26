import java.util.Scanner;

public class Multiplo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if(numero % 3 == 0 && numero % 5 ==0){
           System.out.println("O numero: " + numero + " é multiplo de 3 e 5.");
        } else {
           System.out.println("O numero: " + numero + " nao e multiplo de 3 e 5"); 
        }
    }
}
