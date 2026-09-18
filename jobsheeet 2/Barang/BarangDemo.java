package Barang;
public class BarangDemo {
    public static void main(String[] args) {

        Barang b1 = new Barang();

        b1.kode = "B001";
        b1.nama = "Laptop";
        b1.hargaKotor = 10000000;
        b1.diskon = 0.1;

        b1.displayInfo();
    }
}