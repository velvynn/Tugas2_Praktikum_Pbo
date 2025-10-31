package tugas3_pbo;

import java.util.Scanner;

public class GajiPegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Hitung Gaji Bersih Pegawai");
        System.out.print("Nomor Induk Karyawan : ");
        String nik = input.nextLine();

        System.out.print("Nama Karyawan        : ");
        String nama = input.nextLine();

        System.out.print("Alamat               : ");
        String alamat = input.nextLine();

        System.out.print("Jabatan              : ");
        String jabatan = input.nextLine();

        System.out.print("Gaji Pokok(p1)      : ");
        double p1 = input.nextDouble();

        System.out.print("Tunjangan Jabatan(p2): ");
        double p2 = input.nextDouble();

        System.out.print("Tunjangan Istri(p3) : ");
        double p3 = input.nextDouble();

        System.out.print("Tunjangan Anak(p4)  : ");
        double p4 = input.nextDouble();
        
        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\nHasil Perhitungan");
        System.out.println("Total Gaji          : Rp " + totalGaji);
        System.out.println("Pajak Penghasilan   : Rp " + pajak);
        System.out.println("Gaji Bersih         : Rp " + gajiBersih);
    }
}
