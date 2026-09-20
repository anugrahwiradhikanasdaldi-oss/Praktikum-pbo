package enkapsulasi.teori;

public class Main_Mahasiswa {
    public static void main(String[] args) {

        // 1. Buat minimal 2 objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("2501001", "Budi Santoso", "Surabaya", 3.50);
        Mahasiswa mhs2 = new Mahasiswa("2501002", "Siti Aminah", "Sidoarjo", 3.80);

        // 2. Tampilkan data menggunakan getter
        System.out.println("=== DATA AWAL ===");
        tampilkan(mhs1);
        tampilkan(mhs2);

        // 3. Ubah nama, alamat, dan IPK menggunakan setter
        mhs1.setNama("Budi Santoso, S.Kom");
        mhs1.setAlamat("Malang");
        mhs1.setIpk(3.75);

        System.out.println("\n=== SETELAH DIUBAH (mhs1) ===");
        tampilkan(mhs1);

        // 4. Validasi IPK (nilai di luar 0.00 - 4.00 ditolak)
        System.out.println("\n=== UJI VALIDASI IPK ===");
        mhs2.setIpk(5.00);   // ditolak
        mhs2.setIpk(-1.00);  // ditolak
        System.out.println("IPK mhs2 tetap: " + mhs2.getIpk());
    }

    static void tampilkan(Mahasiswa m) {
        System.out.println("NIM    : " + m.getNim());
        System.out.println("Nama   : " + m.getNama());
        System.out.println("Alamat : " + m.getAlamat());
        System.out.println("IPK    : " + m.getIpk());
        System.out.println("---------------------");
    }
}
