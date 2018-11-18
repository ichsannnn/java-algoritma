package Pertemuan7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author skadevz
 */
public class Pertemuan7B {

    public static void main(String[] args) throws IOException {
        String namaFolder = "Folder Baru";
        String namaFile = "Belajar.txt";
        String isiFile = "lorem ipsum dolor sit amet";
        buatFolder(namaFolder);
        buatFile(namaFolder, namaFile);
        buatIsiFile(namaFolder, namaFile, isiFile);
        bacaFile(namaFolder, namaFile);
    }
    
    public static void buatFolder(String namaFolder) {
        File file = new File("src/" + namaFolder);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
    
    public static void buatFile(String namaFolder, String namaFile) throws IOException {
        File file = new File("src/" + namaFolder + "/" + namaFile);
        file.createNewFile();
    }
    
    public static void buatIsiFile(String namaFolder, String namaFile, String isiFile) throws IOException {
        File file = new File("src/" + namaFolder + "/" + namaFile);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter s = new BufferedWriter(fw);
        s.write(isiFile);
        s.close();
    }
    
    public static void bacaFile(String namaFolder, String namaFile) throws FileNotFoundException, IOException {
        BufferedReader s;
        String teks = "";
        String baris;
        
        s = new BufferedReader(new FileReader("src/" + namaFolder + "/" + namaFile));
        while ((baris=s.readLine()) != null) {
            teks = teks+baris;
        }
        System.out.println("Teks dari File = " + teks);
    }
    
}
