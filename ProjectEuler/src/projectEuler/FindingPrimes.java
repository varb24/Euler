package projectEuler;

import java.util.ArrayList;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

public class FindingPrimes {

	public static void main(String[] args) {
		
		//Arraylist will store the primes I find.
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(1);
		primes.add(2);
		final int twoMillion = 2000000;
		long primeSum = 2;
		int currentOdd = 3;
		boolean isPrime = true;

		
		while (currentOdd < twoMillion) {
		//note: I have to test my new prime vs every other prime number, if it is not divisible by any number in my prime list, it is prime.
			long start = System.currentTimeMillis();
			
			for(int i =0; i <= primes.size()-1;i++) {
				//System.out.println(currentOdd + " " + primes.get(i));
				//checks if currentOdd is divisible by the test prime
				if (currentOdd%primes.get(i)==0 && primes.get(i)>1) {	
					//System.out.println(currentOdd%primes.get(i) + "==0");
					isPrime = false;
					break;
					}
				 if (i==0 ) {
					isPrime = true;
					}
			
				
			}
			//Adds current odd to prime list, and moves iterations up after prime is found.
			if (isPrime == true) {
				primes.add(currentOdd);
				primeSum += currentOdd;
				System.out.println("Prime added: "+ currentOdd);	
		
			}

			long end = System.currentTimeMillis();
			System.out.println((end-start)/1000F + " Seconds");
			currentOdd = nextOdd(currentOdd);
			
		
		//System.out.println(primes.toString() + "Prime Sum is : " + primeSum);
		}
		System.out.println(primes.toString() + "Prime Sum is : " + primeSum);
	}
	
	public static int nextOdd(int n) {		
		return n+2;
	}
	
	public static int checkDivisible(int n, int p ) {
		
		return 0;
	}
}
