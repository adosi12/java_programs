
/*class Range{
    public static void main(String[] args){
int l = 2, r=5;


for(int x=l; x<=r; x++){
     
    if( x % 2 != 0){
    System.out.println(x);
         
    }
    
}

}
}*/
class  Range{
    public static void main(String[] args){
         int arr[] = {1,2,3,4};
         for(int i=0; i<arr.length; i++){
            if(arr[i] %2 ==0){

            System.out.print(arr[i]);
            }
        }
            for(int i=0; i<arr.length; i++){
                if(arr[i] %2 !=0){
    
                System.out.print(arr[i]);
                }
            }
         
    }
}