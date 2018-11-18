package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class PRPertemuan6 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int row, col;
        System.out.println("=================================================");
        System.out.print("Masukkan jumlah baris : ");
        row = s.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        col = s.nextInt();
        System.out.println("=================================================");
        int matriks[][] = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print("Baris ke-"+(r+1)+" kolom ke-"+(c+1)+" : ");
                matriks[r][c] = s.nextInt();
            }
        }
        System.out.println("=================================================");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=================================================");
    }
    
}
