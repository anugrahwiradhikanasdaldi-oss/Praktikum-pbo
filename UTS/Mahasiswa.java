package UTS;
public class Mahasiswa {
    private final int nomor;
    private final String nama;
    private String status;

    public Mahasiswa(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
        this.status = "MENUNGGU";
    }

    // getter
    public int getNomor() {
        return nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    // setter (tanpa public, hanya bisa dipakai AntrianLayanan)
    void setStatus(String status) {
        this.status = status;
    }
}