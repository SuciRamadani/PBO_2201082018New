/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suci040423;

/**
 *
 * @author Tri Suci Ramadani Pulungan
 */
public class Aritmatika {
    public int tambah(int a, int b){
        return a+b;
    }
    public boolean cekBilanganGanjil(int a){
        return (a % 2==1);
    }
    public static void main (String[] args){
        Aritmatika aritmatika = new Aritmatika();
        int c= aritmatika.tambah(5,6);
        System.out.println("Nilai c = " + c);
         System.out.println("Ganjil ?" + aritmatika.cekBilanganGanjil(c));
         
    }
}
