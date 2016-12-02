package test;

public class A2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int f = 0;
		int sum = 2;
		int c = 4000000;
		
		while (f < c){

				f = a+b;
				a = b;
				b = f;
			
			if (f < c){
				if (f % 2 == 0){ sum = sum + f;}
			}
		}
			
		
	
		System.out.println("Summe aller geraden Fibonacci Zahlen unter 4 Millionen: "+sum);
	}
}

