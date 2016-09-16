import java.util.*;
import java.io.*;
/*********************
 * This Project takes in a file of numbers and represents them in an Array.
 * It then performs a Radix Sort algorithm on this array in order to sort the elements in O(N) time. 
 *  
 */

public class Main 
{
	public static void main(String [] args) throws IOException
	{
	
		//Reads the file of numbers and adds them to an array
		String fileName = "inputNumbers.txt";
		Scanner inputFile = new Scanner(new File(fileName));
		Scanner newFile = new Scanner(new File(fileName));
		
		inputFile.useDelimiter(",");
		newFile.useDelimiter(",");
			
		int amountOfNumbers = 0;
		
		while (inputFile.hasNextInt())
		{
			int number = inputFile.nextInt();
			amountOfNumbers++;
		}
		inputFile.close();
	
		
		int array[] = new int [amountOfNumbers];
		int i = 0;
		
		while (newFile.hasNextInt())
		{
			array[i] = newFile.nextInt();
			//System.out.println(array[i]);
			i++;
		}
		newFile.close();	
		
		//performs Radix sort and prints the result
		Radix myRadix = new Radix(array);
		myRadix.Sort();
		myRadix.print();
	
	}

}
