/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

public class AlatMandi extends Alat {

    static Scanner baca = new Scanner(System.in);

    public String wujud(String wujud) {
        System.out.print("Masukan Wujud Barang : ");
        wujud = baca.next();
        return wujud;
        
    }

    public String warna(String warna) {
        System.out.print("Masukan Warna Barang : ");
        warna = baca.next();
        return warna;
    }

    @Override
    public int hargabeli(int harga) {
        System.out.print("MAsukan Harga Barang :Rp.");
        harga = baca.nextInt();
        return harga;
    }

    @Override
    public String merk(String merk) {
        System.out.print("Masukan Merk Barang :");
        merk = baca.next();
        return merk;
    }

    @Override
    public String nama(String nama) {
        System.out.print("Masukan Nama Barang :");
        nama = baca.next();
        return nama;
    }

}
