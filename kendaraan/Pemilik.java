package kendaraan;
public class Pemilik {
    String nama;
    String alamat;
    String noKtp;

    public Pemilik(String nama, String alamat, String noKtp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noKtp = noKtp;
    }

    public void cetakInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No KTP : " + noKtp);
    }
}
