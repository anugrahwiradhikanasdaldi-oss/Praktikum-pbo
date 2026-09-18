public class Anggota {

    String nama;
    String nim;
    String jurusan;

    void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }

    void pinjamBuku() {
        System.out.println(nama + " sedang meminjam buku.");
    }

    void kembalikanBuku() {
        System.out.println(nama + " sedang mengembalikan buku.");
    }
}