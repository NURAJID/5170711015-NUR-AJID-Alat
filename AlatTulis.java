/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;
import static pbo.AlatMandi.baca;

public class AlatTulis extends Alat{
  static Scanner baca = new Scanner(System.in);
    
    public int hargabeli(int harga) {
        System.out.print("Masukan Harga Barang :Rp.");
        harga = baca.nextInt();
      return harga;
    } 
    public String merk(String merk) {
        System.out.print("Masukan Merk Barang :");
        merk = baca.next();
      return merk;
    }

    public String nama(String nama) {
        System.out.print("Masukan Nama Barang :");
        nama = baca.next();
      return nama;
    }
    public String fungsi(String fungsi){
        System.out.print("Masukan Fungsi Alat :");
        fungsi=baca.next();
      return fungsi;
    }
    public int dimensipnjg(int dimensi){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Dimensi PXl");
        System.out.print("Panjang   :");
        int pnjng = input.nextInt();
      return pnjng;
    }
    public int dimensil(){
        Scanner input=new Scanner(System.in);
        System.out.print("Lebar     :");
        int lebar=input.nextInt();
      return lebar;
        
    }
}

