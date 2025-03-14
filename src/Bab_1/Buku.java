package Bab_1;

import java.util.ArrayList;
import java.util.List;

// Kelas Buku
class Buku {
    private String judul;
    private List<String> penulis;
    private String kategori;

    public Buku(String judul, List<String> penulis, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public List<String> getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + String.join(", ", penulis));
        System.out.println("Kategori: " + kategori);
        System.out.println();
    }
}

// Kelas Kategori
class Kategori {
    private String nama;
    private List<Buku> daftarBuku;

    public Kategori(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void displayBuku() {
        System.out.println("Kategori: " + nama);
        for (Buku buku : daftarBuku) {
            buku.displayInfo();
        }
    }
}
