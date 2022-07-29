package projectEuler;

import java.util.ArrayList;

public class FindPrimesUpToN {


		private int n;
		private ArrayList<Integer> primes;

		FindPrimesUpToN(int n){
			
			ArrayList<Integer> primes = new ArrayList<Integer>();
			this.primes = primes;
			primes.add(1);
			primes.add(2);
			this.n = n;
			int currentOdd = 3;
			boolean isPrime = true;
			
			for(int j=0; j<=n;j++) {
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
					this.primes.add(currentOdd);
					System.out.println("Prime added: "+ currentOdd);	
			
				}
	
				currentOdd = currentOdd+2;
			}
		}
		public static void main(String[] args) {
			FindPrimesUpToN a = new FindPrimesUpToN(4);
		}
		
		public ArrayList<Integer> getPrimeArray() {
			return this.primes;
		}
}
