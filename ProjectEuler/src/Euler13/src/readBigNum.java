import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

//From a text file, generates a list of 50 digit length numbers.
public class readBigNum {
		
	
	
	public static void main(String[] args) {
		Scanner readNums = null;
		ArrayList numList = new ArrayList<>();
		
		try {
			 readNums = new Scanner(new FileInputStream("euler13.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(readNums.hasNext()) {
		
		try {
			numList.add(readNums.nextBigInteger());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		//System.out.println(numList.get(numList.size()-1));
		try {
			ObjectOutputStream listBin = new ObjectOutputStream(new FileOutputStream("bigNumAL"));
			listBin.writeObject(numList);	
			listBin.close();
		}
		catch (FileNotFoundException e1 ) {
			e1.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
			
					
					
	}

}
