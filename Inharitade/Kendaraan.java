package Inharitade;
public class Kendaraan {
    public String merk;
    public String warna;
    public int tahun;
    private String jenis; 
    // Constructor tanpa parameter
    public Kendaraan() {
        this.merk = "Tidak diketahui";
        this.warna = "Tidak diketahui";
        this.tahun = 0;
        System.out.println("Objek Kendaraan dibuat (tanpa parameter)");
    }

    // Constructor berparameter (overloading)
    public Kendaraan(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        System.out.println("Objek Kendaraan dibuat (berparameter)");
    }

    public void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan");
    }

    public String getInfo() {
        String info = "";
        info += "Merk   : " + merk + "\n";
        info += "Warna  : " + warna + "\n";
        info += "Tahun  : " + tahun + "\n";
        return info;
    }
}

