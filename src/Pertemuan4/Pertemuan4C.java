package Pertemuan4;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan4C {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int tinggi;
        System.out.print("Masukkan tinggi : ");
        tinggi = s.nextInt();
        
        for (int i = 0; i <= tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j >= (i-tinggi); j--) {
                System.out.print("8");
            }
            for (int j = 0; j <= (tinggi-i); j++) {
                System.out.print("&");
            }
            System.out.println(" ");
        }
    }
    
}
