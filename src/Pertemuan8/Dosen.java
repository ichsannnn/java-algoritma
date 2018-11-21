package Pertemuan8;

/**
 *
 * @author skadevz
 */

// class dosen - parent class (superclass)
public class Dosen {

    protected String nama;
    protected String nim;
    protected String jurusan;
    
    // constructor method
    Dosen(String namaX, String nimX, String jurusanX) {
        // this - kata kunci di java untuk menunjukan atribut dari objek
        // diikuti dengan delimiter titik
        this.nama = namaX;
        this.nim = nimX;
        this.jurusan = jurusanX;
    }
    
    public void tampilkan() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}
