class Marks{
    public static void personA(int phy, int chem, int math){
         
        
    }
     public static void main(String[] args){
        int phy = 90;
        int chem = 90;
        int math = 90;
        float percentage = ((phy+chem+math)/300)* 100;
        switch (percentage) {
            case (percentage > 50):
             System.out.println("grade: A");
                break;
            /*case 2: 
            if(percentage <= 50 && percentage > 20) System.out.println("grade: B");
            break;*/
            default:   System.out.println("Try again");
                break;
             
        }
        
    }
} 