import java.util.*;
public class Sumdiv {
     static int sumdivisible3(int s, int e,int d){
        int sum=0;
     for(int i=s+1;i<e; i++){
        if(i%d==0){
            sum = sum +i;
        }
       
     }
     return sum;
    }
     public static void main(String[] args){
    int s =3, e=21, d=3;
    System.out.println( "sum:" + sumdivisible3(s, e, d));
     }
    
}
