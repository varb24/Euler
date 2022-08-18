import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class addBigNums {

	public static void main(String[] args) {
		ArrayList<BigInteger> bigInts = new ArrayList<BigInteger>();
		BigInteger bigInt, bigIntNext, bigIntLast;
		bigIntLast = new BigInteger("0");
		
		//Reads binary file, initializes bigInts array with data from binary file.
		try {
			ObjectInputStream nums = new ObjectInputStream(new FileInputStream("bigNumAL"));
			bigInts =  (ArrayList) nums.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		for(BigInteger a: bigInts) {
			//System.out.println(a);
			bigIntLast = bigIntLast.add(a);
			//System.out.println(bigIntLast.add(a));
		}
		System.out.println(bigIntLast);

	}

}
