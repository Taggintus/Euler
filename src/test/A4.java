package test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class A4 {

	public static void main(String[] args) {
	
		int a = 999;
		int b = 999;
		int z = 0;
		int l = 0;

		String c = "";
		
		for(b = 999 ; b > 99; b--){
			for(a = 999 ; a >= b; a--){
				
				z = a*b;
				c = String.valueOf(z);

				if(isPalindrome(c) && z > l){
				l = z;}
			}
		}
			System.out.println(l);
	}

	public static boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
}
