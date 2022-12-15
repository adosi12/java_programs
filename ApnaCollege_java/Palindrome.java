import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        //palindrome =aba,  
         //reverse 3statements
        int n =3443, sum=0, palindrome, r;
        palindrome = n;
        while(n>0){
            r=n%10; // r=rem, for reverse
            sum = sum*10+r;
            n = n/10;
        }
        if(palindrome == sum){
            System.out.println("n is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    
}
