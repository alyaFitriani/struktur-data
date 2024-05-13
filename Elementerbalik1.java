 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uts.elementerbalik1;

/**
 *
 * @author Administrator
 */

public class Elementerbalik1 {


//public class Main {
    public static void main(String[] args) {
        // Inisialisasi dan isi array
        int[] arr = {1, 2, 3, 4, 5};

        // Cetak array sebelum dibalik
        System.out.print("Array sebelum dibalik: ");
        for (int i=0; i<5; i++)
        {System.out.print(arr[i]+", ");}

        // Panggil metode untuk membalikkan array
        reverseArray(arr);

        // Cetak array setelah dibalik
        System.out.print("Array setelah dibalik: ");
        for (int i=0; i<5; i++)
        {System.out.print(arr[i]+", ");}
    }

    // Metode untuk membalikkan array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}



