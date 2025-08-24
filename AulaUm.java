import java.util.Scanner;

public class AulaUm {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
