import java.util.Scanner;

public class Programa {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		double x = sc.nextInt();
		System.out.println("Digite o 2º número: ");
		double y = sc.nextInt();
		
		double med = (x + y) / 2;
		
		System.out.println("A média eh: " + med);
		sc.close();
	}
}