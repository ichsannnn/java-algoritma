package Pertemuan4;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan4D {

    // Daftar menu
    // nasi goreng, soto ayam, sop iga, batagor
    // nasigoreng = 24000
    // ingin menu yg lain? [y/t]: y
    // soto ayam= 15000
    // ingin menu yg lain? [y/t]: t
    // total pembayaran = 39000

    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a, bayar = 0;
        String menu;
        
        System.out.println("---------------------------");
        System.out.println("--------Daftar Menu--------");
        System.out.println("---------------------------");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Soto Ayam");
        System.out.println("3. Sop Iga");
        System.out.println("4. Batagor");
        System.out.println("---------------------------");
        System.out.println("");

//      ===============START WITH FOR===============        
//        for (String b = "y"; b.equalsIgnoreCase("y");) {
//            System.out.print("Masukan pilihan menu [1-4] : ");
//            a = s.nextInt();
//            
//            if (a == 1) {
//                System.out.println("Nasi Goreng = Rp.22000,-");
//                bayar = bayar + 22000;
//            } else if (a == 2) {
//                System.out.println("Soto Ayam = Rp.18000-");
//                bayar = bayar + 18000;                
//            } else if (a == 3) {
//                System.out.println("Sop Iga = Rp.40000,-");
//                bayar = bayar + 40000;                
//            } else if (a == 4) {
//                System.out.println("Batagor = Rp.15000,-");
//                bayar = bayar + 15000;                
//            } else {
//                System.out.println("Pilihan tidak ada di menu..");
//            }
//            
//            System.out.print("Ingin mencari menu lain [y/t] : ");
//            b = s.next();
//        }
        
//        System.out.println("Total Pembayaran " + bayar);
//      ===============END WITH FOR===============
        
//      ===============START WITH DO WHILE===============
        do {
            System.out.print("Masukan pilihan menu [1-4] : ");
            a = s.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nasi Goreng = Rp.22000,-");
                    bayar += 22000;
                    System.out.print("Ingin mencari menu lain [y/t] : ");
                    menu = s.next();
                    break;
                case 2:
                    System.out.println("Soto Ayam = Rp.18000-");
                    bayar += 18000;
                    System.out.print("Ingin mencari menu lain [y/t] : ");
                    menu = s.next();
                    break;
                case 3:
                    System.out.println("Sop Iga = Rp.40000,-");
                    bayar += 40000;
                    System.out.print("Ingin mencari menu lain [y/t] : ");
                    menu = s.next();
                    break;
                case 4:
                    System.out.println("Batagor = Rp.15000,-");
                    bayar += 15000;
                    System.out.print("Ingin mencari menu lain [y/t] : ");
                    menu = s.next();
                    break;
                default:
                    System.out.println("Pilihan tidak ada di menu");
                    System.out.println("");
                    System.out.print("Ingin mencari menu lain [y/t] : ");
                    menu = s.next();
                    break;
            }
        } while(menu.equalsIgnoreCase("y") || menu.equalsIgnoreCase("ya"));
        System.out.println("Total Pembayaran = " + bayar);
//      ===============END WITH DO WHILE===============
    }
    
}
