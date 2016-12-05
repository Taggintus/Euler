package test;

public class A9 {

	public static void main(String[] args) {
		
		int count = 1000;
		
		for(int a = 1; a < 1000; a++){
			for(int b = 1; b < 1000; b++){
				int c = count - a - b;
					if (a < b && b < c && a*a + b*b == c*c && a+b+c == 1000){
						System.out.println("a: " + a);
						System.out.println("b: " + b);
						System.out.println("c: " + c);
						System.out.println("abc: " + a*b*c);
					}
			}
		}

	}

}
