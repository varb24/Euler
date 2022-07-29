package number11;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CreateGridfile {
	public static void main(String[] args) {
		Scanner inputStream = null;
		//uses static 20 by 20 grid
		int gridArray[][] = new int[20][20];
		
		try {
			 inputStream = new Scanner(new FileInputStream("grid.txt"));
		} 
		catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		//Fills grid Array with file inputs,
		while(inputStream.hasNext()) {
			for (int i= 0; i< gridArray.length; i++) {
				for (int n = 0; n <gridArray[i].length; n++ ) {
					int num = inputStream.nextInt();
					gridArray[i][n] = num;
					System.out.print(num + " ");
				}
				System.out.println("\n");
			}
			
		}
		inputStream.close();
			
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("grid"));
			outputStream.writeObject(gridArray);
			outputStream.close();
			}
			
		catch (FileNotFoundException e1 ) {
			e1.printStackTrace();
		}
		catch (EOFException e2) {
			e2.printStackTrace();
		} 
		catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		
	}
}
