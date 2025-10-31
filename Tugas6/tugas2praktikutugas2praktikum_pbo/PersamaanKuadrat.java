package tugas2pbo_praktikum;

public class PersamaanKuadrat {
    public static void hitungKuadrat(double a, double b, double c) {
        double hasil = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Hasil b² - 4ac = " + hasil);
    }
}
