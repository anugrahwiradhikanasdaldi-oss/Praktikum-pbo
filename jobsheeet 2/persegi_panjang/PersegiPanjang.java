package persegi_panjang;
public class PersegiPanjang {

    // Atribut
    int panjang;
    int lebar;

    // Method untuk menampilkan data panjang dan lebar
    public void displayInfo() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
    }

    // Method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}