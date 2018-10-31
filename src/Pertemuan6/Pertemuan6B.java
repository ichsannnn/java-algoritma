package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan6B {

    // implementasi array dimensi satu untuk menampilkan output berikut:
    // no   nama    npm     nilai
    // 1    Dono    001     80
    // 2    Kasino  002     90
    // 3    Indro   003     50
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {        
        String[] bahasa = new String[5];
        for (int i = 0; i < bahasa.length; i++) {
            System.out.print("Bahasa ke-"+(i+1)+": ");
            bahasa[i] = s.nextLine();
        }
        System.out.println("---------------------------");
        for (String string : bahasa) {
            System.out.println(string);
        }
    }
    
}
