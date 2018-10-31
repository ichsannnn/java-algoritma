package Pertemuan6;

import java.util.Random;

/**
 *
 * @author skadevz
 */
public class Pertemuan6E {

    static Random r = new Random();
    public static void main(String[] args) {
        int n;
        int matriksA[][] = new int[5][5];
        int matriksB[][] = new int[5][5];
        
        System.out.println("Matriks A : ");
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                n = r.nextInt(10);
                matriksA[i][j] = n;
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("Matriks B : ");
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                n = r.nextInt(10);
                matriksB[i][j] = n;
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        System.out.println("Hasil Penjumlahan Matriks A dan Matriks B : ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((matriksA[i][j]+matriksB[i][j]) + "\t");
            }
            System.out.println("");
        }
        
    }
    
    
    // PR
    // Masukkan jumlah baris : 3
    // Masukkan jumlah kolom : 3
    // Baris ke-1 kolom 1 : 3
    // Baris ke-1 kolom 2 : 4
    // Baris ke-1 kolom 3 : 5
    // Baris ke-2 kolom 1 : 3
    // Baris ke-2 kolom 2 : 4
    // Baris ke-2 kolom 3 : 5
    // Baris ke-3 kolom 1 : 3
    // Baris ke-3 kolom 2 : 4
    // Baris ke-3 kolom 3 : 5
    
}

