package Pertemuan8;

/**
 *
 * @author skadevz
 */
public class Mahasiswa {

    // overloading method
    // 
    public void infoMahasiswa(int laki2, int perempuan, String kelas) {
        // informasi mahasiswa kelas A
        int jumlah = laki2+perempuan;
        System.out.println(kelas + ". Jumlah mahasiswa = " + jumlah);
    } 
    
    public void infoMahasiswa(int mahasiswaLama, int mahasiswaBaru, int mahasiswaCuti, int angkatan){
        int jumlah = mahasiswaLama + mahasiswaBaru + mahasiswaCuti;
        System.out.println("Sampai Tahun : " + angkatan + " Jumlah mahasiswa = " + jumlah);
        
    }
    
}
