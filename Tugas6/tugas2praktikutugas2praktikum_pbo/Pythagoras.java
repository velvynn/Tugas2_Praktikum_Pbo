package tugas2pbo_praktikum;

public class Pythagoras {
    public static void hitung(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double keliling = a + b + c;
        System.out.println("Sisi miring (c) = " + c);
        System.out.println("Keliling segitiga = " + keliling);
    }
}
