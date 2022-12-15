class Count{
    public static void main(String[] args){
        String str = "Avni is good girl";
 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ')  )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*int i=0;
         
            while(i <  str.length())
            {
                if(str.charAt(i) ==  'o') {
                    System.out.format("\n %c Found at Position %d ", 'o',i + 1);
                }
                i++;
        } */