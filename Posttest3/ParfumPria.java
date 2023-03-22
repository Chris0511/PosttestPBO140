package Posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ParfumPria extends Parfum {
    
    private String aroma;
    private int ketahananBau;

    public ParfumPria(String nama, double harga, String aroma, int ketahananBau) {
        super(nama, harga);
        this.aroma = aroma;
        this.ketahananBau = ketahananBau;
    }

    
    public static ParfumPria tambahParfumPria() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama Parfum Pria: ");
        String nama = br.readLine();
        System.out.print("Masukkan Harga Parfum Pria: ");
        double harga = Double.parseDouble(br.readLine());
        System.out.print("Masukkan Aroma Parfum Pria: ");
        String aroma = br.readLine();
        System.out.print("Masukkan Ketahanan Bau Parfum Pria (dalam jam): ");
        int ketahananBau = Integer.parseInt(br.readLine());
        return new ParfumPria(nama, harga, aroma, ketahananBau);
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public int getKetahananBau() {
        return ketahananBau;
    }

    public void setKetahananBau(int ketahananBau) {
        this.ketahananBau = ketahananBau;
    }
    public static ParfumPria get(int i) {
        return null;
    }


    public static void add(Object tambahParfumPria) {
    }

    public static void tampilkanParfumPria(ArrayList<ParfumPria> listParfumPria) {
        System.out.println("\nDaftar Parfum Pria:");
        for (int i = 0; i < listParfumPria.size(); i++) {
            ParfumPria parfum = listParfumPria.get(i);
            System.out.println("Data Parfum Pria ke-" + (i+1) + ":");
            System.out.println("Nama: " + parfum.getNama());
            System.out.println("Harga: Rp." + parfum.getHarga());
            System.out.println("Aroma: " + parfum.getAroma());
            System.out.println("Ketahanan Bau: " + parfum.getKetahananBau() + " jam");
        }
    }
}
