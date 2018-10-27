package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan5E {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        System.out.print("Masukkan bilangan A : ");
        a = s.nextInt();
        System.out.print("Masukkan bilangan B : ");
        b = s.nextInt();
        
        System.out.println("M("+a+", " +b+") = " + hitungM(a, b));
        if (hitungM(a, b) == 1) {
            System.out.println(a + " dan " + b + " Relatif Prima");
        } else {
            System.out.println(a + " dan " + b + " Tidak Relatif Prima");
        }
    }
    
    public static int hitungM(int a, int b) {
        if (b == 0) return a;
        else return hitungM(b, a%b);
    }
    
}
