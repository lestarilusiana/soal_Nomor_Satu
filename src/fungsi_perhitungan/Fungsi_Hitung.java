/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi_perhitungan;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lusiana
 */
public class Fungsi_Hitung {
    /**
     * Fungsi untuk mencari faktorial
     * @param a berupa angka yang akan dicari nilai faktorialnya
     * @return int
     */
    public static int getFaktorial(int a)
    {
        int hasil = 1; //nyimpan hasil
        if(a==0)
        {
            return 1;
        }
        else if (a<=0)
        {
            System.out.print("Tidak Terdefinisi");
            return 0;
        }
        else
        {
            for (int i =0; i<a; i++)
            {
                hasil *= (a-i);
            }
            return hasil;
        }
    }
    
    /**
     * Fungsi Untuk mencari nilai permutasi
     * @param a angka pertama
     * @param b angka kedua
     * @return int
     */
    public static int getPermutasi(int a, int b)
    {
                    
        return getFaktorial (a)/ (getFaktorial((a-b)));
        
    }
    
    /**
     * Fungsi untuk mencari nilai kombinasi
     * @param a angka pertama
     * @param b angka kedua
     * @return int
     */
    public static int getKombinasi(int a, int b)
    {
        return getPermutasi(a, b) / getFaktorial(b);
    }
    
    /**
     * Fungsi untuk mencari nilai hasil pemangkatan
     * @param a nilai yang akan dipangkatkan
     * @param b nilai pangkat
     * @return  double
     */
    public static double getPerpangkatan(int a, int b)
    {
        double hasil = a;
        for (int i = 1; i<b; i++)
        {
            hasil *= b;
        }
        if (b<0)
        {
            hasil = 1/hasil;
        }
        return hasil;
    }
    
    /**
     * Fungsi untuk mencari nilai hasil perkalian
     * @param a angka pertama
     * @param b angka kedua
     * @return int
     */
    public static int getPerkalian(int a, int b)
    {
        int hasil = a*b;
        return hasil;
    }
    
    /**
     * Fungsi untuk mencari deret fibonacci dengan batas maksimal nilai tertentu
     * @param a batas maksimal nilai
     * @return array
     */
    public static ArrayList<Integer> getFibonacci(int batasAtas) 
    { 
        ArrayList<Integer> fibo = new ArrayList<Integer>(); 
        int i = 0;
        int x=0;
        while(x<batasAtas)
        {
           if (i<2)
           {
               fibo.add(i);
           }
           else
           {
               x=fibo.get(i-1)+ fibo.get(i-2);
               if(x<batasAtas)
               {
                   fibo.add(x);
               }
            }
           i++;
        }
        return fibo;
    }

        /**
         * Fungsi untuk mencari deret bilangan prima sampai batas nilai tertentu
         * @param nilaiMax berisi batas nilai
         * @return array integer
         */
	public static ArrayList<Integer> getPrima(int nilaiMax) 
        {
            ArrayList<Integer> prima = new ArrayList<Integer>();
            int n = 2;   
            int count=0;
            prima.add(n);
            while (n<nilaiMax)
            {
                int d = 2;
                n++;
                for (int a = 0; a < prima.size(); a++) 
                {
                    if (n % prima.get(a) == 0) 
                    {
                        d=d+1;
                        break;
                    }
                    count++;
                }
                if(d==2){
                prima.add(n);}
                count++;
             }
            System.out.println("Jumlah perulangan " + count);
            return prima;
        }                    

    /**
     * Fungsi untuk menampilkan deret nilai random dimana sebuah angka bisa muncul berulang
     * @param index berisi panjang deret
     * @return array integer
     */
    public static int[] getRandomValue(int index) 
    {
        int[] x = new int[index];
        Random rand = new Random(); 

        for (int i = 0; i < index; i++) { 
            x[i] = rand.nextInt(10); 
        }
        return x; 

    }

//4.2 Random Unique
    /**
     * Fungsi untuk menampilkan deret nilai random unik dimana sebuah angka tidak bisa muncul berulang
     * @param index berisi panjang deret
     * @return array integer
     */
    public static ArrayList<Integer> getRandomValueUniq(int index) 
    {
        Random rand = new Random(); 
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 

        while (arrayList.size() < index) 
        {
            int a = rand.nextInt(10); 
            if (!arrayList.contains(a)) { 
                arrayList.add(a); 
            }
        }
        return arrayList; 
    }
    
    /**
     * Fungsi untuk menampilkan pecahan uang rupiah dari sejumlah uang tertentu
     * @param jumlahUang berisi jumlah uang yang akan dicari pecahannya
     * @return array integer
     */
    public static int[][] getPecahan(int jumlahUang)
    {
        int [][] pecahan = {{100000,0}, {50000,0}, {20000,0}, {10000,0}, {5000,0}, {2000,0}, {1000,0}, {500,0}, {200,0}, {100,0}};
        int jumlah;
        for (int j = 0; j<pecahan.length; j++)
        {                
            jumlah = jumlahUang/pecahan[j][0];
            jumlahUang = jumlahUang - (pecahan[j][0]*jumlah);
            pecahan[j][1] = jumlah;           
        }
        return pecahan;  
    } 
}
