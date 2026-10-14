package UTS.PaketData;
public class PelangganInternet {
    private final String id;
    private final String nama;
    private int kuotaMB;

    public PelangganInternet(String id, String nama, int kuotaMB) {
        this.id = id;
        this.nama = nama;
        this.kuotaMB = kuotaMB;
    }
    // getter (tanpa setter, jadi tidak bisa diubah dari luar)
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getKuotaMB() {
        return kuotaMB;
    }

    public String getStatus() {
        if (kuotaMB == 0) {
            return "HABIS";
        } else if (kuotaMB <= 1000) {
            return "MENIPIS";
        } else {
            return "CUKUP";
        }
    }

    public void gunakanKuota(int mb) {
        if (mb <= 0) {
            System.out.println("DITOLAK: penggunaan harus lebih dari 0 MB.");
        } else if (mb > kuotaMB) {
            System.out.println("DITOLAK: kuota tidak cukup (butuh " + mb + " MB, sisa " + kuotaMB + " MB).");
        } else {
            kuotaMB -= mb;
            System.out.println("BERHASIL: menggunakan " + mb + " MB.");
        }
    }

    public void beliKuota(int mb) {
        if (mb <= 0) {
            System.out.println("DITOLAK: pembelian harus lebih dari 0 MB.");
        } else {
            kuotaMB += mb;
            System.out.println("BERHASIL: menambah " + mb + " MB.");
        }
    }

    public void tampilkanInfo() {
        System.out.println(id + " | " + nama + " | Kuota: " + kuotaMB + " MB | Status: " + getStatus());
    }
}