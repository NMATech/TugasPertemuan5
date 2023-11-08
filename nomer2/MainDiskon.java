/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan1;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainDiskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputBeli = new Scanner(System.in);
        Diskon done = new Diskon();
        
        System.out.print("Total Pembelian : Rp. = ");
        done.pembelian = inputBeli.nextInt();
        
        done.getHasil();
        done.getDetail();
    
//        System.out.print("Total Pembelian : Rp. = ");
//        int pembelian = inputBeli.nextInt();
//        double diskon, hasil;
//        
//        if (pembelian < 50000){
//            diskon = 0.05 * pembelian;
//            hasil = pembelian - diskon;
//        }else {
//            diskon = 0.2 * pembelian;
//            hasil = pembelian - diskon;
//        }
//        
//        System.out.println("Besarnya Potongan = " + diskon);
//        System.out.println("Jumlah yang harus dibayarkan = " + hasil);
    }   
}
