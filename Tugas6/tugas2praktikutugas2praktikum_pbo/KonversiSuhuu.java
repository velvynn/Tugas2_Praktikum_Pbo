package tugas2pbo_praktikum;

public class KonversiSuhuu {
    public static void konversi(double celcius, double reamur, double fahrenheit) {
        System.out.println("\n=== Konversi Suhu ===");

        // Dari Celcius
        double cToR = celcius * 4 / 5;
        double cToF = (celcius * 9 / 5) + 32;
        double cToK = celcius + 273.15;

        System.out.println("Dari Celcius (" + celcius + "°C):");
        System.out.println("Reamur = " + cToR + "°R");
        System.out.println("Fahrenheit = " + cToF + "°F");
        System.out.println("Kelvin = " + cToK + " K\n");

        // Dari Reamur
        double rToC = reamur * 5 / 4;
        double rToF = (reamur * 9 / 4) + 32;
        double rToK = (reamur * 5 / 4) + 273.15;

        System.out.println("Dari Reamur (" + reamur + "°R):");
        System.out.println("Celcius = " + rToC + "°C");
        System.out.println("Fahrenheit = " + rToF + "°F");
        System.out.println("Kelvin = " + rToK + " K\n");

        // Dari Fahrenheit
        double fToC = (fahrenheit - 32) * 5 / 9;
        double fToR = (fahrenheit - 32) * 4 / 9;
        double fToK = ((fahrenheit - 32) * 5 / 9) + 273.15;

        System.out.println("Dari Fahrenheit (" + fahrenheit + "°F):");
        System.out.println("Celcius = " + fToC + "°C");
        System.out.println("Reamur = " + fToR + "°R");
        System.out.println("Kelvin = " + fToK + " K");
    }
}
