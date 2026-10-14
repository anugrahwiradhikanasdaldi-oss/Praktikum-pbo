package UTS.PaketData;
public class MainPaket {
    public static void main(String[] args) {
        PelangganInternet p1 = new PelangganInternet("P001", "Andi", 5000);
        PelangganInternet p2 = new PelangganInternet("P002", "Budi", 800);
        PelangganInternet p3 = new PelangganInternet("P003", "Citra", 0);

        //data awal 3 pelanggan
        System.out.println("=== DATA AWAL ===");
        p1.tampilkanInfo();
        p2.tampilkanInfo();
        p3.tampilkanInfo();

        //penggunaan berhasil
        System.out.println("\n=== PENGGUNAAN BERHASIL ===");
        System.out.println("Sebelum:");
        p1.tampilkanInfo();
        p1.gunakanKuota(1500);
        System.out.println("Sesudah:");
        p1.tampilkanInfo();

        //
        System.out.println("\n=== PENGGUNAAN DITOLAK ===");
        System.out.println("Sebelum:");
        p2.tampilkanInfo();
        p2.gunakanKuota(1000);   // melebihi kuota
        p2.gunakanKuota(0);      // nol
        p2.gunakanKuota(-50);    // negatif
        System.out.println("Sesudah:");
        p2.tampilkanInfo();

        //beli tambahan kuota
        System.out.println("\n=== BELI KUOTA TAMBAHAN ===");
        System.out.println("Sebelum:");
        p3.tampilkanInfo();
        p3.beliKuota(2000);
        p3.beliKuota(-100);      // ditolak
        System.out.println("Sesudah:");
        p3.tampilkanInfo();

        //uji status HABIS, MENIPIS, CUKUP
        System.out.println("\n=== UJI STATUS ===");
        p2.gunakanKuota(800);    // jadi 0 -> HABIS
        p2.tampilkanInfo();
        p1.gunakanKuota(2500);   // jadi 1000 -> MENIPIS
        p1.tampilkanInfo();
        p1.beliKuota(1);         // jadi 1001 -> CUKUP
        p1.tampilkanInfo();
    }
}