/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.elementerbalik1;

/**
 *
 * @author Administrator
 */
public class gabungan2 {
    public static void main(String[] args) {
        int[] arrayPertama = {1, 2, 3, 4, 5};
        int[] arrayKedua = {6, 7, 8, 9, 10};
        
        int panjangArrayBaru = arrayPertama.length + arrayKedua.length;
        int[] arrayBaru = new int[panjangArrayBaru];
        
        int indeks = 0;
        for (int elemen : arrayPertama) {
            arrayBaru[indeks] = elemen;
            indeks++;
        }
        
        for (int elemen : arrayKedua) {
            arrayBaru[indeks] = elemen;
            indeks++;
        }
        
        // Print array baru
        System.out.print("Array Baru: ");
        for (int i = 0; i < arrayBaru.length; i++) {
            System.out.print(arrayBaru[i] + " ");
        }
    }
}


