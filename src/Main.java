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
        int totalAttributes = 4;
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

// Kelas Main
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
