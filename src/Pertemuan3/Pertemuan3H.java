package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan3H {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int batas;
        System.out.print("Masukkan batas perulangan : ");
        batas = a.nextInt();
        
        int i = 1;   
        do {
            System.out.println("Perulangan ke-"+ i);
             i++;
        } while (i <= batas);
    }
    
}
