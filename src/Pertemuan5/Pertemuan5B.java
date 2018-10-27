package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan5B {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int cakram;
        System.out.print("Masukkan jumlah cakram : ");
        cakram = s.nextInt();
        System.out.println("");
        System.out.println("Tower of Hanoi Map");
        System.out.println("------------------");
        pindahkanCakram(cakram, 'A', 'B', 'C');
    }
    
    public static void pindahkanCakram(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Pindahkan Cakram " + n + " Dari " + A + " Ke " + C);
        } else {
            pindahkanCakram(n-1, A, B, C);
            System.out.println("Pindahkan Cakram " + n + " Dari " + A + " Ke " + C);
            pindahkanCakram(n-1, B, C, A);
        }
    }
    
}
