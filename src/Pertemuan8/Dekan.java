package Pertemuan8;

/**
 *
 * @author skadevz
 */
public class Dekan extends Dosen {
    
    private final String fakultas;
    
    public Dekan(String namaX, String nimX, String jurusanX, String fakultasX) {
        super(namaX, nimX, jurusanX);
        this.fakultas = fakultasX;
    }
    
    public void tampilkanDekan() {
        System.out.println("Fakultas : " + fakultas);
    }
    
}
