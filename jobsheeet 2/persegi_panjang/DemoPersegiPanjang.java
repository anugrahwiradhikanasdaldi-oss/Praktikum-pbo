package persegi_panjang;
public class DemoPersegiPanjang {

    public static void main(String[] args) {

        // Membuat object
        PersegiPanjang persegi1 = new PersegiPanjang();

        // Mengisi nilai atribut
        persegi1.panjang = 10;
        persegi1.lebar = 5;

        // Menampilkan data
        System.out.println("=== DATA PERSEGI PANJANG ===");
        persegi1.displayInfo();

        // Menampilkan luas
        System.out.println("Luas     : " + persegi1.getLuas());

        // Menampilkan keliling
        System.out.println("Keliling : " + persegi1.getKeliling());
    }
}