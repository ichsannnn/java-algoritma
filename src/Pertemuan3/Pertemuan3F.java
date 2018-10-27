package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan3F {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int batas;
        System.out.print("Masukkan batas perulangan : ");
        batas = a.nextInt();
        
        for (int i = 1; i <= batas; i++) {
            System.out.println("Perulangan ke-"+ i);
        }
    }
    
}
