package kendaraan;
public class Motor {
        String merk;
    String jenis;
    int cc;

    public Motor(String merk, String jenis, int cc) {
        this.merk = merk;
        this.jenis = jenis;
        this.cc = cc;
    }

    public void cetakInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Jenis : " + jenis);
        System.out.println("CC    : " + cc);
    }
}
