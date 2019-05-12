/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

public class PBO {

    static AlatMandi input = new AlatMandi();
    static AlatTulis input1 = new AlatTulis();
    static AlatKesehatan input2 = new AlatKesehatan();
    static Alat blabla = new Alat();
    static String nama;
    static String merk;
    static String wujud;
    static String warna;
    static String fungsi;
    static int dimensi;
    static int dimensi1;
    static String manfaat, jenis;
    static int harga;
    static Scanner baca = new Scanner(System.in);
    static int jum, jns;

    public static void main(String[] args) {
        input();

    }

    static void input() {

        System.out.print(" Masukan Jumlah :");
        jum = baca.nextInt();
        System.out.println("== Jenis Alat ==");
        System.out.println();
        System.out.println(" 1.Alat Mandi ");
        System.out.println(" 2.Alat Tulis ");
        System.out.println(" 3.Alat Kesehatan ");
        System.out.println();
        System.out.print(" Pilih Jenis Alat :");
        jns = baca.nextInt();

        if (jns == 1) {
            for (int i = 1; i <= jum; i++) {
                nama = input.nama(nama);
                merk = input.merk(merk);
                harga = input.hargabeli(jns);
                wujud = input.wujud(wujud);
                warna = input.warna(warna);
                System.out.println("============================");
                System.out.println("Nama Barang     :" + nama);
                System.out.println("Merk Barang     :" + merk);
                System.out.println("Harga Barang    :Rp." + harga);
                System.out.println("Wujud barang    :" + wujud);
                System.out.println("Warna Barang    :" + warna);
            }
            
        }
        if (jns == 2) {
            for (int i = 1; i <= jum; i++) {
                nama = input1.nama(nama);
                merk = input1.merk(merk);
                harga = input1.hargabeli(jns);
                fungsi = input1.fungsi(fungsi);
                dimensi = input1.dimensipnjg(dimensi);
                dimensi1 = input1.dimensil();
                System.out.println("============================");
                System.out.println("Nama Barang     :" + nama);
                System.out.println("Merk Barang     :" + merk);
                System.out.println("Harga Barang    :Rp." + harga);
                System.out.println("Fugsi barang   :" + fungsi);
                System.out.println("Dimensi Barang  :" + dimensi + "X" + dimensi1);
            }
           
        }
        if (jns == 3) {
            for (int i = 1; i <= jum; i++) {
                nama = input2.nama(nama);
                merk = input2.merk(merk);
                harga = input2.hargabeli(jns);
                jenis = input2.jenis(jenis);
                manfaat = input2.manfaat(manfaat);
                System.out.println("============================");
                System.out.println("Nama Barang     :" + nama);
                System.out.println("Merk Barang     :" + merk);
                System.out.println("Harga Barang    :Rp." + harga);
                System.out.println("Jenis barang    :" + jenis);
                System.out.println("Manfaat Barang  :" + manfaat);
            }
        }
    }
}
