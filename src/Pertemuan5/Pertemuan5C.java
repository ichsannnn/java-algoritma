package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan5C {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String kata, balik;
        System.out.print("Masukkan kata yang akan dibalik : ");
        kata = s.nextLine();
        balik = balikKata(kata);
        if (kata.equals(balik)) {
            System.out.println("Kata tersebut jika dibalik menghasilkan kata yang sama");
        } else {
            System.out.println("Kata tersebut jika dibalik menghasilkan kata yang berbeda");
        }
        System.out.println("Hasil kata yang dibalik : " + balikKata(kata));
    }
    
    public static String balikKata(String kata) {
        if (kata.length() == 0) {
            return "Anda tidak memasukkan kata";
        } else if (kata.length() == 1) {
            return kata;
        } else {
            char B = kata.charAt(0);
            return balikKata(kata.substring(1)) + B;
        }
    }
    
}
