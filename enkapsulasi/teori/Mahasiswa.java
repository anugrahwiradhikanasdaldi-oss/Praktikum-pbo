package enkapsulasi.teori;

public class Mahasiswa {
    // Semua atribut private
    private final String nim;  
    private String nama;
    private String alamat;
    private double ipk;
 
    // Constructor berparameter
    public Mahasiswa(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        setIpk(ipk); // lewat proses setter agar validasi ikut berlaku
    }
 
    //Getter 
    public String getNim() {
        return nim;
    }
 
    public String getNama() {
        return nama;
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public double getIpk() {
        return ipk;
    }
 
    //Setter (NIM tidak punya setter)
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    public void setIpk(double ipk) {
        // Validasi IPK: 0.00 - 4.00
        if (ipk >= 0.00 && ipk <= 4.00) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid (" + ipk + "). Harus antara 0.00 - 4.00");
        }
    }
}

