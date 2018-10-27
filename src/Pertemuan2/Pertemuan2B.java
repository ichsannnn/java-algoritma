package Pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan2B {

    public static void main(String[] args) {
        int c;
        c = Integer.valueOf(JOptionPane.showInputDialog("Masukan Pilihan\n1. Luas Persegi\n2. Luas Persegi Panjang"));
        if (c == 1) {
            int luas, s;
            s = Integer.valueOf(JOptionPane.showInputDialog("Masukan sisi"));
            luas = s*s;
            JOptionPane.showMessageDialog(null, "Luas persegi adalah " + luas);
        } else if (c == 2) {
            int luas, p, l;
            p = Integer.valueOf(JOptionPane.showInputDialog("Masukan panjang"));
            l = Integer.valueOf(JOptionPane.showInputDialog("Masukan lebar"));
            luas = p*l;
            JOptionPane.showMessageDialog(null, "Luas persegi panjang adalah " + luas);
        } else {
            JOptionPane.showMessageDialog(null, "Pilihan salah");
        }
    }
    
}
