import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        
        if (a == b) {
            System.out.println("Os valores de A e B são iguais.");
        } else {
            System.out.println("Os valores de A e B são diferentes.");
            System.out.println("O maior valor é: " + Math.max(a, b));
        }
        
        scanner.close();
    }
}
