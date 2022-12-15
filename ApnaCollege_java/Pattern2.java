class Pattern2{
    //  static int pattern(int r);
 
      public static void main(String[] args){
        int rows = 3;
           for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
           }
           for(int i=1;i<=rows-1;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(j);
            }
            System.out.println();
           }
           
          }
      }