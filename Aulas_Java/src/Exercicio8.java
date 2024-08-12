import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do litro do combustível: ");
        double precoLitro = scanner.nextDouble();
        System.out.print("Digite o desempenho do veículo (km por litro): ");
        double desempenhoVeiculo = scanner.nextDouble();
        System.out.print("Digite a distância entre as duas cidades (em km): ");
        double distancia = scanner.nextDouble();
        double litrosNecessarios = distancia / desempenhoVeiculo;
        double custoTotal = litrosNecessarios * precoLitro;

        System.out.println("Litros necessários para a viagem: " + litrosNecessarios);
        System.out.println("Custo total da viagem: R$ " + custoTotal);

        scanner.close();
    }
}
