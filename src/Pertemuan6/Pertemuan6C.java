package Pertemuan6;

/**
 *
 * @author skadevz
 */
public class Pertemuan6C {
    
    // unicode literal string
    public static void main(String[] args) {
        String nama[] = {"Dono", "Kasino", "Indro"};
        String npm[] = {"001", "002", "003"};
        int nilai[] = {80, 90, 50};
        
        System.out.println("---------------------------------");
        System.out.println("| No\t| Nama\t\t| NPM\t| Nilai\t|");
        System.out.println("---------------------------------");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("| "+(i+1)+"\t| "+nama[i]+"\t\t| "+npm[i]+"\t| "+nilai[i]+"\t|");
        }
        System.out.println("---------------------------------");
    }
    
}
