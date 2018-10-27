package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan3I {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y;
        
        y = 2;
        System.out.print("Masukkan batas yang akan ditampilkan: ");
        x = s.nextInt();
        
        for (int i = 0; i < x; i++) {
            System.out.println(y);
            y += 2;
        }
    }
    
}
