public class Main {
    public static void main(String[] args) {
        Guru guru = new Guru("198001", "Bu Sari", "Matematika");
        Kelas kelas = new Kelas("XII-A", guru);

        kelas.tambahSiswa(new Siswa("S001", "Andi", 85));
        kelas.tambahSiswa(new Siswa("S002", "Budi", 90));
        kelas.tambahSiswa(new Siswa("S003", "Citra", 78));

        kelas.tampilSiswa();

        System.out.println();
        kelas.hapusSiswa("S002");

        System.out.println();
        kelas.tampilSiswa();
    }
}
