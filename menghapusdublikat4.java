/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
    import java.util.Arrays;
public class menghapusdublikat4 {


    public static void main(String[] args) {
        int[] arrayInput = {1, 2, 2, 3, 4, 4, 5};
        
        // Menampilkan array sebelum menghapus duplikat
        System.out.println("Array sebelum menghapus duplikat: " + Arrays.toString(arrayInput));
        
        // Menghapus duplikat
        int lengthWithoutDuplicates = removeDuplicates(arrayInput);
        
        // Membuat array baru tanpa duplikat
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayInput, lengthWithoutDuplicates);
        
        // Menampilkan array setelah menghapus duplikat
        System.out.println("Array setelah menghapus duplikat: " + Arrays.toString(arrayWithoutDuplicates));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
      
}
}
    

