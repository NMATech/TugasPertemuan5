/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer3;

/**
 *
 * @author LENOVO
 */
public class IMT {
    double beratBadan, tinggiBadan; 
    private double IMT;
    private String kriteria;
    
    double hitungImt(){
        IMT = beratBadan / (tinggiBadan * tinggiBadan);
        
        return IMT;
    }
    
    String getKriteria(){
        if(IMT <= 18.4){
            kriteria = "Berat Badan Kurang";
        }else if(IMT >= 18.5 && IMT <= 24.9){
            kriteria = "Berat Badan Ideal";
        }else if(IMT >= 25 && IMT <= 29.9){
            kriteria = "Berat Badan Lebih";
        }else if(IMT >= 30 && IMT <= 39.9){
            kriteria = "Gemuk";
        }else if(IMT >= 40){
            kriteria = "Sangat Gemuk";
        }
        
        return kriteria;
    }
    
    void getOutput(){
        System.out.println("Nilai IMT  : " + hitungImt());
        System.out.println("Kriteria : " + getKriteria());
    }
}
