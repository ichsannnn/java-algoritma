package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan5D {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int deret;
        System.out.print("Masukkan jumlah deret : ");
        deret = s.nextInt();
        System.out.println(deret + " Deret Pertama");
        deretGenap(0);
    }
    
    static void deretGenap(int i) {
        if (i <= 20) {
            System.out.print(i + " ");
            deretGenap(i += 2);
        } 
    }
    
}
