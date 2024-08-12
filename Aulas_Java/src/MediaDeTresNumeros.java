import java.util.Scanner;

public class MediaDeTresNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro:");
		int numero1 = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int numero2 = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int numero3 = scanner.nextInt();
		int soma = numero1 + numero2 + numero3;
		System.out.println("A soma dos três números é: " + soma);
		int média = soma/3;
		System.out.println("A média dos números é: " + média);
		
		scanner.close();

	}

}
