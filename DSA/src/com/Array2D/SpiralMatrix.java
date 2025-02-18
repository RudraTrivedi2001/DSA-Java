package com.Array2D;

public class SpiralMatrix 
{
	/*
    💡 Problem Statement:
    You are given an `n x m` matrix. Print the elements of the matrix in **spiral order** 
    (starting from the top-left corner and moving in a clockwise direction).

    ✅ Example Input:
    matrix = [
        [1,  2,  3,  4],
        [5,  6,  7,  8],
        [9, 10, 11, 12],
        [13,14, 15, 16]
    ]

    ✅ Example Output:
    1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

    🔹 Explanation:
    - Start from the first row: `1 → 2 → 3 → 4`
    - Move down the last column: `8 → 12 → 16`
    - Move left on the last row: `15 → 14 → 13`
    - Move up on the first column: `9 → 5`
    - Repeat for the remaining sub-matrix.

    ⚡ Constraints:
    - `1 <= n, m <= 10^3`
    - `-1000 <= matrix[i][j] <= 1000`
    */
	
	
	
	
    public static void main(String[] args) 
    {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) 
        {
            //  Print top row (left to right)
            for (int j = startCol; j <= endCol; j++) 
            {
                System.out.print(matrix[startRow][j] + " ");
            }

            //  Print right column (top to bottom)
            for (int i = startRow + 1; i <= endRow; i++) 
            {
                System.out.print(matrix[i][endCol] + " ");
            }

            //  Print bottom row (right to left) [Only if startRow < endRow]
            if (startRow < endRow) 
            {
                for (int j = endCol - 1; j >= startCol; j--) 
                {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            //  Print left column (bottom to top) [Only if startCol < endCol]
            if (startCol < endCol) 
            {
                for (int i = endRow - 1; i > startRow; i--) 
                {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Move to the inner layer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
