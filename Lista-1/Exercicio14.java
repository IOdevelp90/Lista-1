import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro termo (a1): ");
        int a1 = scanner.nextInt();
        System.out.print("Digite o número da ordem (n): ");
        int n = scanner.nextInt();
        System.out.print("Digite a razão (r): ");
        int r = scanner.nextInt();
        
        int an = a1 + (n - 1) * r;
        System.out.println("O " + n + "º termo da PA é: " + an);
        
        scanner.close();
    }
}
