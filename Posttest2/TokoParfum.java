/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.parfum;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TokoParfum {

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
            System.out.println("Harga Parfum: ");
            String harga = br.readLine();
            
            Tambah parfumBaru = new Tambah(nama, harga);
            
            parfum.add(parfumBaru);
            parfumBaru.notif();
            
            }else if (pil == 2) {
                System.out.println("Daftar Parfum:");
                for (int i = 0; i < parfum.size(); i++) {
                Tambah parfumSekarang = (Tambah)parfum.get(i);
                System.out.println("Nama Parfum : " + parfumSekarang.getNama());
                System.out.println("Harga Parfum : " + parfumSekarang.getHarga());
                System.out.println("--------------------------");
                }
                 
            }else if(pil == 3){
                System.out.print("Masukkan indeks parfum yang akan diubah : ");
                int indeksParfum = Integer.parseInt(br.readLine());
                    if(indeksParfum >= parfum.size() || indeksParfum < 0) {
                    System.out.println("Indeks parfum tidak valid");
                    
                    } else {
                    Tambah parfumDiedit = (Tambah) parfum.get(indeksParfum);
                    System.out.print("Masukkan nama parfum baru : ");
                    String namaParfumBaru = br.readLine();
                    System.out.print("Masukkan harga parfum baru : ");
                    String hargaParfumBaru = br.readLine();
                    parfumDiedit.setNama(namaParfumBaru);
                    parfumDiedit.setHarga(hargaParfumBaru);
                    System.out.println("Parfum berhasil diubah");
                }

            }else if (pil == 4) {
                // Hapus parfum dengan indeks tertentu
                System.out.print("Masukkan indeks parfum yang akan dihapus : ");
                int indeksParfum = Integer.parseInt(br.readLine());
                    if (indeksParfum >= parfum.size() || indeksParfum < 0) {
                    System.out.println("Indeks parfum tidak valid");

                    } else {
                    parfum.remove(indeksParfum);
                    System.out.println("Parfum berhasil dihapus");
                    }
            } else if (pil == 5) {
            // Keluar dari program
                System.out.println("Terima kasih telah menggunakan program ini");
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }
    
}
