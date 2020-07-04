/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;
import java.util.Scanner;
public class OneSol 
{ 
	public static int N = 4; 
	static void printSolution(int board[][]) 
	{ 
		for (int i = 0; i < N; i++) 
		{ 
			for (int j = 0; j < N; j++) 
				System.out.print(" " + board[i][j]+ " "); 
			System.out.println(); 
		} 
	} 
	boolean isSafe(int board[][], int row, int col) 
	{ 
		int i, j; 
		/* Check this row on left side */
		for (i = 0; i < col; i++) 
			if (board[row][i] == 1) 
				return false; 

		/* Check upper diagonal on left side */
		for (i=row, j=col; i>=0 && j>=0; i--, j--) 
			if (board[i][j] == 1) 
				return false; 

		/* Check lower diagonal on left side */
		for (i=row, j=col; j>=0 && i<N; i++, j--) 
			if (board[i][j] == 1) 
				return false; 

		return true; 
	} 

	boolean solveNQUtil(int board[][], int col) 
	{ 
		if (col >= N) 
			return true; 
		for (int i = 0; i < N; i++) 
		{ 
			if (isSafe(board, i, col)) 
			{ 
				board[i][col] = 1; 
				if (solveNQUtil(board, col + 1) == true) 
					return true; 
				board[i][col] = 0; // BACKTRACK 
			} 
		} 
		return false; 
	} 
/*	boolean solveNQ() 
	{ 
		int board[][] = new int[N][N];

		if (solveNQUtil(board, 0) == false) 
		{ 
			System.out.print("Solution does not exist"); 
			return false; 
		} 

		printSolution(board); 
		return true; 
	}*/        
        public int[][] solveNQ(int n) 
	{ 
                N=n;
		int board[][] = new int[N][N];
		if (solveNQUtil(board, 0) == false) 
		{ 
//			System.out.print("Solution does not exist"); 
			return board; 
		} 
//		printSolution(board); 
		return board; 
	}
        public int[][] solveNQ() 
	{ 
		int board[][] = new int[N][N];
		if (solveNQUtil(board, 0) == false) 
		{ 
			System.out.print("Solution does not exist"); 
			return board; 
		} 
//		printSolution(board); 
		return board; 
	}
	public static void main(String args[]) 
	{ 
		OneSol Queen = new OneSol(); 
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of queens::");
                N = sc.nextInt();        
		int res[][] = new int[N][N];
                res = Queen.solveNQ();
                printSolution(res);
                
	} 
} 
