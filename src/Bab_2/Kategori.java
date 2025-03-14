package Bab_2;

import java.util.List;
import java.util.ArrayList;

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
