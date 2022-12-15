import java.util.*;
public class Factorial {
    //n! = n*n-1*n-2*...1
    public static void main(String[] args){
     int fact = 1;   //  intialize
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     if(n>=0){
     for(int i=1; i<=n; i++){
     fact = fact*i; // 1*2*3*4*5
     }
     System.out.print(fact);
    }else{
        System.out.print("wrong number");
    }

}
}
