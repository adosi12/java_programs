/*class Sol{
    public static void main (String[] args){
         
            int a=8, b=9;
            
            int result = (a > b) ? (a+b) :  (a-b);
            System.out.print(result);
    }
}*/
public class Sol {
  
    public static  void  main( String[] args) {
    /*   String strAr = "12345";  
        
        char[] arr = strAr.toCharArray();

        for (char temp :  arr) {
            System.out.println(temp);} */
    boolean flag = true;
    int[] arr = new int[]{1,3,3,2,3,1  }; 
    for(int i=0;i<arr.length-1;i++){
        int t =(arr[i+1]-arr[i]);
    if((t>=-2) && (t <= 2)){
       // System.out.println("hamming");
    }else{
        //System.out.println("no");
        flag = false;
        break;
    }
     
    }
    if(flag == true){
        System.out.println("hamming");

    }else{
        System.out.println("no");
    }

    
    }}