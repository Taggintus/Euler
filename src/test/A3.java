package test;

import java.util.Date;
import java.math.BigInteger;

public class A3 {

	public static void main(String[] args) {

			BigInteger zero = new BigInteger("0");
			BigInteger one = new BigInteger("1");
			BigInteger two = new BigInteger("2");
		
			BigInteger von = new BigInteger("1");
			BigInteger biswieviel = new BigInteger("600851475143");
			BigInteger i, n; 
			
			for (i = von; i.compareTo(biswieviel) < 1; i = i.add(one)) {
				n = two;
				
				while ((i.mod(n)).equals(0) == false && n.compareTo((i.divide(two))) < 1 ) {
					n = n.add(one);
				}

				if ((n.compareTo(((i.divide(two)).add(one))) >= 0 ) && (i.equals(one) == false) && biswieviel.mod(i).equals(zero)) {
					System.out.println(i + " ist ein Primfaktor von " + biswieviel + ".");
				}
		}
	}
	

}
