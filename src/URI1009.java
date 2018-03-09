import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String primeiroNome = sc.next();
		double salarioFixo = sc.nextDouble();		
		double vendas = sc.nextDouble();
			
		double TOTAL = salarioFixo + vendas * 0.15; 
		
				
		System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
		
		
		sc.close();
	}

}
