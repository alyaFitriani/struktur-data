/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class matriksidentitas5 {
   
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        
        // Mengecek apakah matriks adalah matriks identitas
        boolean isIdentity = isIdentityMatrix(matrix);
        
        // Menampilkan hasil
        if (isIdentity) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks bukan matriks identitas.");
        }
    }
    
    public static boolean isIdentityMatrix(int[][] matrix) {
        // Mengecek apakah matriks adalah matriks persegi 3x3
        if (matrix.length != 3 || matrix[0].length != 3) {
            return false;
        }
        
        // Mengecek elemen diagonal apakah semuanya adalah 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
