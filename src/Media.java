import java.util.Scanner;

public class Media {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double x = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double y = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double z = sc.nextDouble();
		
		double med = (x + y + z) / 3;
		
		System.out.println("A média eh: " + med);
		sc.close();
	}
}