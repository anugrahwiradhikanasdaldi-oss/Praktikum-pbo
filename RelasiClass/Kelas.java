import java.util.ArrayList;

public class Kelas {
    private String namaKelas;
    private Guru waliKelas;
    private ArrayList<Siswa> daftarSiswa;

    public Kelas(String namaBaru, Guru waliBaru) {
        namaKelas = namaBaru;
        waliKelas = waliBaru;
        daftarSiswa = new ArrayList<Siswa>();
    }

    public void tambahSiswa(Siswa s) {
        daftarSiswa.add(s);
    }

    public void hapusSiswa(String nis) {
        for (int i = 0; i < daftarSiswa.size(); i++) {
            if (daftarSiswa.get(i).getNis().equals(nis)) {
                daftarSiswa.remove(i);
                System.out.println("Siswa dengan NIS " + nis + " dihapus.");
                return;
            }
        }
        System.out.println("Siswa dengan NIS " + nis + " tidak ditemukan.");
    }

    public int jumlahSiswa() {
        return daftarSiswa.size();
    }

    public void tampilSiswa() {
        System.out.println("=== Kelas " + namaKelas + " ===");
        System.out.println("Wali kelas: " + waliKelas.getNama());
        System.out.println("Jumlah siswa: " + jumlahSiswa());
        for (Siswa s : daftarSiswa) {
            s.tampilInfo();
        }
    }
}
