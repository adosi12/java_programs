public class Merge {
    public static void merge_arr(int arr[], int brr[], int n1, int n2, int ans[]){
        int i=0,j=0,k=0;
         
        while(i< n1 &&  j<n2) //traverse both array   
        {
            if(arr[i] < brr[j]) ans[k++] = arr[i++];
            else ans[k++] = brr[j++];
        }
        while(i<n1) ans[k++] = arr[i++];
        while (j<n2) ans[k++] = brr[j++];
     }
     public static void main(String[] args)
     {

        int[] arr = {4,6,7,8};
         int brr[] = {4,5,6,7};
         int n1 = arr.length;
        int n2 = brr.length;
        int ans[] = new int[n1+n2];
         merge_arr(arr, brr, n1, n2, ans);
         for(int i=0;i<n1+n2;i++)
           System.out.print(ans[i]+" ");

     }

    
}
