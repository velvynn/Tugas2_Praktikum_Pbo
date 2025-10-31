package perbedaaninput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PerbedaanInput {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama1 = sc.nextLine();
        System.out.print("Masukkan umur: ");
        int umur1 = sc.nextInt();

        System.out.println("\nOutput (Scanner):");
        System.out.println("Nama: " + nama1);
        System.out.println("Umur: " + umur1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n=== Input dengan BufferedReader ===");
        System.out.print("Masukkan nama: ");
        String nama2 = br.readLine();
        System.out.print("Masukkan umur: ");
        int umur2 = Integer.parseInt(br.readLine());

        System.out.println("\nOutput (BufferedReader):");
        System.out.println("Nama: " + nama2);
        System.out.println("Umur: " + umur2);
    }
}
