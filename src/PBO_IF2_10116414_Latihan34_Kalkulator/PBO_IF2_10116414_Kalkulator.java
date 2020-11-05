/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan34_Kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program kalkulator
 */
public class PBO_IF2_10116414_Kalkulator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Hitung kalkulator = new Hitung();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalkulator.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kalkulator.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kalkulator.sisaBilangan());

    }
}
