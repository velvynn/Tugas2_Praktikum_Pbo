package waktukerja;

import java.util.Scanner;

public class MainWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hitung Selisih Waktu Kerja");

        System.out.print("Masukkan jam masuk   : ");
        int jamMasuk = sc.nextInt();
        System.out.print("Masukkan menit masuk : ");
        int menitMasuk = sc.nextInt();

        System.out.print("Masukkan jam pulang   : ");
        int jamPulang = sc.nextInt();
        System.out.print("Masukkan menit pulang : ");
        int menitPulang = sc.nextInt();

        HitungWaktu waktu = new HitungWaktu(jamMasuk, menitMasuk, jamPulang, menitPulang);
        waktu.hitungSelisih();
    }
}
