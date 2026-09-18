package sepeda;
public class DemoSepeda {
    public static void main(String[] args) {

        // Object 1
        Sepeda sepeda1 = new Sepeda();

        sepeda1.merk = "Polygon";
        sepeda1.warna = "Merah";
        sepeda1.jumlahGear = 7;
        sepeda1.ukuranRoda = 27;

        // Object 2
        Sepeda sepeda2 = new Sepeda();

        sepeda2.merk = "United";
        sepeda2.warna = "Hitam";
        sepeda2.jumlahGear = 8;
        sepeda2.ukuranRoda = 26;

        System.out.println("=== SEPEDA 1 ===");
        sepeda1.displayInfo();
        sepeda1.kayuh();
        sepeda1.rem();

        System.out.println();

        System.out.println("=== SEPEDA 2 ===");
        sepeda2.displayInfo();
        sepeda2.kayuh();
        sepeda2.rem();
    }
}