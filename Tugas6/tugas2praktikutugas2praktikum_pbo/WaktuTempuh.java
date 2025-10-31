package tugas2pbo_praktikum;

public class WaktuTempuh {
    public static void hitung() {
        double keBulan = 384_400; // km
        double keMatahari = 152.1e6; // km
        double kecepatanCahaya = 300_000; // km/s

        double waktuBulan = keBulan / kecepatanCahaya;
        double waktuMatahari = keMatahari / kecepatanCahaya;

        System.out.println("Waktu ke Bulan = " + waktuBulan + " detik");
        System.out.println("Waktu ke Matahari = " + waktuMatahari + " detik");
    }
}
