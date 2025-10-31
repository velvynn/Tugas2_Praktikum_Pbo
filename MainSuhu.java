package konversisuhu;

import java.util.Scanner;

public class MainSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Konversi Suhu");
        System.out.print("suhu dalam Celcius: ");
        double celcius = sc.nextDouble();
        
        KonversiSuhu suhu = new KonversiSuhu(celcius);
        suhu.tampilkanHasil();
    }
}
