import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 5: ");
        int numero = scanner.nextInt();
        
        String numeroExtenso;
        switch(numero) {
            case 1:
                numeroExtenso = "um";
                break;
            case 2:
                numeroExtenso = "dois";
                break;
            case 3:
                numeroExtenso = "três";
                break;
            case 4:
                numeroExtenso = "quatro";
                break;
            case 5:
                numeroExtenso = "cinco";
                break;
            default:
                numeroExtenso = "Número inválido!";
        }
        
        System.out.println("Número por extenso: " + numeroExtenso);
        
        scanner.close();
    }
}
