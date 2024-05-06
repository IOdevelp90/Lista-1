import java.util.Scanner;

public class Exercicio2{
     public static void main(String[] args){  
     Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o primeiro numero: ");
    int num1 = scanner.nextInt();
    System.out.print("Digite o segundo numero: ");
    int num2 = scanner.nextInt();

    int soma = num1 + num2;
    System.out.println("A soma dos numeros e: " + soma);
    

    scanner.close();

     }
 
   }