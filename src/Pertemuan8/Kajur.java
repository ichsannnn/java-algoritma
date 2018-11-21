package Pertemuan8;

/**
 *
 * @author skadevz
 */

// bentuk inheritance
// class kajur - subclass (child class)
public class Kajur extends Dosen {
    // =====================START NOTE=====================
    // Konsep object pada java
    // Java termasuk PBO - Pemrograman yang berorientasi Objek
    // Desain -> Rumah
    // class  -> objek
    // Syarat terbentuknya objk :
    // 1. memiliki Atribut (database(field), program(variabel dan konstanta))
    // 2. memiliki method 
    // kemampuan pemrograman objek
    // 1. Inheritance / pewarisan / turunan
    // 2. Polymorphism
    // 3. 
    // Java terdapat constructor akan tetapi tidak terlalu membutuhkan destructor
    // Java - mendukung Garbage Collection
    // Java menghilangkan penggunaan pointer atau pengalamatan yang sulit di C
    // =====================END NOTE=====================
    
    // Information hiding - Encapsulation
    // Modifier access -private
    private final int thmulai;
    private final int jabatanke;

    // constructor
    public Kajur(String namaX, String nimX, String jurusanX, int thmulaiX, int jabatankeX) {
        super(namaX, nimX, jurusanX);
        
        this.thmulai = thmulaiX;
        this.jabatanke = jabatankeX;
    }

    // method
    public void tampilkanKajur() {
        System.out.println("Jabatan Kajur mulai Tahun : " + thmulai);
        System.out.println("Jabatan Kajur adalah jabatan ke : " + jabatanke);
    }
    
    // method overriding
    public void tampilkan() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
    
    // method overloading
    public void tampilkan(int gaji) {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
    
    // method overloading dan overriding -- polymorphism
    
}
