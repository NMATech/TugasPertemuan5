/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

/**
 *
 * @author LENOVO
 */
public class Diskon {
        int pembelian;
        double diskon, hasil;
        
        double getHasil(){
          if (pembelian < 50000){
            diskon = 0.05 * pembelian;
            hasil = pembelian - diskon;
          }else {
            diskon = 0.2 * pembelian;
            hasil = pembelian - diskon;
          }
          
          return hasil;
        }
        
        
        void getDetail(){
            System.out.println("Besarnya Potongan = " + diskon);
            System.out.println("Jumlah yang harus dibayarkan = " + getHasil());
        }
}
