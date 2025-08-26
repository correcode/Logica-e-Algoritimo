public class ImparPar {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("O total de numero pares na lista é: " + ehPar(numeros));
        System.out.println("O total de numero impares na lista é: " + ehImpar(numeros));

    }
    public static int ehImpar(int[] numeros){
        int soma = 0;
        for(int n : numeros){
            if(n % 2 == 0){
            soma++;
            }
        }
        return soma;
    }
    public static int ehPar(int[] numeros) {
        int soma = 0;
        for(int n : numeros) {
            if(n % 2 != 0) {
                soma++;
            }
        }
        return soma;
    }
}
