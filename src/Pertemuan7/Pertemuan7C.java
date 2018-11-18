package Pertemuan7;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan7C {

    public static void main(String[] args) {
        int nilai;
        try {
            nilai = Integer.valueOf(JOptionPane.showInputDialog("Masukkan nilai : "));
            if (nilai > 60) {
                JOptionPane.showMessageDialog(null, "Nilai = " + nilai + " Anda lulus", "title", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nilai = " + nilai + " Anda tidak lulus", "title", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Salah karena : " + e, "title", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
