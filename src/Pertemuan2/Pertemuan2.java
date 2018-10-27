package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan2 {
    
    public static void main(String[] args) {
        double p, l, luas;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukan panjang = ");
        p = s.nextInt();
        System.out.print("Masukan lebar = ");
        l = s.nextInt();
        
        luas = p*l;
        System.out.println("========================");
        System.out.println("Panjang = " + p);
        System.out.println("Lebar = " + l);
        System.out.println("Luas persegi panjang adalah " + luas);
    }
    
}
