import java.util.Scanner;

public class MyCalculator {

	int sum = 0;
	int divisor_sum(int n) {
		if (n <= 1000) {
			
			
			for (int i = 1; i <= n; i++) {

		        if (n%i==0) {
		            System.out.println(i);
		             sum += i;
		            }
		        }
			
		}else {
			System.out.println("Please enter a number littler than 1000");
		}
		
		return sum;
	}
	public static void main(String[] args) {
		 MyCalculator my_calculator = new MyCalculator();
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.print(my_calculator.divisor_sum(n) + "\n");
	      	sc.close();
	}
}