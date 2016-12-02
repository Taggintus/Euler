package test;

public class A1 {

	public static void main(String[] args) {
		int x = 0;
		int c = 1000;
		
		for(int i=1; i<c; i++){
			if (i % 3 == 0 || i % 5 == 0){
				x = x +i;
			}
			
		    
		}
		System.out.println(x);
	}

}
