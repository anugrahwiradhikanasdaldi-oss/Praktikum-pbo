public class DemoPerpustakaan {

    public static void main(String[] args) {

        // Membuat object Buku
        Buku buku1 = new Buku();

        buku1.judul = "Pemrograman Java";
        buku1.penulis = "Budi Santoso";
        buku1.tahunTerbit = 2025;
        buku1.kategori = "Pemrograman";
        Buku buku2 = new Buku();
        buku2.judul = "Pemrograman Python";
        buku2.penulis = "Andi Wijaya";
        buku2.tahunTerbit = 2023;
        buku2.kategori = "Pemrograman";

        // Membuat object Anggota
        Anggota anggota1 = new Anggota();

        anggota1.nama = "Dika";
        anggota1.nim = "101";
        anggota1.jurusan = "Sistem Informasi Bisnis";

        // Menampilkan informasi buku
        System.out.println("=== INFORMASI BUKU ===");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        System.out.println();

        // Menampilkan informasi anggota
        System.out.println("=== INFORMASI ANGGOTA ===");
        anggota1.tampilkanInfo();

        System.out.println();

        // Menjalankan method pinjam
        System.out.println("=== PEMINJAMAN ===");
        anggota1.pinjamBuku();
        buku1.pinjamBuku();

        System.out.println();

        // Menjalankan method pengembalian
        System.out.println("=== PENGEMBALIAN ===");
        anggota1.kembalikanBuku();
        buku1.kembalikanBuku();
    }
}