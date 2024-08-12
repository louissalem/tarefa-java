import java.util.Scanner;
public class Dias_Horas_Minutos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int d, h, m, s, totalSeg;
		System.out.println("Entre com a quantidade de");
		System.out.print("Dias ->");
		d = leia.nextInt ();
		System.out.print("horas ->");
		h = leia.nextInt ();
		System.out.print("minutos->");
		m = leia.nextInt ();
		System.out.print("Segundos ->");
		s = leia.nextInt ();
		
		totalSeg = d*24*60*60 + h*60*60 + m*60 + s;
		System.out.println("\nTotal de segundos ="+totalSeg);
	}

}
