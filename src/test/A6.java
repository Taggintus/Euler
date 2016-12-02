package test;

import java.math.BigInteger;

public class A6 {

	public static void main(String[] args) {
		
		BigInteger n = new BigInteger("100");
		BigInteger suma = new BigInteger("0");
		BigInteger sumb = new BigInteger("0");

		for (BigInteger i = new BigInteger("1"); i.compareTo(n) <= 0; i = i.add(new BigInteger("1"))){

			suma = suma.add(i);
			sumb = (i.multiply(i)).add(sumb);
			
		}
		suma = suma.multiply(suma);
		System.out.println(suma.subtract(sumb));
	}

}
