package Bab_2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Kategori> daftarKategori = new ArrayList<>();
        String[] namaKategori = {"Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};
        
        for (String nama : namaKategori) {
            daftarKategori.add(new Kategori(nama));
        }

        daftarKategori.get(0).tambahBuku(new Buku("Pemrograman Java", List.of("John Doe"), "Teknologi", "Buku ini membahas konsep pemrograman Java secara mendalam dan praktis."));
        daftarKategori.get(0).tambahBuku(new Buku("Artificial Intelligence", List.of("Jane Smith"), "Teknologi", "Sebuah buku yang membahas perkembangan kecerdasan buatan dan aplikasinya."));
        daftarKategori.get(0).tambahBuku(new Buku("Cyber Security", List.of("Alice Brown"), "Teknologi", "Buku ini menjelaskan tentang keamanan siber dan cara melindungi data."));
        daftarKategori.get(0).tambahBuku(new Buku("Data Science", List.of("Bob White"), "Teknologi", "Panduan lengkap tentang data science dan bagaimana menerapkannya."));
        daftarKategori.get(0).tambahBuku(new Buku("Cloud Computing", List.of("Charlie Green"), "Teknologi", "Sebuah buku yang membahas dasar-dasar komputasi awan dan manfaatnya."));
        
        for (Kategori kategori : daftarKategori) {
            kategori.displayBuku();
        }

        Buku buku1 = new Buku("Pemrograman Java", List.of("John Doe"), "Teknologi", "Buku ini membahas konsep pemrograman Java secara mendalam dan praktis.");
        Buku buku2 = new Buku("Artificial Intelligence", List.of("Jane Smith"), "Teknologi", "Sebuah buku yang membahas perkembangan kecerdasan buatan dan aplikasinya.");

        System.out.println("Tingkat kesamaan antara buku1 dan buku2: " + buku1.cekTingkatKesamaan(buku2) + "%");

        Buku bukuCopy = buku1.copy();
        System.out.println("Salinan Buku:");
        bukuCopy.displayInfo();
    }
}
