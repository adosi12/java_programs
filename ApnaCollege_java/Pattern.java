class Pattern{
  //  static int pattern(int r);
     
    public static void main(String[] args){
        int rows = 5;
        //char c=0;
        for (int i = 0; i < rows; i++) {
            for (char j = 'A'; j < 'A'+(rows-i); j++) {   
              System.out.print(j);
            }
            System.out.println();
          } 
        }
    }  //(int)ch
    /* A
    AB
    ABC
    ABCD
    ABCDE
     */
