package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan2F {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String nama;
        double bonus, hargajual, hargatoko;
        
        System.out.print("Masukan nama : ");
        nama = s.nextLine();
        System.out.print("Masukan harga jual : ");
        hargajual = s.nextDouble();
        System.out.print("Masukan harga toko : ");
        hargatoko = s.nextDouble();
        
        if (hargajual > hargatoko) {
            bonus = 0.05 * hargajual;
            System.out.println("Selamat " + nama + ", anda mendapat bonus Rp. " + bonus);
        } else {
            bonus = 0;
            System.out.println(nama + ", maaf anda tidak mendapat bonus");
        }   
    }
    
}
