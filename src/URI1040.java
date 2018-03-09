import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		
		
		double media = ( (n1 * 2 ) + (n2 * 3) + (n3 * 4) + n4) / 10;
		
		System.out.printf("Media: %.1f\n",media);
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media <4.9) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			
		}

	}

}
