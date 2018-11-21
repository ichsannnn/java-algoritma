package Pertemuan8;

/**
 *
 * @author skadevz
 */
public class KepalaLab extends Dosen {
    
    private final String lab;
    
    public KepalaLab(String namaX, String nimX, String jurusanX, String labX) {
        super(namaX, nimX, jurusanX);
        this.lab = labX;
    }
    
    public void tampilkanKepalaLab() {
        System.out.println("Laboratorium : " + lab);
    }
}
