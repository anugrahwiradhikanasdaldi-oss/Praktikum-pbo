package semartphone;
public class DemoSmartphone {
    public static void main(String[] args) {

        // Object 1
        Smartphone smartphone1 = new Smartphone();

        smartphone1.merk = "iPhone";
        smartphone1.warna = "Hitam";
        smartphone1.ram = 8;
        smartphone1.kapasitasBaterai = 4000;

        // Object 2
        Smartphone smartphone2 = new Smartphone();

        smartphone2.merk = "Samsung";
        smartphone2.warna = "Biru";
        smartphone2.ram = 12;
        smartphone2.kapasitasBaterai = 5000;

        System.out.println("=== SMARTPHONE 1 ===");
        smartphone1.displayInfo();
        smartphone1.nyalakan();
        smartphone1.telepon();

        System.out.println();

        System.out.println("=== SMARTPHONE 2 ===");
        smartphone2.displayInfo();
        smartphone2.nyalakan();
        smartphone2.telepon();
    }
}