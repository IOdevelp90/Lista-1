import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor para A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor para B: ");
        int b = scanner.nextInt();
        
        System.out.println("Valores originais: A = " + a + ", B = " + b);
        
        // Troca de valores
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Valores trocados: A = " + a + ", B = " + b);
        
        scanner.close();
    }
}
