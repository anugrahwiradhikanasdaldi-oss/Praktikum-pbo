package sepeda;
public class Sepeda {

    // 4 atribut
    String merk;
    String warna;
    int jumlahGear;
    int ukuranRoda;

    // Method 1
    void displayInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Warna        : " + warna);
        System.out.println("Jumlah Gear  : " + jumlahGear);
        System.out.println("Ukuran Roda  : " + ukuranRoda + " inch");
    }

    // Method 2
    void kayuh() {
        System.out.println("Sepeda " + merk + " sedang dikayuh.");
    }

    // Method 3
    void rem() {
        System.out.println("Sepeda " + merk + " sedang direm.");
    }
}