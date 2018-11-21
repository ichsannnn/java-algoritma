package Pertemuan8;

/**
 *
 * @author skadevz
 */
public class Pertemuan8 {

    public static void main(String[] args) {
        // cara memanggil attribut atau method
        // Bentuk Umum : namaKelas namaObjectBaru = new namaKelas(parameter);
        // Cara akses : namaObjectBaru.(namaAttribut/Method)
        Kajur ka = new Kajur("Ichsan", "23", "Informatika", 2018, 3);
        KepalaLab kl = new KepalaLab("Ichsan", "17", "Informatika", "Komputasi");
        Dekan de = new Dekan("Ichsan", "21", "Informatika", "Teknologi Industri");
        
        // Cara memanggil method
        // instansiasi class
        System.out.println("--------------------------------------------------");
        ka.tampilkan();
        ka.tampilkanKajur();
        System.out.println("--------------------------------------------------");
        kl.tampilkan();
        kl.tampilkanKepalaLab();
        System.out.println("--------------------------------------------------");
        de.tampilkan();
        de.tampilkanDekan();
        System.out.println("--------------------------------------------------");
    }
    
}
