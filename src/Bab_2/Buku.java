package Bab_2;

import java.util.List;
import java.util.ArrayList;

// Kelas Buku
class Buku {
    private String judul;
    private List<String> penulis;
    private String kategori;
    private String sinopsis;

    public Buku(String judul, List<String> penulis, String kategori, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
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
    
    public String getSinopsis() {
        return sinopsis;
    }

    public int hitungJumlahKataSinopsis() {
        return sinopsis.split(" ").length;
    }

    public double cekTingkatKesamaan(Buku bukuLain) {
        int totalAttributes = 4; // judul, penulis, kategori, sinopsis
        int matchCount = 0;

        if (this.judul.equalsIgnoreCase(bukuLain.judul)) matchCount++;
        if (this.kategori.equalsIgnoreCase(bukuLain.kategori)) matchCount++;
        if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)) matchCount++;
        if (this.penulis.equals(bukuLain.penulis)) matchCount++;

        return (matchCount / (double) totalAttributes) * 100;
    }

    public Buku copy() {
        return new Buku(this.judul, new ArrayList<>(this.penulis), this.kategori, this.sinopsis);
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + String.join(", ", penulis));
        System.out.println("Kategori: " + kategori);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Jumlah kata dalam sinopsis: " + hitungJumlahKataSinopsis());
        System.out.println();
    }
}