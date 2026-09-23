package kuizz.RuangLab;
public class RuangLab {
    private final String idRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean tersedia;

    public RuangLab(String idRuang, String namaRuang, int kapasitas) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.tersedia = true; // kondisi awal selalu tersedia
    }

    //Getter 
    public String getIdRuang() {
        return idRuang;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    // Setter dengan validasi 
    // idRuang sengaja TIDAK memiliki setter agar tidak bisa diubah setelah object dibuat
    public String ubahInfoRuang(String namaBaru, int kapasitasBaru) {
        if (namaBaru == null || namaBaru.trim().isEmpty()) {
            return "GAGAL: Nama ruang tidak boleh kosong.";
        }
        if (kapasitasBaru <= 0) {
            return "GAGAL: Kapasitas harus lebih dari 0.";
        }
        this.namaRuang = namaBaru;
        this.kapasitas = kapasitasBaru;
        return "BERHASIL: Informasi ruang " + idRuang + " diperbarui.";
    }

    // ===== Method bisnis =====
    public String pesan(int jumlahPeserta) {
        if (jumlahPeserta <= 0) {
            return "DITOLAK: Jumlah peserta harus lebih dari 0 (ruang " + idRuang + ").";
        }
        if (jumlahPeserta > kapasitas) {
            return "DITOLAK: Jumlah peserta (" + jumlahPeserta + ") melebihi kapasitas ruang "
                    + idRuang + " (" + kapasitas + ").";
        }
        if (!tersedia) {
            return "DITOLAK: Ruang " + idRuang + " sudah dipesan.";
        }
        tersedia = false;
        return "BERHASIL: Ruang " + idRuang + " dipesan untuk " + jumlahPeserta + " peserta.";
    }

    public String batalkan() {
        if (tersedia) {
            return "DITOLAK: Ruang " + idRuang + " masih tersedia, tidak ada pemesanan untuk dibatalkan.";
        }
        tersedia = true;
        return "BERHASIL: Pemesanan ruang " + idRuang + " dibatalkan.";
    }

    public String tampilkanInfo() {
        return "Ruang " + idRuang + " (" + namaRuang + ") | Kapasitas: " + kapasitas
                + " | Status: " + (tersedia ? "Tersedia" : "Dipesan");
    }
}