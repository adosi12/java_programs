/*import java.io.*;
import java.util.*;
class Matrix{
    static int N = 3;
    static boolean isMagicSquare(int mat[][]){
        int sumd1=0, sumd2=0;
        for(int i=0;i<N;i++){
            sumd1+=mat[i][i];
            sumd2+=mat[i][N-1-i];
        }
        if(sumd1 != sumd2)
    return false;
    for (int i = 0; i < N; i++) {
 
        int rowSum = 0, colSum = 0;
    for(int j=0;j<N;j++){
        rowSum += mat[i][j];
        colSum += mat[i][j];
    }
    if(rowSum != colSum || colSum!= sumd1)
    return false;
}
 return true;
 }
public static void main(String[] args)
{
    int mat[][] = {{ 2, 7, 6 },{ 9, 5, 1 },{ 4, 3, 8 }};

    if (isMagicSquare(mat))
        System.out.println("Magic Square");
    else
        System.out.println("Not a magic" +
                                " Square");
}
}*/
class Matrix{
    public static void main(String[] args){
        int row=0, col=0;
        int sumMat=0;
        
        int mat[][] = {{1,2,3},
                       {3,4,5},
                       {5,6,7}};
        row= mat.length;
        col=mat[0].length;               
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                if(i== j){
                    if(mat[i][j] % 2 != 0){
                        sumMat = sumMat + mat[j][i];
                    }
                    

                }
                
 

            }
        }System.out.print(sumMat);


    }
}
/*import java.util.*;
class Matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=3,col=3;
        int mat[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               mat[][] = sc.nextInt();
            }
        }
        int sum =0;
    }
}*/
