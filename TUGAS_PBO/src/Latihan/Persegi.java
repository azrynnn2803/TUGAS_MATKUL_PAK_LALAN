/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class Persegi extends BangunDatar{
    
    Scanner sc = new Scanner(System.in);
    int sisi;
    
    public void Luas(){
        System.out.println("Masukkan sisi : ");
        sisi = sc.nextInt();
        System.out.println("Luas persegi");
        int hasil = sisi * sisi;
        System.out.println("Hasil luas : " + hasil);
    }
    public void Keliling(){
        System.out.println("Keliling persegi");
        int hasil = sisi * 4;
        System.out.println("Hasil keliling : " + hasil);
    }
    
}