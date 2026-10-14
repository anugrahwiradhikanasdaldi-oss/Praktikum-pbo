package Inharitade;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Membuat Objek ===");
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2022, 7);
        Motor motor1 = new Motor("Honda", "Merah", 2021, 150);
        Mobil mobil2 = new Mobil();

        System.out.println("\n=== Info Mobil 1 ===");
        System.out.println(mobil1.getInfo());
        mobil1.nyalakanMesin();
        mobil1.klakson();

        System.out.println("\n=== Info Motor 1 ===");
        System.out.println(motor1.getInfo());
        motor1.nyalakanMesin();
        motor1.remMotor();

        System.out.println("\n=== Info Mobil 2 (constructor tanpa parameter) ===");
        System.out.println(mobil2.getInfo());
    }
}