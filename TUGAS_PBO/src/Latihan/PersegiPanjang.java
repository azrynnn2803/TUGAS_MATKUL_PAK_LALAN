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

public class PersegiPanjang extends BangunDatar{
    
    Scanner sc = new Scanner(System.in);
    int panjang;
    int lebar;
            
    public void Luas(){
        System.out.print("Input panjang : ");
        panjang = sc.nextInt();
        System.out.print("Input lebar : ");
        lebar = sc.nextInt();
                
        System.out.println("Luas Persegi Panjang");
        int hasil = panjang * lebar;
        System.out.println("Hasil luas : " + hasil);
    }
    public void Keliling(){
        System.out.println("Keliling persegi panjang");
        int hasil = 2 * (panjang + lebar);
        System.out.println("Hasil keliling : " + hasil);
    }
}