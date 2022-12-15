import java.util.*;
class  Avni{
 
static void reverse(String str)
{
    /*public static void main(String[] args){ 
        String str ="My Name is Aditi .";*/
        Stack<String> st = new Stack<String>();
        String temp = "";
        for(int i = 0; i < str.length(); i++)
  {
    if(str.charAt(i) == ' ')
    {
       st.add( temp);//var
       temp = "";  //empty       
    }
    else
    {
      temp = temp + str.charAt(i);
    }
    st.add(temp);
}
  while(!st.isEmpty())
  {
     
    temp = st.peek();//reverse
    System.out.print(temp + " ");
    st.pop();
  }
   
  System.out.println();
  
}public static void main(String[] args)
{
  String str = "I Love You";
  reverse(str);
}
}

        /*String arr[] = str.split(" "); //split after every space
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " "); 
        }
        System.out.println("");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }*/
   
        
    
