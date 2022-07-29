package euler12;
import java.util.LinkedList;
import java.util.Queue;

import projectEuler.FindingPrimes;

public class NthTriangleNum {

	public static void main(String[] args) {
		boolean notFound = true;
		int numOfDivisors = 0;
		int nthTriangle = 1;
			
		//while(notFound) {
				
			//}
		Queue<String> a = new LinkedList<String>();
		a.add("hi");
		System.out.print(a.remove());
	}
	
	static double triangleNum(int n) { //finds nth triangle number
		return n*(n+1)/2;
	}
}
