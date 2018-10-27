package Pertemuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan3B {

    // Nilai 80-100 adalah A
    // Nilai 70-79 adalah B
    // Nilai 60-69 adalah C
    // Nilai 40-59 adalah D
    // Nilai 0-39 adalah E
    
    public static void main(String[] args) {
        int nilai;
        nilai = Integer.valueOf(JOptionPane.showInputDialog("Masukan nilai mahasiswa"));
        
        if (nilai >= 80 && nilai <= 100) {
            JOptionPane.showMessageDialog(null, "Nilai anda adalah "+ nilai +"\nSelamat anda mendapat nilai A");
        } else if (nilai >= 70 && nilai < 80) {
            JOptionPane.showMessageDialog(null, "Nilai anda adalah "+ nilai +"\nSelamat anda mendapat nilai B");
        } else if (nilai >= 60 && nilai < 70) {
            JOptionPane.showMessageDialog(null, "Nilai anda adalah "+ nilai +"\nSelamat anda mendapat nilai C");
        } else if (nilai >= 40 && nilai < 60) {
            JOptionPane.showMessageDialog(null, "Nilai anda adalah "+ nilai +"\nSelamat anda mendapat nilai D");
        } else if (nilai >= 0 && nilai < 40) {
            JOptionPane.showMessageDialog(null, "Nilai anda adalah "+ nilai +"\nSelamat anda mendapat nilai E");
        } else {
            JOptionPane.showMessageDialog(null, "Masukkan nilai 0-100");
        }
    }
    
}
