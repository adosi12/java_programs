import java.util.*;
public class Reverseword {
    public static void main(String[] args){
        String str ="aditi";
        
        /*String arr[] = str.split(" "); //split after every space
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " "); 
        }
        System.out.println("");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }*/
System.out.println(str.charAt(0));
        String arr[] = str.split("");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
            
        }
        
    }
}
