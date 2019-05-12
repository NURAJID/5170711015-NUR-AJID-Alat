/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;
import static pbo.AlatTulis.baca;

public class AlatKesehatan extends Alat {
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
    public String jenis(String jenis){
        System.out.print("Masukan Jenis Barang :");
        jenis = baca.next();
        return jenis;
    }
    public String manfaat(String manfaat){
        System.out.print("Masukan Manfaat Barang :");
        manfaat= baca.next();
        return manfaat;
    }
}
