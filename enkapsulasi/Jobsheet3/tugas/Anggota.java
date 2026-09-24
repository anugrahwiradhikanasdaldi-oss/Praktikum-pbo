package enkapsulasi.Jobsheet3.tugas;
public class Anggota {
    private String nomorKtp;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKtp, String nama, double limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double uang) {
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }

    public void angsur(double uang) {
        double minimalAngsur = jumlahPinjaman * 0.10;

        if (uang < minimalAngsur) {
            System.out.println(
                "Maaf, jumlah angsuran harus minimal 10% dari jumlah pinjaman."
            );
        } else if (uang > jumlahPinjaman) {
            jumlahPinjaman = 0;
        } else {
            jumlahPinjaman -= uang;
        }
    }
}