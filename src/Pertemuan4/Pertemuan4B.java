package Pertemuan4;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan4B {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int tinggi;
        System.out.print("Masukkan tinggi : ");
        tinggi = s.nextInt();
        
        for (int i = 0; i <= tinggi; i++) {
            for (int j = tinggi-1; j >= i; j--) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
}
