package tugas2pbo_praktikum;

public class Tugas2praktikum_PBO {
    public static void main(String[] args) {
        System.out.println("=== 1. Operator Increment ===");
        IncrementExample.incrementDemo();

        System.out.println("\n=== 2. Luas Persegi Panjang ===");
        PersegiPanjang.hitungLuas(50, 45);

        System.out.println("\n=== 3. Persamaan Kuadrat ===");
        PersamaanKuadrat.hitungKuadrat(2, 10, 5);

        System.out.println("\n=== 4. Operasi Matematika ===");
        OperasiMatematika.operasi(22, 33);

        System.out.println("\n=== 5. Luas Segitiga ===");
        Segitiga.hitungLuas(6, 8);

        System.out.println("\n=== 6. Pythagoras dan Keliling ===");
        Pythagoras.hitung(6, 8);

        System.out.println("\n=== 7. Ubah String ===");
        UbahString.konversi();

        System.out.println("\n=== 8. Waktu Tempuh Cahaya ===");
        WaktuTempuh.hitung();

        System.out.println("\n=== 9. Konversi Suhu ===");
        KonversiSuhuu.konversi(10, 15, 5); // Celcius, Reamur, Fahrenheit
    }
}
