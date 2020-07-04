package algo;

import java.util.Arrays;
import java.util.Scanner;

public class NQ  
{   
    static int N;  
    static int k = 1; 
    static int b[][] = new int[N][N];
    
    static boolean compareMat(int a[][],int b[][])
    {
        /*for(int i = 0; i < N; i++)
        {
            */
        for(int j = 0; j < N; j++)
        {
            if(!Arrays.equals(a[j],b[j]))
                return false;
        }
        
        return true;
    }
    static void printSolution(int board[][])  
    {  
        System.out.printf("%d-\n", k++);  
        for (int i = 0; i < N; i++)  
        {  
            for (int j = 0; j < N; j++)  
                System.out.printf(" %d ", board[i][j]);  
            System.out.printf("\n");  
        }  
        System.out.printf("\n");  
    }  

    static boolean isSafe(int board[][], int row, int col)  
    {  
        int i, j;  
        for (i = 0; i < col; i++)  
            if (board[row][i] == 1)  
                return false;  
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)  
            if (board[i][j] == 1)  
                return false;  
        for (i = row, j = col; j >= 0 && i < N; i++, j--)  
            if (board[i][j] == 1)  
                return false;  
        return true;  
    }  

    static boolean solveNQUtil(int board[][],int arr[][], int col)  
    {  
        if (col == N)  
        {  
            if(compareMat(board,arr))
            {
                return true;
            }
            //printSolution(board);  
            return false;  
        }  
        boolean res = false;  
        for (int i = 0; i < N; i++)  
        {  
            if ( isSafe(board, i, col) )  
            {  
                board[i][col] = 1;  
                res = solveNQUtil(board,arr,col + 1) || res;  
                board[i][col] = 0; // BACKTRACK  
            }  
        }  
        return res;  
    }  
  
    public static boolean solveNQ(int arr[][],int n)  
    {  
        N = n;
        b = arr;
        int board[][] = new int[N][N];  
        if (solveNQUtil(board,b, 0) == false)  
        {  
//            System.out.printf("Solution does not exist");  
            return false;  
        }  
        return true;  
    }  
  
    /*public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of queens::");
        N = sc.nextInt();        
        solveNQ(); 
    }*/ 
} 