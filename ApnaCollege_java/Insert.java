/*import java.util.Scanner;
public class Insert{
     public static void main (String[] args){
    //insert element in array
    //give position, 
    int n, pos, x;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements :");
    n=s.nextInt();
    int a[] =new int[n+1];
    System.out.println("Enter all the elements:");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
System.out.print("Enter the position where you want to insert element:");
pos = s.nextInt();
System.out.print("Enter the element you want to insert:");
x = s.nextInt();
for(int i = (n-1); i >= (pos-1); i--) 
{
a[i+1] = a[i]; //increased array
}
a[pos-1] = x; // inserting
System.out.print("After inserting:");
for(int i = 0; i < n; i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n]);
}
 
} */
// Java program to implement insert
// operation in an unsorted array.

/*class Main
{
	 
	static int  (int arr[], int n,int key,int capacity)
	{
 
		if (n >= capacity)
		return n;
	    arr[n] = key;
	    return (n + 1);
	}
	 
	public static void main (String[] args)
	{
		int[] arr = new int[20];
		arr[0] = 12;
		arr[1] = 16;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;
		int capacity = 20;
		int n = 6;
		int i, key = 26;
	
		System.out.print("Before Insertion: ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
	
		// Inserting key
		n = insertSorted(arr, n, key, capacity);
	
		System.out.print("\n After Insertion: ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
	}
} */

// Java program to implement delete
// operation in an unsorted array

class Insert
{
	// function to search a key to
	// be deleted
	static int findElement(int arr[], int n, int key)
	{
		int i;
		for (i = 0; i < n; i++)
			if (arr[i] == key)
				return i;
	
		return -1;
	}
	
	// Function to delete an element
	static int deleteElement(int arr[], int n, int key)
	{
		// Find position of element to be
		// deleted
		int pos = findElement(arr, n, key);
	
		if (pos == -1)
		{
			System.out.println("Element not found");
			return n;
		}
	
		// Deleting element
		int i;
		for (i = pos; i< n - 1; i++)
			arr[i] = arr[i + 1];
	
		return n - 1;
	}
	
	 
	public static void main(String args[])
	{
		int i;
		int arr[] = {10, 50, 30, 40, 20};
	
		int n = arr.length;
		int key = 30;
	
		System.out.println("Array before deletion");
		for (i=0; i<n; i++)
		System.out.print(arr[i] + " ");
	
		n = deleteElement(arr, n, key);
	
		System.out.println("\n\nArray after deletion");
		for (i=0; i<n; i++)
		System.out.print(arr[i]+" ");
	}
}
 