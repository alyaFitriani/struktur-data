/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class transposisimatriks6 {
   
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Menampilkan matriks sebelum transposisi
        System.out.println("Matriks sebelum transposisi:");
        printMatrix(matrix);
        
        // Melakukan transposisi matriks
        int[][] transposedMatrix = transpose(matrix);
        
        // Menampilkan matriks setelah transposisi
        System.out.println("\nMatriks setelah transposisi:");
        printMatrix(transposedMatrix);
    }
    
    public static int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

