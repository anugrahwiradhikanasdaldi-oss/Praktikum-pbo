package Inharitade;
public class Motor extends Kendaraan {
    private int kapasitasMesin;

    // Constructor tanpa parameter
    public Motor() {
        super();
        this.kapasitasMesin = 0;
        System.out.println("Objek Motor dibuat (tanpa parameter)");
    }

    // Constructor berparameter (overloading), memanggil super() berparameter
    public Motor(String merk, String warna, int tahun, int kapasitasMesin) {
        super(merk, warna, tahun);
        this.kapasitasMesin = kapasitasMesin;
        System.out.println("Objek Motor dibuat (berparameter)");
    }

    public void remMotor() {
        System.out.println("Motor: Rem ditarik, motor berhenti");
    }

    // Overriding
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin motor dinyalakan dengan electric starter");
    }

    // Overriding
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Kapasitas Mesin     : " + kapasitasMesin + " cc\n";
        return info;
    }
}
