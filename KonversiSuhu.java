package konversisuhu;

public class KonversiSuhu {
    double celcius;

    public KonversiSuhu(double celcius) {
        this.celcius = celcius;
    }

    public double toFahrenheit() {
        return (celcius * 9/5) + 32;
    }

    public double toReamur() {
        return celcius * 4/5;
    }

    public double toKelvin() {
        return celcius + 273.15;
    }

    // Menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("\nHasil Konversi Suhu");
        System.out.println("Celcius    : " + celcius + " °C");
        System.out.println("Fahrenheit : " + toFahrenheit() + " °F");
        System.out.println("Reamur     : " + toReamur() + " °R");
        System.out.println("Kelvin     : " + toKelvin() + " K");
    }
}
