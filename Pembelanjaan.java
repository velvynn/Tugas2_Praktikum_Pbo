package pembelanjaan; // <- buat dalam package sesuai arahan ya

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out);

        output.writeBytes("Nama Pembeli        : ");
        String nama = input.readLine();

        output.writeBytes("Total Belanja (Rp)  : ");
        double totalBelanja = Double.parseDouble(input.readLine());

        output.writeBytes("Diskon (%)          : ");
        double diskon = Double.parseDouble(input.readLine());

        double potongan = totalBelanja * (diskon / 100);
        double totalBayar = totalBelanja - potongan;

        output.writeBytes("MUang Bayar (Rp)     : ");
        double uangBayar = Double.parseDouble(input.readLine());

        double kembalian = uangBayar - totalBayar;

        output.writeBytes("\nRINCIAN PEMBAYARAN \n");
        output.writeBytes("Nama Pembeli   : " + nama + "\n");
        output.writeBytes("Total Belanja  : Rp " + totalBelanja + "\n");
        output.writeBytes("Diskon         : " + diskon + "%\n");
        output.writeBytes("Total Bayar    : Rp " + totalBayar + "\n");
        output.writeBytes("Uang Bayar     : Rp " + uangBayar + "\n");
        output.writeBytes("Kembalian      : Rp " + kembalian + "\n");
    }
}
