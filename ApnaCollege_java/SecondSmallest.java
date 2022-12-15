  /*class SecondSmallest{  
      static int getSecondSmallest(int[] a, int total){  
    int temp;                       //Arrays.sort(a) 
    for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[1];//2nd element because index starts from 0  
    }  
    public static void main(String args[]){  
    int a[]={1,2,5,6,3,2};  
  
    System.out.println("Second smallest: "+getSecondSmallest(a,6));  
    
    }}  */
    import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int n1 = display(a);
    System.out.println(n1);
  }

  public static int display(int[] array)

  {
    Arrays.sort(array);
    int n = array[array.length - 1] - array[0];
    int b = array.length;
    if (b == 1) {
      n = array[0];
    }
    return n;
  }
}