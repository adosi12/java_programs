import java.util.*;
public class LiSearch{    
  static int linearSearch(int[] arr, int key){    
     for(int i=0;i<arr.length;i++){    
        if(arr[i] == key){    
             return i;    
        }    
    }    
     return -1; 
     }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
    Scanner sc = new Scanner(System.in);
    int key = sc.nextInt();    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
        }    
    } 
    
    class LinearSearch {
        // This function returns index of element x in arr[]
        static int search(int arr[], int n, int x)
        {
            for (int i = 0; i < n; i++) {
                // Return the index of the element if the element
                // is found
                if (arr[i] == x)
                    return i;
            }
     
            // return -1 if the element is not found
            return -1;
        }
     
        public static void main(String[] args)
        {
            int[] arr = { 3, 4, 1, 7, 5 };
            int n = arr.length;
             
            int x = 4;
     
            int index = search(arr, n, x);
            if (index == -1)
                System.out.println("Element is not present in the array");
            else
                System.out.println("Element found at position " + index);
        }
    }
    
/*
public class Reverse
{
   public static void main(String args[])
   {

     int arr[] = {10, 20, 30, 40, 50};

     int n=arr.length;
     for(int i=n-1; i>=0; i--)
       System.out.print(arr[i]+" "); 
    }
} */