package kendaraan;
public class Main {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2022);
        Motor motor1 = new Motor("Honda", "Matic", 150);
        Pemilik pemilik1 = new Pemilik(
            "Budi",
            "Malang",
            "123456789"
        );

        System.out.println("=== DATA MOBIL ===");
        mobil1.cetakInfo();

        System.out.println("\n=== DATA MOTOR ===");
        motor1.cetakInfo();

        System.out.println("\n=== DATA PEMILIK ===");
        pemilik1.cetakInfo();
    }
}