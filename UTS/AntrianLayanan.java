package UTS;
public class AntrianLayanan {
    private Mahasiswa[] daftar = new Mahasiswa[10];
    private int jumlah = 0;   // total mahasiswa yang sudah ambil nomor
    private int giliran = 0;  // posisi mahasiswa yang akan dipanggil berikutnya

    public void ambilNomor(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("DITOLAK: nama tidak boleh kosong.");
        } else if (jumlah == daftar.length) {
            System.out.println("DITOLAK: antrian penuh.");
        } else {
            Mahasiswa m = new Mahasiswa(jumlah + 1, nama);
            daftar[jumlah] = m;
            jumlah++;
            System.out.println("Ambil antrian -> No. " + m.getNomor() + " - " + m.getNama());
        }
    }

    public void panggil() {
        if (giliran >= jumlah) {
            System.out.println("Tidak ada antrian untuk dipanggil.");
        } else {
            Mahasiswa m = daftar[giliran];
            m.setStatus("DIPANGGIL");
            giliran++;
            System.out.println("Dipanggil -> No. " + m.getNomor() + " - " + m.getNama());
        }
    }

    public void tampilkanSisa() {
        int sisa = jumlah - giliran;
        System.out.println("Jumlah menunggu: " + sisa);
        for (int i = giliran; i < jumlah; i++) {
            Mahasiswa m = daftar[i];
            System.out.println("  - No. " + m.getNomor() + " - " + m.getNama() + " (" + m.getStatus() + ")");
        }
    }
}