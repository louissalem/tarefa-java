import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de km percorridos: ");
        double kmPercorridos = scanner.nextDouble();
        System.out.print("Digite a quantidade de dias pelos quais o carro foi alugado: ");
        int diasAlugados = scanner.nextInt();
        double precoPorDia = 60.0;
        double precoPorKm = 0.15;
        double custoTotal = (diasAlugados * precoPorDia) + (kmPercorridos * precoPorKm);

        System.out.println("O preço total a pagar é: R$ " + custoTotal);

        scanner.close();
    }
}
