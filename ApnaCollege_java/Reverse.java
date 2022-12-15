/*public class Reverse {
    

    public static void main(String args[]){
        int num=1234, reverse = 0, rem;
        while(num != 0){
            rem = num % 10; // 4 , 3 , 2 , 1
            reverse = reverse * 10 + rem;// 0 *10 + 4 , 4*10+3 , 43*10+2 = 432*10+1 = 4321
            num = num/10; //123 , 12 //4321 // 1 / 0
        } 
        System.out.println(reverse);
    }
}
*/
public class Reverse{
    public static void main(String[] args){
        String input = "GeeksForGeeks";
 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
 
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
        //public static void main(String[] args){
         //   int num = 34567;
         //   reverse(num);
       // }
    }
}