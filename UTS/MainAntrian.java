package UTS;
public class MainAntrian {
    public static void main(String[] args) {
        AntrianLayanan antrian = new AntrianLayanan();

        //ambil nomor antrian
        System.out.println("=== AMBIL NOMOR ANTRIAN ===");
        antrian.ambilNomor("Andi");
        antrian.ambilNomor("Budi");
        antrian.ambilNomor("Citra");
        antrian.ambilNomor("Dewi");
        antrian.ambilNomor("");  
        antrian.tampilkanSisa();

        //panggil 2 mahasiswa
        System.out.println("\n=== PANGGIL 2 MAHASISWA ===");
        antrian.panggil();   
        antrian.panggil();   
        //sisa antrian
        System.out.println("\n=== SISA ANTRIAN ===");
        antrian.tampilkanSisa();

        // [SCREENSHOT 4] antrian kosong
        System.out.println("\n=== PANGGIL SAMPAI KOSONG ===");
        antrian.panggil();   // No. 3
        antrian.panggil();   // No. 4
        antrian.panggil();   // kosong -> pesan
        antrian.tampilkanSisa();
    }
}