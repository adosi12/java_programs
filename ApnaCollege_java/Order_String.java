import java.util.*;
class Order_String{
    public static void main(String[] args){
    String str;
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    char[] ch = str.toCharArray();
    for(int i=0;i<ch.length;i++){
        for(int j=i+1;j<ch.length;j++){
            if(ch[j]<ch[i]){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

            }
        }
    }
    for(int i=0;i<ch.length;i++){
        System.out.print(ch[i]);
    }

    }
}
















/*public class Order_String{
    
   
    static void sortString(String str) {
   
      int letters[] = new int[26];
   
      for (char x : str.toCharArray()) {
   
        letters[x - 'a']++;
      }
   
      for (int i = 0; i < 26; i++) {
        for (int j = 0; j < letters[i]; j++) {
          System.out.print((char) (i + 'a'));
        }
      }
    }
 
    public static void main(String[] args) {
      sortString("geeksforgeeks");
    }
  }*/
 