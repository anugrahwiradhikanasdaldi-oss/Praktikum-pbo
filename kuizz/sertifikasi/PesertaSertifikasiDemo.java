package kuizz.sertifikasi;

public class PesertaSertifikasiDemo {
    public static void main(String[] args) {
        System.out.println("=== UJIAN PRAKTIKUM PBO - SOAL 2: PENILAIAN SERTIFIKASI MAHASISWA ===\n");

        // Peserta 1: LULUS (nilai akhir >= 70 dan semua komponen >= 60)
        PesertaSertifikasi peserta1 = new PesertaSertifikasi("P001", "Nasdaldi Wiradhika", 85, 80, 75);

        // Peserta 2: TIDAK LULUS karena nilai akhir < 70 (walau semua komponen >= 60)
        PesertaSertifikasi peserta2 = new PesertaSertifikasi("P002", "Budi Santoso", 65, 60, 65);

        // Peserta 3: TIDAK LULUS karena salah satu komponen < 60 (walau nilai akhir >= 70)
        PesertaSertifikasi peserta3 = new PesertaSertifikasi("P003", "Citra Lestari", 90, 55, 90);

        System.out.println("--- Hasil Penilaian Peserta ---");
        System.out.println(peserta1.tampilkanInfo());
        System.out.println(peserta2.tampilkanInfo());
        System.out.println(peserta3.tampilkanInfo());

        System.out.println("\n--- Pengujian Validasi Nilai ---");
        // Perubahan nilai valid lewat method (bukan akses langsung ke atribut)
        System.out.println(peserta1.setNilaiTeori(95));

        // Pengujian nilai tidak valid
        System.out.println(peserta2.setNilaiPraktik(150)); // di atas 100
        System.out.println(peserta3.setNilaiProyek(-10));  // di bawah 0

        System.out.println("\n--- Informasi Akhir Setelah Pengujian ---");
        System.out.println(peserta1.tampilkanInfo());
        System.out.println(peserta2.tampilkanInfo());
        System.out.println(peserta3.tampilkanInfo());
    }
}

