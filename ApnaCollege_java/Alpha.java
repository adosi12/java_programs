/*import java.util.*;
public class Alpha
{
public static void main(String args[])
{
String str = "hbfA__a";
int i; 
for (i = 0; i < str.length(); i++)
{
if (str.charAt(i) < 'A'|| str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z')
{
    str = str.substring(0, i) + str.substring(i + 1); //   erase the character 
    i--; // h,b,f,A, '*' 
}
}
System.out.print(str);
}
}*/
/*class GFG {
 
// function to remove characters and
// print new string
    static void removeSpecialCharacter(String str) {
        char[] s = str.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length; i++) {
 
            // Store only valid characters
            if ((s[i] >= 'A' && s[i] <= 'Z')
                    || (s[i] >= 'a' && s[i] <= 'z')) {
                s[j] = s[i];
                j++;
            }
        }
        System.out.println(String.valueOf(s).substring(0, j));
    }
 
// driver code
    public static void main(String[] args) {
        String s = "$Gee*k;s..fo, r'Ge^eks?";
        removeSpecialCharacter(s);
    }
} */
import java.util.*;
public class Alpha {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char ch = s.next().charAt(0);

    if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    System.out.println("vowel");}
    else {
    System.out.println("no");
    }
}
}
