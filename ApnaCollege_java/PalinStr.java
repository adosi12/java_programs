class PalinStr{
    public static void main(String[] args){
        String str = "fjvbjmb" , reverseStr = "";
        
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);

        }
         
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
          }
          else {
            System.out.println(str + " is not a Palindrome String.");
          }
    

    }
}