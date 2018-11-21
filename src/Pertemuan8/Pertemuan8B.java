package Pertemuan8;

import java.util.Scanner;

/**
 *
 * @author skadevz
 */
public class Pertemuan8B {

    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int laki2, perempuan;
        String kelas;
        System.out.print("Masukkan jumlah mahasiswa laki2 : ");
        laki2 = s.nextInt();
        System.out.print("Masukkan jumlah mahasiswa perempuan : ");
        perempuan = s.nextInt();
        System.out.print("Masukkan kelas : ");
        kelas = s.next();
        
        // instansiasi kelas
        // memanggil method di class mahasiswa
        Mahasiswa m = new Mahasiswa();
        m.infoMahasiswa(laki2, perempuan, kelas);
        m.infoMahasiswa(400, 300, 25, 2018);
    }
    
}
