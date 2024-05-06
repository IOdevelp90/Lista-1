import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo da viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();
        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();
        
        double distancia = tempoViagem * velocidadeMedia;
        double litrosConsumidos = distancia / 12; // considerando o consumo de 12km/l
        
        System.out.println("A quantidade de litros de combustível gasta na viagem é: " + litrosConsumidos);
        
        scanner.close();
    }
}
