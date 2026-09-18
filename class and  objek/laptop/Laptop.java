package laptop;
public class Laptop {

    // 4 atribut
    String merk;
    String warna;
    int ram;
    int penyimpanan;

    // Method 1
    void displayInfo() {
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("RAM         : " + ram + " GB");
        System.out.println("Penyimpanan : " + penyimpanan + " GB");
    }

    // Method 2
    void nyalakan() {
        System.out.println(merk + " sedang dinyalakan.");
    }

    // Method 3
    void matikan() {
        System.out.println(merk + " sedang dimatikan.");
    }
}