import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = ((fahrenheit - 32) / 9) * 5;

        System.out.println("A temperatura em graus é: " + celsius);
        scanner.close();
    }
}
