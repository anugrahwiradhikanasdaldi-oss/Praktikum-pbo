public class Guru {
    private String nip;
    private String nama;
    private String mapel;

    public Guru(String nipBaru, String namaBaru, String mapelBaru) {
        nip = nipBaru;
        nama = namaBaru;
        mapel = mapelBaru;
    }

    public String getNama() {
        return nama;
    }

    public String getMapel() {
        return mapel;
    }

    public void tampilInfo() {
        System.out.println("NIP   : " + nip);
        System.out.println("Nama  : " + nama);
        System.out.println("Mapel : " + mapel);
    }
}