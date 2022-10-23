package euler14;

import java.io.*;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		
		int largest = 0;
		int currentCollatz = 0;
		int oneMillion = 1000000;
		
		//bruteCollatz(35655);
		collatzOne();
	}
	//returns the number of times n has chained.
	static int bruteCollatz(int n)  {
		
		long chainNum = n;
		int count = 0;
		String sequence = Integer.toString(n);
		try{
		PrintWriter output = new PrintWriter(new FileOutputStream("SequenceStrings.txt", true));
		
		while (chainNum > 1) {
			//System.out.println(chainNum);
			if (!((chainNum&1)==1)) {
				
				chainNum = chainNum / 2;
				
			}
			else {chainNum = (3 * chainNum) + 1;}
			sequence+= "-->" + Long.toString(chainNum);
			count++;
		}
		System.out.println(sequence);
		output.write(sequence);
		output.close();
		//System.out.println(sequence);
		return count+1;

		}
		catch(FileNotFoundException e) {
			System.out.println("wut");
			return -1;
		}
	}


	static void collatzOne() {
		int largest = 0;
		int currentCollatz = 0;
		int oneMillion = 1000000;
		
		for(int i = 0; i < oneMillion; i++) {
			currentCollatz = bruteCollatz(i);
			//System.out.println("I " + i + " Col " +currentCollatz);
			if (currentCollatz >= largest) 	{
				largest = i;
			//System.out.println(largest);
			}
		}
		System.out.println(largest + "  " +bruteCollatz(largest));

	}		
}