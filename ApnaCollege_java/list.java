import java.util.*;
public class list {
    public static void main(String[] args){
         //input, thousand th digit
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       //num = 21, 21%10 = 1, 2100%10 = 0, 21/10 = 2, 2100 /10 = 210/10 =21=10 =2,, num/10 = num
       //no. of digit >= 4
       /*while(num>999){
        num/= 10;
        continue;
       }
       if(num>99){
        num/=10;
       }*/
       //5678943
       num %= 10;
       System.out.print(num);
    }
    
}
