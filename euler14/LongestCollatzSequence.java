package euler14;

import java.io.*;
import java.math.BigInteger;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		
		int largest = 0;
		int currentCollatz = 0;
		int oneMillion = 1000000;
		
		collatzOne();
	}
	//returns the number of times n has chained.
	static int bruteCollatz(BigInteger n)  {
				
		int count = 0;

		
		while (!n.equals(BigInteger.ONE)) {

			if (!n.testBit(0)) {
				
				n = n.shiftRight(1);
				
			}
			else {

				n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
			
			}

			count++;
			
		}

		return count;

	}


	static void collatzOne() {
		int largestStart = 0;
		int largestChain = 0;
		int currentCollatz = 0;
		int oneMillion = 1000000;
		
		
		for(int i = 1; i < 837799+1; i++) {
			currentCollatz = bruteCollatz(BigInteger.valueOf(i));

			if (currentCollatz > largestChain) 	{
				
				largestStart = i;

			}
		}
		System.out.println(largestStart);

	}		
}