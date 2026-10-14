package Inharitade;
public class Mobil extends Kendaraan {
    private int kapasitasPenumpang;

    // Constructor tanpa parameter
    public Mobil() {
        super();
        this.kapasitasPenumpang = 0;
        System.out.println("Objek Mobil dibuat (tanpa parameter)");
    }

    // Constructor berparameter (overloading), memanggil super() berparameter
    public Mobil(String merk, String warna, int tahun, int kapasitasPenumpang) {
        super(merk, warna, tahun);
        this.kapasitasPenumpang = kapasitasPenumpang;
        System.out.println("Objek Mobil dibuat (berparameter)");
    }

    public void klakson() {
        System.out.println("Mobil: Tin tin!");
    }

    // Overriding
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan dengan tombol start");
    }

    // Overriding
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Kapasitas Penumpang : " + kapasitasPenumpang + " orang\n";
        return info;
    }
}