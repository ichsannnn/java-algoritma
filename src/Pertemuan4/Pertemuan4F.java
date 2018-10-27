package Pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Pertemuan4F {

    public static void main(String[] args) {
        int n;
        n = Integer.valueOf(JOptionPane.showInputDialog("Masukkan bilangan"));
        
        JOptionPane.showMessageDialog(null, n+ "! = " + faktorial(n));
    }
    
    public static int faktorial(int n) {
        if (n == 0) return 1;
        else return n*faktorial(n-1);
    }
    
}
