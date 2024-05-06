import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        double resultado;
        switch (operador) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }
        
        scanner.close();
    }
}
