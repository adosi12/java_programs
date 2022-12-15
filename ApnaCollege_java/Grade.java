import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please Enter the Five Subjects Marks : ");
		float Physics = sc.nextInt();	
		float Chemistry = sc.nextInt();	
		float Biology = sc.nextInt();	
		float Mathemetics = sc.nextInt();	
		float Computer = sc.nextInt();	
		
		float total =  Physics+Chemistry+Biology+Mathemetics+Computer;
	    float Percentage = (total / 500) * 100;
	 
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
		
		if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Fail");
		} 
	}
}

    