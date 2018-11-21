package Pertemuan8;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan8C {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Penjumlahan p = new Penjumlahan();
        int x1, x2; double  y1, y2;
        
        System.out.print("Masukkan x1 : ");
        x1 = s.nextInt();
        System.out.print("Masukkan x2 : ");
        x2 = s.nextInt();
        System.out.println(x1 + " + " + x2 + " = " + p.jumlah(x1, x2));
        System.out.println("");
        
        System.out.print("Masukkan y1 : ");
        y1 = s.nextDouble();
        System.out.print("Masukkan y2 : ");
        y2 = s.nextDouble();
        System.out.println(y1 + " + " + y2 + " = " + p.jumlah(y1, y2));
    }
    
}
