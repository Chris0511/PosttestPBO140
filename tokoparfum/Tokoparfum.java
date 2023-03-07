package com.mycompany.tokoparfum;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tokoparfum {

    public static void main(String[] args) throws IOException{

        ArrayList parfum = new ArrayList<>();
        
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
        while(true){
        System.out.println("===============================");
        System.out.println("| Menu :                      |");
        System.out.println("| 1. Tambah Parfum            |");
        System.out.println("| 2. Tampilkan Daftar Parfum  |");
        System.out.println("| 3. Ubah Parfum              |");
        System.out.println("| 4. Hapus Parfum             |");
        System.out.println("| 5. Keluar                   |");
        System.out.println("===============================");
        
        System.out.println("Pilihan Anda : ");
        int pil = Integer.parseInt(br.readLine());
        
        if (pil == 1){
            System.out.println("Masukkan Nama Parfum : ");
            String nama = br.readLine();
            Tambah prf = new Tambah(nama);
            
            parfum.add(prf.nama);
            prf.notif();
            
            }else if(pil == 2){
            for(int i = 0; i<parfum.size(); i++){
                System.out.println(parfum.get(i));
                }
            }else if(pil == 3){
                Ubah upd = new Ubah();
                upd.Idx();
                int Idx = Integer.parseInt(br.readLine());
                
                upd.konfir();
                String gantinya = br.readLine();
                
                parfum.set(Idx, gantinya);
                
                upd.sukses();
                
            }else if(pil == 4){
                Hapus hps = new Hapus();
                        
                hps.Idx();
                int idx = Integer.parseInt(br.readLine());
                
                parfum.remove(idx);
                
                hps.sukses();
        
            }else if(pil == 5){
                System.out.println("Berhasil keluar!");
                break;
            }
        }
    }
    
}


