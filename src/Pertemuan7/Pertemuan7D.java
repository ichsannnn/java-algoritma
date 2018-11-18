package Pertemuan7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan7D {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z;
        try {
            System.out.print("Masukkan nilai x : ");
            x = s.nextInt();
            System.out.print("Masukkan nilai y : ");
            y = s.nextInt();
            z = x/y;
            System.out.println("Hasil Pembagian : " + z);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Error karena : " + e);
        }
        // catch (InputMismatchException e) {
        //     System.out.println("Error karena : " + e);
        // }
        
    }
    
}
