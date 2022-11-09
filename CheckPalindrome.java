class CheckPalindrome {

	public static void palindrome(String arr , int n)
	{
		// Initialise flag to zero.
		int flag = 0;
//return;
		// Loop till array size n/2.
		for (int i = 0; i <= n / 2 && n != 0; i++) {
 
			//if (arr[i] != arr[n - i - 1]) { //1 2 3 4 5
				if(arr.charAt(i) != arr.charAt(n-i-1)){
				flag = 1;
			}
		}
        if (flag == 1)
			System.out.println("Not Palindrome");
		else
			System.out.println("Palindrome");
	}
	public static void main(String[] args)
	{
		//int arr[] = { 1, 2, 3, 2, 1 };
		String arr = "ada ";
		int n = arr.length();

		palindrome(arr, n);
	}
}
