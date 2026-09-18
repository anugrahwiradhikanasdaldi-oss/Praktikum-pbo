package laptop;
public class DemoLaptop {
    public static void main(String[] args) {

        // Object 1
        Laptop laptop1 = new Laptop();

        laptop1.merk = "ASUS";
        laptop1.warna = "Hitam";
        laptop1.ram = 8;
        laptop1.penyimpanan = 512;

        // Object 2
        Laptop laptop2 = new Laptop();

        laptop2.merk = "Lenovo";
        laptop2.warna = "Silver";
        laptop2.ram = 16;
        laptop2.penyimpanan = 1000;

        System.out.println("=== LAPTOP 1 ===");
        laptop1.displayInfo();
        laptop1.nyalakan();
        laptop1.matikan();

        System.out.println();

        System.out.println("=== LAPTOP 2 ===");
        laptop2.displayInfo();
        laptop2.nyalakan();
        laptop2.matikan();
    }
}