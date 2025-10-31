package gayasentripetal;

import java.util.Scanner;

public class gayasentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Gaya Sentripetal");

        System.out.print("massa benda (kg): ");
        double m = input.nextDouble();

        System.out.print("kecepatan benda (m/s): ");
        double v = input.nextDouble();

        System.out.print("jari-jari lintasan (m): ");
        double r = input.nextDouble();

        // Rumus gaya sentripetal
        double Fc = (m * v * v) / r;

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Massa (m)        : " + m + " kg");
        System.out.println("Kecepatan (v)    : " + v + " m/s");
        System.out.println("Jari-jari (r)    : " + r + " m");
        System.out.println("Gaya Sentripetal : " + Fc + " Newton (N)");
    }
}
