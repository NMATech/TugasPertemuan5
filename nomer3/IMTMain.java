/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomer3;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class IMTMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IMT person = new IMT();
        
        System.out.print("Masukkan Berat Badan (kg) : ");
        person.beratBadan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (m) : ");
        person.tinggiBadan = input.nextDouble();
        
        person.getOutput();
    }
    
}
