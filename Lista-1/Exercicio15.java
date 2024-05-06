import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com as coordenadas do primeiro ponto (x1, y1):");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.println("\nEntre com as coordenadas do segundo ponto (x2, y2):");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("\nA distância entre os pontos é: " + distancia);
        
        scanner.close();
    }
}
