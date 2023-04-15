/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suci040423;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Tri Suci Ramadani Pulungan
 */
public class LatihanModul7_2NomorTerbesarBufferedReader {
    public static void main(String[] args) {
        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int terbesar = 0;
        for (int i = 1; i <= a.length; i++) {
            System.out.println("Masukkan angka " + i + ":");
            try {
                a[i-1] = Integer.parseInt(masukan.readLine());
                if (a[i-1] > terbesar) {
                    terbesar = a[i-1];
                }
            } catch (IOException e) {
            }
        }
        String hasil = "Terbesar adalah " + terbesar;
        System.out.println(hasil);
    }
}
