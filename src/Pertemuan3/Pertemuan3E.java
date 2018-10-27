package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan3E {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nama;
        int absen, gajiharian, totalgaji;
        gajiharian = 150000;
        System.out.print("Masukkan nama yang anda cari : ");
        nama = input.nextLine();
        
        switch (nama) {
            case "Vini":
                absen = 20;
                totalgaji = absen * gajiharian;
                System.out.println("Absen = "+ absen);
                System.out.println("Total Gaji = "+ totalgaji);
                break;
            case "Vidi":
                absen = 25;
                totalgaji = absen * gajiharian;
                System.out.println("Absen = "+ absen);
                System.out.println("Total Gaji = "+ totalgaji);
                break;
            case "Vici":
                absen = 27;
                totalgaji = absen * gajiharian;
                System.out.println("Absen = "+ absen);
                System.out.println("Total Gaji = "+ totalgaji);
                break;
            default:
                System.out.println("Nama yang anda cari tidak ada");
        }
    }
    
}
