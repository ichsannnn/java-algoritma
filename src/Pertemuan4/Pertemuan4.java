package Pertemuan4;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan4 {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int tinggi;
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = s.nextInt();
        
        for (int i = 0; i <= tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
}
