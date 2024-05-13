/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.elementerbalik1;

/**
 *
 * @author Administrator
 */
import java.util.HashMap;

public class jumlahkemunculanelemen3 {
    public static void main(String[] args) {
        int[] arrayInput = {1, 2, 1, 3, 4, 2, 1};
        
        // Membuat objek HashMap untuk menyimpan jumlah kemunculan setiap elemen
        HashMap<Integer, Integer> counts = new HashMap<>();
        
        // Menghitung jumlah kemunculan setiap elemen dalam array
        for (int num : arrayInput) {
            if (counts.containsKey(num)) {
                // Jika elemen sudah ada dalam HashMap, tambahkan 1 ke jumlahnya
                counts.put(num, counts.get(num) + 1);
            } else {
                // Jika elemen belum ada dalam HashMap, tambahkan dengan jumlah awal 1
                counts.put(num, 1);
            }
        }
        
        // Mencetak jumlah kemunculan setiap elemen
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (int key : counts.keySet()) {
            System.out.println(key + " : " + counts.get(key));
        }
    }
    
}
