package number11;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GridMultiplication {
	
		static int consecutiveNum = 4;
	public static void main(String[] args) {

		int gridArray[][] = null;
		gridArray = constructGrid();
		
		int rowM =1;
		int diagM =1;
		int upDiagM=1;
		int columnM = 1;
		int innerIndex = 0;
		int greatestM = 0;
		//final int consecutiveNum = 4;
		
		//Multiply the rows, columns, and downward diagonals(Write a different loop for upper diagonals starting at index 3)
		
		for (int index = 0; index<= gridArray.length-consecutiveNum;index++) 
		{
			//System.out.println(index + " " + innerIndex);
			
			for ( innerIndex = 0; innerIndex<=gridArray[index].length-consecutiveNum;innerIndex++) 
			{
				System.out.println(index + " " + innerIndex);

				columnM *= gridArray[index][innerIndex]*
							gridArray[index+1][innerIndex]*
							gridArray[index+2][innerIndex]*
							gridArray[index+3][innerIndex];
				rowM *=gridArray[index][innerIndex]*
						gridArray[index][innerIndex+1]*
						gridArray[index][innerIndex+2]*
						gridArray[index][innerIndex+3];
				greatestM = Math.max(greatestM, columnM);
				greatestM = Math.max(greatestM, rowM);
				
				columnM = 1;
				rowM = 1;

			}

			//tests found colM against greatestM after inner for loop

			if (index==innerIndex) 
			{
				//Finds upper diagM and tests vs greatestM
				diagM = diagMultiply(gridArray, index, innerIndex);
				greatestM = Math.max(greatestM, diagM);
			}			
			
		}
		//Multiplies the upper diagonals
		for (int index = consecutiveNum -1; index<= gridArray.length-consecutiveNum;index++) {
			for ( innerIndex = 0; innerIndex<=gridArray[index].length-consecutiveNum;innerIndex++) {
				upDiagM = upDiagMultiply(gridArray, index, innerIndex);
				greatestM = Math.max(greatestM, upDiagM);
			}
		}
		System.out.println("Answer: " + greatestM);
	}
	public static int diagMultiply(int[][] aRR, int index1, int index2) {
		int diagM=1;
		for(int i = 0; i<consecutiveNum; i++) {
			diagM*= aRR[index1+i][index2+i];
		}
		System.out.print("Multiplied Diagonal " + diagM +" ");
		return diagM;		
	}
	public static int upDiagMultiply(int[][] aRR, int index1, int index2) {
		int diagM=1;
		for(int i = 0; i<consecutiveNum; i++) {
			diagM*= aRR[index1-i][index2+i];
		}
		//System.out.print("Multiplied Diagonal " + diagM +" ");
		return diagM;		
	}
	
	//Creates grid array from grid file
	public static int[][] constructGrid() {
		ObjectInputStream inputStream = null;
		int gridArray[][] = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("grid"));	
			gridArray = (int[][])inputStream.readObject();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(EOFException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/*for (int i= 0; i< gridArray.length; i++) {  		//Prints the grid
			for (int n = 0; n <gridArray[i].length; n++ ) {
								
				System.out.print(gridArray[i][n] + " ");
				}
			System.out.println();
			
		}
		*/
		return gridArray;
	}
	


}
