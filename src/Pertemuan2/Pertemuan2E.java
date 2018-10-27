package Pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan2E {

    public static void main(String[] args) {
        int angka;
        angka = Integer.valueOf(JOptionPane.showInputDialog("Masukan sebuah angka"));
        
        if (angka % 2 == 1) {
            JOptionPane.showMessageDialog(null, "Angka tersebut merupakan bilangan ganjil");
        } else {
            JOptionPane.showMessageDialog(null, "Angka tersebut merupakan bilangan genap");
        }
    }
    
}
