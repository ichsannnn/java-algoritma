package Pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan2D {

    public static void main(String[] args) {
        int nilai;
        nilai = Integer.valueOf(JOptionPane.showInputDialog("Masukan nilai"));
        
        if (nilai > 60 && nilai <= 100) {
            JOptionPane.showMessageDialog(null, "Nilai anda adalah " + nilai+ "\nAnda lulus");
        } else {
            JOptionPane.showMessageDialog(null, "Nilai anda adalah " + nilai+ "\nAnda tidak lulus");
        }
    }
    
}
