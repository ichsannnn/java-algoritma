package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan5 {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int deret;
        System.out.print("Masukkan jumlah deret : ");
        deret = s.nextInt();
        for (int i = 0; i < deret; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    
}
