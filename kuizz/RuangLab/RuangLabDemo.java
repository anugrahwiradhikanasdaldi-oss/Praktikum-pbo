package kuizz.RuangLab;
public class  RuangLabDemo {
    public static void main(String[] args) {
        System.out.println("=== UJIAN PRAKTIKUM PBO - SOAL 1: RESERVASI RUANG LABORATORIUM ===\n");

        // Membuat 3 objek ruang dengan kondisi awal tersedia
        RuangLab ruang1 = new RuangLab("LAB-01", "Laboratorium Jaringan", 20);
        RuangLab ruang2 = new RuangLab("LAB-02", "Laboratorium Pemrograman", 15);
        RuangLab ruang3 = new RuangLab("LAB-03", "Laboratorium Multimedia", 10);

        System.out.println("--- Informasi Awal Ruang ---");
        System.out.println(ruang1.tampilkanInfo());
        System.out.println(ruang2.tampilkanInfo());
        System.out.println(ruang3.tampilkanInfo());

        System.out.println("\n--- Pengujian Pemesanan & Pembatalan ---");

        // BERHASIL 1: pemesanan valid
        System.out.println(ruang1.pesan(18));

        // BERHASIL 2: pemesanan valid pada ruang lain
        System.out.println(ruang2.pesan(10));

        // DITOLAK 1: jumlah peserta 0
        System.out.println(ruang3.pesan(0));

        // DITOLAK 2: jumlah peserta melebihi kapasitas
        System.out.println(ruang3.pesan(25));

        // DITOLAK 3: ruang sudah dipesan
        System.out.println(ruang1.pesan(5));

        // Pengujian tambahan: pembatalan ditolak karena ruang masih tersedia
        System.out.println(ruang3.batalkan());

        // Pembatalan valid
        System.out.println(ruang1.batalkan());

        System.out.println("\n--- Percobaan Ubah Data Lewat Method (Bukan Akses Langsung) ---");
        System.out.println(ruang2.ubahInfoRuang("Laboratorium Pemrograman Lanjut", 18));
        System.out.println(ruang2.ubahInfoRuang("", -5)); // percobaan tidak valid

        System.out.println("\n--- Informasi Akhir Ruang ---");
        System.out.println(ruang1.tampilkanInfo());
        System.out.println(ruang2.tampilkanInfo());
        System.out.println(ruang3.tampilkanInfo());
    }
}