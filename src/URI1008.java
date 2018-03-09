import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int NUMBER = sc.nextInt();		
		int HOURS = sc.nextInt();
		double PRICE = sc.nextDouble();		
		
		double SALARY = HOURS * PRICE; 
		
		System.out.println("NUMBER = "+NUMBER);
		
		System.out.printf("SALARY = U$ %.2f\n",SALARY);
		
		
		sc.close();
	}

}
