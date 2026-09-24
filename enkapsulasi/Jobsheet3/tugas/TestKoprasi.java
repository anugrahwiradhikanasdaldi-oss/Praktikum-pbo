package enkapsulasi.Jobsheet3.tugas;
public class TestKoprasi {
    public static void main(String[] args) {

        Anggota anggota1 = new Anggota(
            "111222333444",
            "Denny",
            5000000
        );

        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjam(10000000);
        System.out.println(
            "Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman()
        );

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println(
            "Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman()
        );

        System.out.println("\nPembayaran angsuran 1.000.000");
        anggota1.angsur(1000000);
        System.out.println(
            "Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman()
        );

        System.out.println("\nPembayaran angsuran 3.000.000");
        anggota1.angsur(3000000);
        System.out.println(
            "Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman()
        );
    }
}