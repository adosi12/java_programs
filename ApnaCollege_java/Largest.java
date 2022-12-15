public class Largest {
    static int arr[] = {10, 324, 45, 90,324, 98};
    // Method to find maximum element in arr[]
    static int largest() {
        int i, ans = 0;
        // Initialize maximum element
        int max = arr[0];
        // Traverse array elements from second and compare every element with current max
        for (i = 1; i < arr.length; i++)            
         if (arr[i] > max){ max = arr[i];
         ans = i;}
        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println("Largest in given array is " + largest());
    }
}