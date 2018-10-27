package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan2C {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int luas, p, l;
        
        System.out.print("Masukan panjang : ");
        p = s.nextInt();
        System.out.print("Masukan lebar : ");
        l = s.nextInt();
        luas = p*l;
        
        System.out.println("Luas persegi panjang adalah " + luas);
    }
    
}
