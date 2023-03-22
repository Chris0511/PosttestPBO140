package Posttest3;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException{

        ArrayList parfum = new ArrayList<>();
        ArrayList<ParfumPria> listParfumPria = new ArrayList<ParfumPria>();
        ArrayList<ParfumWanita> listParfumWanita = new ArrayList<ParfumWanita>();

        
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
            System.out.println("""
            Masukkan Pilihan : 
            1.Tambah Parfum Pria
            2.Tambah Parfum Wanita
            ------------------------""");
            int pilih = Integer.parseInt(br.readLine());
            if(pilih == 1){
                System.out.println("Tambah Parfum Pria ");
                ParfumPria parfumPriaBaru = ParfumPria.tambahParfumPria();
            } else if(pilih == 2) {
                System.out.println("Tambah Parfum Wanita ");
                ParfumWanita parfumWanitaBaru = ParfumWanita.tambahParfumWanita();
            } else{
                System.out.println("Pilihan Tidak Ada!");
            }
            // System.out.println("Masukkan Nama Parfum : ");
            // String nama = br.readLine();
            // System.out.println("Harga Parfum: ");
            // double harga = Double.parseDouble(br.readLine());
            
            // Parfum parfumBaru = new Parfum(nama, harga);
            
            // parfum.add(parfumBaru);
            //parfumBaru.notif();
            
            }else if (pil == 2) {
                if (Parfum.isEmpty()){
                    System.out.println("Daftar Parfum kosong");
                } else {
                System.out.println("""
                Daftar Parfum :
                1.Parfum Pria
                2.Parfum Wanita""");
                
                int plh = Integer.parseInt(br.readLine());
                 if(plh == 1)  {
                 System.out.println("\nDaftar Parfum Pria  :");
                 
                 tampilkanParfumPria(listParfumPria);
                } else if(plh == 2){
                System.out.println("\nDaftar Parfum Wanita  :");
                
                tampilkanParfumWanita(listParfumWanita);
            } else {
                     System.out.println("Pilihan Tidak Ada");
             }
        }     

            }else if(pil == 3){
                System.out.print("Masukkan indeks parfum yang akan diubah : ");
                int indeksParfum = Integer.parseInt(br.readLine());
                    if(indeksParfum >= parfum.size() || indeksParfum < 0) {
                    System.out.println("Indeks parfum tidak valid");
                    
                    } else {
                    Parfum parfumDiedit = (Parfum) parfum.get(indeksParfum);
                    System.out.print("Masukkan nama parfum baru : ");
                    String namaParfumBaru = br.readLine();
                    System.out.print("Masukkan harga parfum baru : ");
                    double hargaParfumBaru = Double.parseDouble(br.readLine());
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

    private static void tampilkanParfumWanita(ArrayList<ParfumWanita> listParfumWanita) {
    }

    private static void tampilkanParfumPria(ArrayList<ParfumPria> listParfumPria) {
    }

    private static Object tambahParfumWanita() {
        return null;
    }

    private static Object tambahParfumPria() {
        return null;
    }
    
}
