package kuizz.sertifikasi;
public class PesertaSertifikasi {
    private final String id;
    private final String nama;
    private double nilaiPraktik;
    private double nilaiTeori;
    private double nilaiProyek;

    private static final double BOBOT_PRAKTIK = 0.4;
    private static final double BOBOT_TEORI = 0.3;
    private static final double BOBOT_PROYEK = 0.3;
    private static final double BATAS_LULUS = 70;
    private static final double BATAS_MINIMUM_KOMPONEN = 60;

    public PesertaSertifikasi(String id, String nama, double nilaiPraktik, double nilaiTeori, double nilaiProyek) {
        this.id = id;
        this.nama = nama;
        // memanfaatkan setter agar validasi tetap berjalan sejak object dibuat
        setNilaiPraktik(nilaiPraktik);
        setNilaiTeori(nilaiTeori);
        setNilaiProyek(nilaiProyek);
    }

    // ===== Getter =====
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiPraktik() {
        return nilaiPraktik;
    }

    public double getNilaiTeori() {
        return nilaiTeori;
    }

    public double getNilaiProyek() {
        return nilaiProyek;
    }

    // ===== Setter dengan validasi rentang 0-100 =====
    // id sengaja TIDAK memiliki setter agar tidak bisa diubah setelah object dibuat
    public String setNilaiPraktik(double nilai) {
        if (!nilaiValid(nilai)) {
            return "GAGAL: Nilai praktik " + nilai + " di luar rentang 0-100.";
        }
        this.nilaiPraktik = nilai;
        return "BERHASIL: Nilai praktik diperbarui menjadi " + nilai;
    }

    public String setNilaiTeori(double nilai) {
        if (!nilaiValid(nilai)) {
            return "GAGAL: Nilai teori " + nilai + " di luar rentang 0-100.";
        }
        this.nilaiTeori = nilai;
        return "BERHASIL: Nilai teori diperbarui menjadi " + nilai;
    }

    public String setNilaiProyek(double nilai) {
        if (!nilaiValid(nilai)) {
            return "GAGAL: Nilai proyek " + nilai + " di luar rentang 0-100.";
        }
        this.nilaiProyek = nilai;
        return "BERHASIL: Nilai proyek diperbarui menjadi " + nilai;
    }

    private boolean nilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    // ===== Method bisnis =====
    public double hitungNilaiAkhir() {
        return (nilaiPraktik * BOBOT_PRAKTIK) + (nilaiTeori * BOBOT_TEORI) + (nilaiProyek * BOBOT_PROYEK);
    }

    public boolean isLulus() {
        double nilaiAkhir = hitungNilaiAkhir();
        boolean semuaKomponenMemenuhi = nilaiPraktik >= BATAS_MINIMUM_KOMPONEN
                && nilaiTeori >= BATAS_MINIMUM_KOMPONEN
                && nilaiProyek >= BATAS_MINIMUM_KOMPONEN;
        return nilaiAkhir >= BATAS_LULUS && semuaKomponenMemenuhi;
    }

    public String statusKelulusan() {
        double nilaiAkhir = hitungNilaiAkhir();
        boolean semuaKomponenMemenuhi = nilaiPraktik >= BATAS_MINIMUM_KOMPONEN
                && nilaiTeori >= BATAS_MINIMUM_KOMPONEN
                && nilaiProyek >= BATAS_MINIMUM_KOMPONEN;

        if (isLulus()) {
            return "LULUS";
        } else if (nilaiAkhir < BATAS_LULUS && semuaKomponenMemenuhi) {
            return "TIDAK LULUS (nilai akhir " + String.format("%.2f", nilaiAkhir) + " di bawah batas " + BATAS_LULUS + ")";
        } else if (!semuaKomponenMemenuhi) {
            return "TIDAK LULUS (ada komponen nilai di bawah " + BATAS_MINIMUM_KOMPONEN + ")";
        } else {
            return "TIDAK LULUS";
        }
    }

    public String tampilkanInfo() {
        return "Peserta " + id + " - " + nama
                + " | Praktik: " + nilaiPraktik
                + " | Teori: " + nilaiTeori
                + " | Proyek: " + nilaiProyek
                + " | Nilai Akhir: " + String.format("%.2f", hitungNilaiAkhir())
                + " | Status: " + statusKelulusan();
    }
}