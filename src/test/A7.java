package test;

public class A7 {

	public static void main(String[] args) {
		
		int count = 2;
		int n = 3;
		boolean b = true;
		
		while (count != 10002){
			
			for(int i = 1; i < n/2 && b; i++){
				
				if (n % i == 0 && i != 1 && i !=n){
					b = false;
				}
				
			}
			
			if (b){
				System.out.println(count + ": " + n);
				count = count + 1;
			}
			n = n + 2;
			b = true;
			
		}

	}

}
