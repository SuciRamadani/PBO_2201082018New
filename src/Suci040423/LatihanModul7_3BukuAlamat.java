/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suci040423;

/**
 *
 * @author Lenovo
 */
public class LatihanModul7_3BukuAlamat {
    public static void main(String[] args){
        String[][] entry = {{"Florence", "735-1234", "Manila"},
                {"Joyce", "983-3333", "Quezon City"},
                {"Becca", "456-3322", "Manila"}};
        
        for (String[] data : entry) {
            System.out.println("Name : " + data[0]);
            System.out.println("Tel. # : " + data[1]);
            System.out.println("Address : " + data[2]);
            System.out.println();
        }
    }
}
