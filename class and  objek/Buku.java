public class Buku {

    String judul;
    String penulis;
    int tahunTerbit;
    String kategori;

    void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Kategori    : " + kategori);
    }

    void pinjamBuku() {
        System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
    }

    void kembalikanBuku() {
        System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
    }
}