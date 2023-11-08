/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomer1;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class mahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mahasiswa mhs = new mahasiswa();
        
        System.out.print("Masukkan Nama : ");
        mhs.nama = input.nextLine();
        System.out.print("Masukkan NPM : ");
        mhs.npm = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran : ");
        mhs.nilaiKehadiran = input.nextInt();
        System.out.print("Masukkan Nilai Tugas : ");
        mhs.nilaiTugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        mhs.nilaiUts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        mhs.nilaiUas = input.nextInt();
        
        mhs.getOutput();
    }
    
}
