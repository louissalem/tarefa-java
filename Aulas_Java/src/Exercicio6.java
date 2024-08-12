import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Valores originais: A = " + A + ", B = " + B);

        int temp = A; 
        A = B;        
        B = temp;     

        System.out.println("Valores após a troca: A = " + A + ", B = " + B);

        scanner.close();
    }
}
