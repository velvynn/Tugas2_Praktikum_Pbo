package waktukerja;

public class HitungWaktu {
    int jamMasuk, menitMasuk, jamPulang, menitPulang;

    public HitungWaktu(int jamMasuk, int menitMasuk, int jamPulang, int menitPulang) {
        this.jamMasuk = jamMasuk;
        this.menitMasuk = menitMasuk;
        this.jamPulang = jamPulang;
        this.menitPulang = menitPulang;
    }

    public void hitungSelisih() {
        int totalMasuk = (jamMasuk * 60) + menitMasuk;
        int totalPulang = (jamPulang * 60) + menitPulang;
        int selisihMenit = totalPulang - totalMasuk;

        int jam = selisihMenit / 60;
        int menit = selisihMenit % 60;

        System.out.println("\nHasil Perhitungan Waktu Kerja");
        System.out.println("Durasi kerja: " + jam + " jam " + menit + " menit");
    }
}
