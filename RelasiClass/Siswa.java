public class Siswa {
    private String nis;
    private String nama;
    private int nilai;

    public Siswa(String nisBaru, String namaBaru, int nilaiBaru) {
        nis = nisBaru;
        nama = namaBaru;
        nilai = nilaiBaru;
    }

    public String getNis() {
        return nis;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void tampilInfo() {
        System.out.println(nis + " | " + nama + " | Nilai: " + nilai);
    }
}
