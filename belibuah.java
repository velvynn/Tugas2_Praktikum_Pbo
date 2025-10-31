package belibuah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class belibuah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("hitung Total Buah Ibu Sisca");
        
        System.out.print("jumlah buah mangga yang dibeli (pcs): ");
        int mangga = Integer.parseInt(br.readLine());

        System.out.print("jumlah tetangga: ");
        int tetangga = Integer.parseInt(br.readLine());

        System.out.print("jumlah jambu per tetangga (pcs): ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("umlah mangga yang busuk (pcs): ");
        int manggaBusuk = Integer.parseInt(br.readLine());

        int totalJambu = tetangga * jambuPerTetangga;
        int totalMangga = mangga - manggaBusuk;
        int totalBuah = totalMangga + totalJambu;

        System.out.println("\n Hasil Perhitungan ===");
        System.out.println("Total jambu         : " + totalJambu + " pcs");
        System.out.println("Total mangga bagus  : " + totalMangga + " pcs");
        System.out.println("Total seluruh buah  : " + totalBuah + " pcs");
    }
}
