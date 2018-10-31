package Pertemuan6;

/**
 *
 * @author skadevz
 */
public class Pertemuan6D {

    public static void main(String[] args) {
        int matriksA[][] = {{3, 7, 8, 2}, {5, 3, 2, 1}, {5, 9, 0, 3}};
        int matriksB[][] = {{4, 2, 1, 0}, {8, 1, 6, 7}, {9, 0, 1, 3}};
        System.out.println("Matriks A : ");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print(matriksA[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriks B : ");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                System.out.print(matriksB[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Hasil Penjumlahan Matriks A dan Matriks B : ");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print((matriksA[i][j]+matriksB[i][j]) + "\t");
            }
            System.out.println("");
        }
    }
    
}
