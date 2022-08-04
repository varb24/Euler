package euler12;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Queue;
import projectEuler.FindingPrimes;
//76588876 is wrong
public class NthTriangleNum {
	
	//Write Function to find the factors of a number, this is the same as finding the prime number composites of a number.
	public static void main(String[] args) {
		int numOfMults = 500; 
		int factors = 0;
		int triangleTest = 1;
		
		System.out.println((findNMul2(triangleNum(20))));
		
		/*while(factors <numOfMults) {
			factors = findNMul2(triangleNum(triangleTest));
			triangleTest++;
		}
		triangleTest--;
		System.out.println(triangleNum(triangleTest));
			*/
	}
	
	static int triangleNum(int n) { //finds nth triangle number
		return n*(n+1)/2;
	}
	static int findNMul2(int tn) {
		int mults = 2; //Starts at 2 to include 1 and the number itself
		int firstM= 2;
		int secondM = 3;


				while(firstM< secondM) {
					//System.out.println(firstM + " " + secondM);
					if (tn%firstM==0) {
						secondM = tn/firstM;
						firstM+=1;
						mults+=2;
						System.out.println(" mults added " + secondM);
					}
					else firstM++;												
			}
			System.out.println("returning mults : " + mults + " for tn: " + tn);
		return mults;		
	}
	/*static int findNMul(int tn) {
		int mults = 2; //Starts at 2 to include 1 and the number itself
		int newtn = tn;
		PrimeArrays multiples = new PrimeArrays(tn); //Creates primearr w/ numbers up to tn
		ArrayList<Integer> multList = multiples.getPrimeArray();
		System.out.println(multList);
		
		for(int prime:multList){
			if (tn%prime==0) {

					System.out.println("Added the result of:" +tn +" prime: " + prime);
					mults+=2;
				}
			
		}
				
		return mults;
	} prime arrays is on my laptop*/
}
