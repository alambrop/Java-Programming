import java.util.InputMismatchException;
import java.util.LinkedList;

public class Radix 
{
	//creates an empty array
	int [] currArray;
	int n = 1;
	
	public Radix(int[] array)
	{
		//stores the array taken from file into current array
		currArray = array;
		
	}

	public int[] Sort()
	{
		//creates an array of type linked Lists
		LinkedList<Integer>[] arr = new LinkedList[10];
		
		//loops three times each with a different count for m and n
		for (int m = 10; m <= 1000; m = m * 10)
		{
			System.out.println("n = " + n);
			//loops through the current array and puts the elements at the specified element of the linked list array
			for (int i = 0; i <= currArray.length-1; i++)
			{
			
				int myIndex = currArray[i] % m;
				myIndex = myIndex / n;
				
				if (arr[myIndex] == null)
				{
					arr[myIndex] = new LinkedList<Integer>();
				}
				arr[myIndex].add(currArray[i]);	
		
			}
			
			//loops through the linked lists array and puts the elements back into the current array
			
			int arrayIndex = 0;
			for (int j = 0; j <= arr.length -1; j++)
			{	
				while (!arr[j].isEmpty())
				{
					currArray[arrayIndex] = arr[j].removeFirst();
					arrayIndex++;
				}
			} 
			n = n * 10;		
		}	
		return currArray;
	}
	
	//This method prints out the current array to show that the array from the file is now sorted. 
	public void print()
	{
		for (int a =0; a <= currArray.length -1; a++)
		{
			System.out.println(currArray[a]);
		}
	}
}
