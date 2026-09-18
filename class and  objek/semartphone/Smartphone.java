package semartphone;
public class Smartphone {

    // 4 atribut
    String merk;
    String warna;
    int ram;
    int kapasitasBaterai;

    // Method 1
    void displayInfo() {
        System.out.println("Merk            : " + merk);
        System.out.println("Warna           : " + warna);
        System.out.println("RAM             : " + ram + " GB");
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " mAh");
    }

    // Method 2
    void nyalakan() {
        System.out.println(merk + " sedang dinyalakan.");
    }

    // Method 3
    void telepon() {
        System.out.println(merk + " sedang melakukan panggilan.");
    }
}