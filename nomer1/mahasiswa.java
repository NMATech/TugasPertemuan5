/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer1;

/**
 *
 * @author LENOVO
 */
public class mahasiswa {
    String npm, nama, keterangan;
    int nilaiKehadiran, nilaiTugas, nilaiUts, nilaiUas;
    private String grade; 
    private double nilaiAkhir;
    
    double hitungNilaiAkhir(){
        nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiTugas) + (0.4 * nilaiUas);
        
        return nilaiAkhir;
    }
    
    String getGrade(){
        if(nilaiAkhir >= 76 && nilaiAkhir <= 100){
            grade = "A";
            keterangan = "ISTIMEWA";
        }else if(nilaiAkhir >= 66 && nilaiAkhir <= 75){
            grade = "B";
            keterangan = "BAIK";
        }else if(nilaiAkhir >= 56 && nilaiAkhir <= 65){
            grade = "C";
            keterangan = "CUKUP";
        }else if(nilaiAkhir >= 46 && nilaiAkhir <= 55){
            grade = "D";
            keterangan = "KURANG";
        }else if(nilaiAkhir >= 0 && nilaiAkhir <= 45){
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
      
        return grade;
    }
    
    void getOutput(){
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade : " + getGrade());
        System.out.println("Keterangan : " + keterangan);
    }
}
