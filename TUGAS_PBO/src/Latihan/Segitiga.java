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

public class Segitiga extends BangunDatar{
    
    Scanner sc = new Scanner(System.in);
    double alas;
    double tinggi;
            
    public void Luas(){
        System.out.println("Input alas : ");
        alas = sc.nextDouble();
        System.out.println("Input tinggi : ");
        tinggi = sc.nextDouble();
        System.out.println("Luas segitiga");
        double hasil = (1/2) * alas * tinggi;
        System.out.println("Hasil luas : " + hasil);
    }
    public void Keliling(){
        System.out.println("Keliling Segitiga");
        double hasil = 3 * alas;
        System.out.println("Hasil keliling : " + hasil);
    }
}