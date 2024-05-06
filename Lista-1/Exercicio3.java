import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (A): ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número (B): ");
        int b = scanner.nextInt();
        
        if(a == b) {
            System.out.println("Os números são iguais. Sequência inválida.");
        } else if(a > b) {
            System.out.println("O maior número é A: " + a);
        } else {
            System.out.println("O maior número é B: " + b);
        }
        
        scanner.close();
    }
}
