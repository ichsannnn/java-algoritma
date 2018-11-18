package Pertemuan7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author skadevz
 */
public class Pertemuan7 {
    
    // Exception handling
    // mekanisme sederhana untuk menangani kesalahan di dalam koding
    // 1. Syntax Error (Penulisan)
    // 2. Runtime Error
    // 3. Logic Error (Fatal Error)
    
    // Cara penanganan error dengan exception
    // 1. mekanisme Throws Exception
    // 2. try catch
    //      bentuk umum : 
    //      try {
    //          statement yang sekiranya terjadi kesalahan;
    //      } catch (jenisException objekPenampungException {
    //          statement peralihan;
    //      }
    //      1. IOException
    //      2. FileNotFoundException
    //      3. NumberFormatException
    
    static BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String nama;
        int uts, uas, rata2;
        
        System.out.print("Masukkan nama anda : ");
        nama = s.readLine();
        System.out.print("Masukkan nilai UTS : ");
        uts = Integer.parseInt(s.readLine());
        System.out.print("Masukkan nilai UAS : ");
        uas = Integer.parseInt(s.readLine());
        rata2 = (uts+uas)/2;
        System.out.println(nama + ", Rata rata nilai anda : " + rata2);
    }
    
}
