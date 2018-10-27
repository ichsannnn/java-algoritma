package Pertemuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan3 {

    public static void main(String[] args) {
        int x, y;
        x = Integer.valueOf(JOptionPane.showInputDialog("Masukkan X"));
        y = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Y"));
        
        if (x > y) {
            JOptionPane.showMessageDialog(null, "X adalah "+ x +"\nY adalah "+ y +"\nX lebih besar dari Y");
        } else if (x < y) {
            JOptionPane.showMessageDialog(null, "X adalah "+ x +"\nY adalah "+ y +"\nX lebih kecil dari Y");
        } else {
            JOptionPane.showMessageDialog(null, "X adalah "+ x +"\nY adalah "+ y +"\nX sama dengan Y");
        }
    }
    
}
