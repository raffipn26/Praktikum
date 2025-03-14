package Bab_1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Kategori> daftarKategori = new ArrayList<>();
        String[] namaKategori = {"Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};
        
        for (String nama : namaKategori) {
            daftarKategori.add(new Kategori(nama));
        }

        daftarKategori.get(0).tambahBuku(new Buku("Pemrograman Java", List.of("John Doe"), "Teknologi"));
        daftarKategori.get(0).tambahBuku(new Buku("Artificial Intelligence", List.of("Jane Smith"), "Teknologi"));
        daftarKategori.get(0).tambahBuku(new Buku("Cyber Security", List.of("Alice Brown"), "Teknologi"));
        daftarKategori.get(0).tambahBuku(new Buku("Data Science", List.of("Bob White"), "Teknologi"));
        daftarKategori.get(0).tambahBuku(new Buku("Cloud Computing", List.of("Charlie Green"), "Teknologi"));
        
        daftarKategori.get(1).tambahBuku(new Buku("Filsafat Modern", List.of("Jean Paul"), "Filsafat"));
        daftarKategori.get(1).tambahBuku(new Buku("Eksistensialisme", List.of("Albert Camus"), "Filsafat"));
        daftarKategori.get(1).tambahBuku(new Buku("Metafisika", List.of("Plato"), "Filsafat"));
        daftarKategori.get(1).tambahBuku(new Buku("Logika", List.of("Aristoteles"), "Filsafat"));
        daftarKategori.get(1).tambahBuku(new Buku("Pemikiran Karl Marx", List.of("Karl Marx"), "Filsafat"));
        
        daftarKategori.get(2).tambahBuku(new Buku("Sejarah Dunia", List.of("William Durant"), "Sejarah"));
        daftarKategori.get(2).tambahBuku(new Buku("Sejarah Islam", List.of("Karen Armstrong"), "Sejarah"));
        daftarKategori.get(2).tambahBuku(new Buku("Sejarah Perang Dunia", List.of("John Keegan"), "Sejarah"));
        daftarKategori.get(2).tambahBuku(new Buku("Sejarah Nusantara", List.of("Anhar Gonggong"), "Sejarah"));
        daftarKategori.get(2).tambahBuku(new Buku("Sejarah Ekonomi", List.of("Adam Smith"), "Sejarah"));
        
        daftarKategori.get(3).tambahBuku(new Buku("Islam dan Modernitas", List.of("Fazlur Rahman"), "Agama"));
        daftarKategori.get(3).tambahBuku(new Buku("Filsafat Agama", List.of("Harun Nasution"), "Agama"));
        daftarKategori.get(3).tambahBuku(new Buku("Sejarah Gereja", List.of("John McManners"), "Agama"));
        daftarKategori.get(3).tambahBuku(new Buku("Hindu dan Budha", List.of("R.C. Majumdar"), "Agama"));
        daftarKategori.get(3).tambahBuku(new Buku("Taoisme", List.of("Laozi"), "Agama"));
        
        for (Kategori kategori : daftarKategori) {
            kategori.displayBuku();
        }
    }
}
