/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menghitung luas dan keliling lingkaran.
 */

import java.util.Scanner;

public class PBO210116147Latihan22PerhitunganLingkaran {

    
    public static void main(String[] args) {
        final double PHI = 3.14;
        double k,L,r,rad;
        
        Scanner sc = new Scanner(System.in);
        rad = 0;
        
        System.out.println("+++++ PERHITUNGAN LINGKARAN +++++");
        System.out.print("Masukkan nilai diameter lingkaran: ");
        try {
            rad = sc.nextInt();
            r = rad / 2;
            k = 2 * PHI * r;
            L = PHI * r * r;
            System.out.println();
            System.out.println("+++++++ HASIL PERHITUNGAN +++++++");
            System.out.println("Jari-jari Lingkaran = " + String.format("%.2f",r) + " cm");
            System.out.println("Keliling Lingkaran  = " + String.format("%.2f",k) + " cm");
            System.out.println("Luas Lingkaran      = " + String.format("%.2f",L) + " cm");           
        } catch (Exception e) {
            System.out.println("Nilai diameter tidak sesuai!");
            sc.nextLine();
        }
        
        System.out.println();
        System.out.println("Developed by Garry Prang"); 
                       
    }
    
}
