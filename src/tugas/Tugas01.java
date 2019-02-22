/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import static fungsi_perhitungan.Fungsi_Hitung.getFaktorial;
import static fungsi_perhitungan.Fungsi_Hitung.getFibonacci;
import static fungsi_perhitungan.Fungsi_Hitung.getKombinasi;
import static fungsi_perhitungan.Fungsi_Hitung.getPecahan;
import static fungsi_perhitungan.Fungsi_Hitung.getPermutasi;
import static fungsi_perhitungan.Fungsi_Hitung.getPrima;
import static fungsi_perhitungan.Fungsi_Hitung.getRandomValue;
import static fungsi_perhitungan.Fungsi_Hitung.getRandomValueUniq;
import java.util.Scanner;

/**
 *
 * @author Lusiana
 */
public class Tugas01 {

    /**
     * @param args the command line arguments
     */
    private static Scanner input;
    
    public static void main(String[] args) {
       //  TODO code application logic here


        
//faktorial
//        input = new Scanner(System.in);
//        System.out.print("masukkan angka: ");
//        int angka = input.nextInt();
//        if(angka<0)
//        {
//            System.out.println("Tidak terdefinisi");
//        }
//        else
//        {
//            System.out.println(getFaktorial(angka));
//        }
//permutasi
//        input = new Scanner(System.in);
//        System.out.print("masukkan angka pertama: ");
//        int angka = input.nextInt();
//        System.out.print("masukkan angka kedua: ");
//        int angka1 = input.nextInt();
//        System.out.println(getPermutasi(angka,angka1));
//        }
//  Kombinasi      
//        input = new Scanner(System.in);
//        System.out.print("masukkan angka pertama: ");
//        int angka = input.nextInt();
//        System.out.print("masukkan angka kedua: ");
//        int angka1 = input.nextInt();
//        if(angka<0 || angka1<0)
//        {
//            System.out.println("Tidak terdefinisi");
//        }
//        else
//        {
//            System.out.println(getKombinasi(angka,angka1));
//        }
//Fibonacci
//        input = new Scanner(System.in);
//        System.out.print("masukkan nilai maks: ");
//        int angka = input.nextInt();
//        System.out.print(getFibonacci(angka));
        
//Prima
//        input = new Scanner(System.in);
//        System.out.print("masukkan jumlah deret: ");
//        int angka = input.nextInt();
//        for (int i =0; i<angka; i++){
//             System.out.print(getPrima(angka)[i] + "  ");
//        }
//Random
//        input = new Scanner(System.in);
//        System.out.print("masukkan jumlah deret: ");
//        int angka = input.nextInt();
//        for (int i =0; i<angka; i++){
//             System.out.print(getRandomValue(angka)[i] + "  ");
//        }
//Random Unik
//        input = new Scanner(System.in);
//        System.out.print("masukkan jumlah deret: ");
//        int angka = input.nextInt();
//        System.out.print(getRandomValueUniq(angka) + "  ");
        
//Pecahan Uang
//        input = new Scanner(System.in);
//        System.out.print("masukkan angka ke 1: ");
//        int angka = input.nextInt();
//        int a[][] = getPecahan(angka);
//        for (int j =0; j8<a.length; j++){
//            for (int i =0; i<2; i++){
//                if(a[j][1]!=0){System.out.print(a[j][i] + "  ");}
//            }
//            System.out.println();
//        }

            input = new Scanner(System.in);
            System.out.print("masukkan nilai maks: ");
            int angka = input.nextInt();
            System.out.print(getPrima(angka) + "  ");

              
  }
}

    

    
    
