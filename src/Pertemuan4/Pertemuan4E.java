package Pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan4E {

    public static void main(String[] args) {
        int x, y;
        x = Integer.valueOf(JOptionPane.showInputDialog("Masukkan bil"));
        y = Integer.valueOf(JOptionPane.showInputDialog("Masukkan pangkat"));
        
        JOptionPane.showMessageDialog(null, x + " Pangkat " + y +" = " + hitungPangkat(x, y));
    }
    
    public static int hitungPangkat(int x, int y) {
        if (y == 0) return 1;
        else return x*hitungPangkat(x, y-1);
    }
    
}
