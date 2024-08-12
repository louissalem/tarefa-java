import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();
        System.out.print("Digite o percentual de reajuste (ex: 10 para 10%): ");
        double percentualReajuste = scanner.nextDouble();
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        
        System.out.println("O novo salário é: " + novoSalario);

        
        scanner.close();
    }
}
