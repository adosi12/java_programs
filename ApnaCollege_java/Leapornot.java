import java.util.*;
public class Leapornot {
    public static void main(String[] args){
        //divide 4, 100, 400
        int year = 2100;
        //if(num%4=0 && num %400=0){
            if (  ((year % 4 == 0) && (year % 100 != 0))){
            System.out.print("leap");
        }else{
            System.out.print("not leap");
        }
    }
    
}
