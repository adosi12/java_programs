import java.util.*;
public class Fabonacci{
    public static void main (String[]args)
    {
      Scanner sc = new Scanner(System.in );
      int n = sc.nextInt();
      int num = 2*n;
      int a = 0, b = 1;
 int sum=0;
      // Here we are printing 0th and 1st terms
        System.out.print (a + "  ");
 
      int nextTerm;
 
      // printing the rest of the terms here
      for (int i = 2; i <= num; i++)
        {
       nextTerm = a + b;
       a = b;
        b = nextTerm;
            
          if(i%2 == 0){
            
            System.out.print(nextTerm + "  " );
            sum += nextTerm;
            
           }
           
        }
        System.out.println(sum);
 
 
    }
  }