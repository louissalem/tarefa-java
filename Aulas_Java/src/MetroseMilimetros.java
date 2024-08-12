import java.util.Scanner;
public class MetroseMilimetros {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um valor em metros: ");
		        double metros = scanner.nextDouble();

		        double milimetros = metros * 1000;

		        System.out.println(metros + " metros é igual a " + milimetros + " milímetros.");

		   
		        scanner.close();
		    }
		}

