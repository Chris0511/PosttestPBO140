package Posttest6;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    static ArrayList<ParfumPria> daftarParfumPria = new ArrayList<ParfumPria>();
    static ArrayList<ParfumWanita> daftarParfumWanita = new ArrayList<ParfumWanita>();



    public static void main(String[] args) throws IOException{

        ParfumPria p1 = new ParfumPria("Bvlgari Pour Homme", 1298000, "Bergamot", 8);
        daftarParfumPria.add(p1);
    
        ParfumWanita p2 = new ParfumWanita("Chanel No.5", 1400000, "Floral", 10);
        daftarParfumWanita.add(p2);

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
                
        while(true){
        System.out.println("===============================");
        System.out.println("| Menu :                      |");
        System.out.println("| 1. Deskripsi Toko           |");
        System.out.println("| 2. Tambah Parfum            |");
        System.out.println("| 3. Tampilkan Daftar Parfum  |");
        System.out.println("| 4. Ubah Parfum              |");
        System.out.println("| 5. Hapus Parfum             |");
        System.out.println("| 6. Keluar                   |");
        System.out.println("===============================");
        
        System.out.println("Pilihan Anda : ");
        int pil = Integer.parseInt(br.readLine());

        if (pil == 1){
            Toko dsk = new deskripsiToko();
            int thn = 2021;
            String pst = "Samarinda";
            int cbg = 10;
            dsk.tahun(thn);
            dsk.pusat(pst);
            dsk.cabang(cbg);

        } else if (pil == 2){
            System.out.println("""
            Masukkan Pilihan : 
            1.Tambah Parfum Pria
            2.Tambah Parfum Wanita""");
            System.out.println("Masukkan Pilihan : ");

            int pilih = Integer.parseInt(br.readLine());
            if(pilih == 1){
                System.out.println("Tambah Parfum Pria ");
                daftarParfumPria.add(ParfumPria.tambahParfumPria());
                System.out.println("Parfum berhasil ditambahkan");
            } else if(pilih == 2) {
                System.out.println("Tambah Parfum Wanita ");
                daftarParfumWanita.add(ParfumWanita.tambahParfumWanita());
                System.out.println("Parfum berhasil ditambahkan");
            } else{
                System.out.println("Pilihan Tidak Ada!");
            }
            
            }else if (pil == 3) {
                if (Parfum.isEmpty()){
                    System.out.println("Daftar Parfum kosong");
                } else if(daftarParfumPria.isEmpty() && daftarParfumWanita.isEmpty()) {
                    System.out.println("Daftar Parfum Pria dan Wanita kosong");
                } else {
                System.out.println("""
                Daftar Parfum :
                1.Parfum Pria
                2.Parfum Wanita""");
                System.out.println("Masukkan Pilihan : ");

                int plh = Integer.parseInt(br.readLine());
                if (plh == 1) {
                    if (daftarParfumPria.isEmpty()) {
                        System.out.println("Daftar Parfum Pria kosong");
                    } else {
                        p1.andalan("Bvlgari Pour Homme");
                        System.out.println("===============================");
                        System.out.println("Daftar Parfum Pria : ");

                    for (int i = 0; i < daftarParfumPria.size(); i++) {
                        ParfumPria ParfumPria = daftarParfumPria.get(i);
                        System.out.println("Parfum Pria ke-" + (i+1));
                        System.out.println("Nama: " + ParfumPria.getNama());
                        System.out.println("Harga: " + "Rp" + ParfumPria.getHarga());
                        System.out.println("Aroma: " + ParfumPria.getAroma());
                        System.out.println("Ketahanan Bau : " + ParfumPria.getKetahananBau() + " jam");
                        System.out.println("===============================");
                    }
                }
            } else if(plh == 2){
                    if (daftarParfumWanita.isEmpty()) {
                        System.out.println("Daftar Parfum Wanita kosong");
                    } else {
                        
                        p2.unggulan("Chanel No.5");
                        System.out.println("===============================");
                        System.out.println("Daftar Parfum Wanita : ");
                        
                    for (int i = 0; i < daftarParfumWanita.size(); i++) {
                        ParfumWanita ParfumWanita = daftarParfumWanita.get(i);
                        System.out.println("Parfum Wanita ke-" + (i+1));
                        System.out.println("Nama: " + ParfumWanita.getNama());
                        System.out.println("Harga: " + "Rp" + ParfumWanita.getHarga());
                        System.out.println("Aroma: " + ParfumWanita.getAroma());
                        System.out.println("Ketahanan Bau : " + ParfumWanita.getTingkatKeharuman() + " jam");
                        System.out.println("===============================");
                    }
                }
            } else {
                     System.out.println("Pilihan Tidak Ada");
             }
        }     

            }else if(pil == 4){
                System.out.println("""
                    Edit Data :
                    1. Parfum Pria
                    2. Parfum Wanita""");
                System.out.println("Masukkan Pilihan : ");
                int plh = Integer.parseInt(br.readLine());
                if (plh == 1) {
                    System.out.print("Index Parfum Pria yang ingin diedit: ");
                    int index = Integer.parseInt(br.readLine()) - 1; // adjust for 0-indexing
                    if (index >= 0 && index < daftarParfumPria.size()) {
                        ParfumPria parfumPria = daftarParfumPria.get(index);
                        System.out.println("Data Parfum Pria ke-" + (index + 1));
                        System.out.println("Nama: " + parfumPria.getNama());
                        System.out.println("Harga: " + parfumPria.getHarga());
                        System.out.println("Aroma: " + parfumPria.getAroma());
                        System.out.println("Ketahanan Bau : " + parfumPria.getKetahananBau() + " jam");
                
                        System.out.println("Masukkan nama baru: ");
                        String namaBaru = br.readLine();
                        parfumPria.setNama(namaBaru);
                
                        System.out.println("Masukkan harga baru: ");
                        double hargaBaru = Double.parseDouble(br.readLine());
                        parfumPria.setHarga(hargaBaru);
                
                        System.out.println("Masukkan aroma baru: ");
                        String aromaBaru = br.readLine();
                        parfumPria.setAroma(aromaBaru);
                
                        System.out.println("Masukkan ketahanan bau baru: ");
                        int ketahananBauBaru = Integer.parseInt(br.readLine());
                        parfumPria.setKetahananBau(ketahananBauBaru);
                
                        System.out.println("Data berhasil diubah");
                    } else {
                        System.out.println("Index tidak valid");
                    }
                } else if (plh == 2) {
                    System.out.print("Index Parfum Wanita yang ingin diedit: ");
                    int index = Integer.parseInt(br.readLine()) - 1; // adjust for 0-indexing
                    if (index >= 0 && index < daftarParfumWanita.size()) {
                        ParfumWanita parfumWanita = daftarParfumWanita.get(index);
                        System.out.println("Data Parfum Wanita ke-" + (index + 1));
                        System.out.println("Nama: " + parfumWanita.getNama());
                        System.out.println("Harga: " + parfumWanita.getHarga());
                        System.out.println("Aroma: " + parfumWanita.getAroma());
                        System.out.println("Tingkat Keharuman : " + parfumWanita.getTingkatKeharuman() + " jam");
                
                        System.out.println("Masukkan nama baru: ");
                        String namaBaru = br.readLine();
                        parfumWanita.setNama(namaBaru);
                
                        System.out.println("Masukkan harga baru: ");
                        double hargaBaru = Double.parseDouble(br.readLine());
                        parfumWanita.setHarga(hargaBaru);
                
                        System.out.println("Masukkan aroma baru: ");
                        String aromaBaru = br.readLine();
                        parfumWanita.setAroma(aromaBaru);
                
                        System.out.println("Masukkan tingkat keharuman baru: ");
                        int tingkatKeharumanBaru = Integer.parseInt(br.readLine());
                        parfumWanita.setTingkatKeharuman(tingkatKeharumanBaru);
                        System.out.println("Data berhasil diubah");
                    } else {
                        System.out.println("Index tidak valid");
                    }

                }
            } else if (pil == 5) {
                    System.out.println("""
                        Hapus Data :
                        1. Parfum Pria
                        2. Parfum Wanita""");
                    System.out.println("Masukkan Pilihan : ");
                    int p = Integer.parseInt(br.readLine());
                    if (p == 1) {
                        System.out.print("Index Parfum Pria yang ingin dihapus: ");
                        int index = Integer.parseInt(br.readLine()) - 1; 
                        if (index >= 0 && index < daftarParfumPria.size()) {
                            daftarParfumPria.remove(index);
                            System.out.println("Data Parfum Pria ke-" + (index + 1) + " berhasil dihapus");
                        } else {
                            System.out.println("Index tidak valid");
                        }
                    } else if (p == 2) {
                        System.out.print("Index Parfum Wanita yang ingin dihapus: ");
                        int index = Integer.parseInt(br.readLine()) - 1; 
                        if (index >= 0 && index < daftarParfumWanita.size()) {
                            daftarParfumWanita.remove(index);
                            System.out.println("Data Parfum Wanita ke-" + (index + 1) + " berhasil dihapus");
                        } else {
                            System.out.println("Index tidak valid");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                } else if (pil == 6) {
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    System.exit(0);
                    break;
                } else {
                    System.out.println("Pilihan tidak valid");
                    break;
                }
     
               }
       }
}
