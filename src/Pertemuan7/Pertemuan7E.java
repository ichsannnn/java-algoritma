package Pertemuan7;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan7E {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int r, c;
        
        try {
            System.out.print("Masukkan baris : ");
            r = s.nextInt();
            System.out.print("Masukkan kolom : ");
            c = s.nextInt();

            int matriks[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("Masukkan R"+(i+1)+"C"+(j+1)+" : ");
                    matriks[i][j] = s.nextInt();
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matriks[i][j] + "\t");
                }
                System.out.println("");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error karena : " + e);
        }
        
    }
    
}
