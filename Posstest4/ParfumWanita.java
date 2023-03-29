package Posstest4;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParfumWanita extends Parfum {
    
    private String aroma;
    private int tingkatKeharuman;

    public ParfumWanita(String nama, double harga, String aroma, int tingkatKeharuman) {
        super(nama, harga);
        this.aroma = aroma;
        this.tingkatKeharuman = tingkatKeharuman;
    }


    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public int getTingkatKeharuman() {
        return tingkatKeharuman;
    }

    public void setTingkatKeharuman(int tingkatKeharuman) {
        this.tingkatKeharuman = tingkatKeharuman;
    }
    public static ParfumWanita get(int i) {
        return null;
    }
    public static void add(Object tambahParfumWanita) {
    }

// Method overloading
public static ParfumWanita tambahParfumWanita() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Masukkan Nama Parfum Wanita: ");
    String nama = br.readLine();

    System.out.print("Masukkan Harga Parfum Wanita: ");
    double harga = Double.parseDouble(br.readLine());

    System.out.print("Masukkan Aroma Parfum Wanita: ");
    String aroma = br.readLine();

    System.out.print("Masukkan Tingkat Keharuman Parfum Wanita (dalam jam): ");
    int tingkatKeharuman = Integer.parseInt(br.readLine());

    return new ParfumWanita(nama, harga, aroma, tingkatKeharuman);
}
    // Method overloading
    public static ParfumWanita tambahParfumWanita(String nama, double harga, String aroma, int tingkatKeharuman) {
        return new ParfumWanita(nama, harga, aroma, tingkatKeharuman);
}
    // Method overriding
    @Override
    public String toString() {
        return "Parfum pria dengan nama " + nama + ", harga " + harga + ", aroma " + aroma + ", dan ketahanan bau " + tingkatKeharuman + " jam.";
}




    public static void tampilkanParfumWanita(ArrayList<ParfumWanita> parfumWanitaList) {
        System.out.println("\nDaftar Parfum Wanita :");
        for (int i = 0; i < parfumWanitaList.size(); i++) {
            ParfumWanita parfumWanita = parfumWanitaList.get(i);
            System.out.println("Data Parfum Wanita ke-" + (i+1) + ":");
            System.out.println("Nama: " + parfumWanita.getNama());
            System.out.println("Harga: Rp." + parfumWanita.getHarga());
            System.out.println("Aroma: " + parfumWanita.getAroma());
            System.out.println("Tingkat Keharuman: " + parfumWanita.getTingkatKeharuman() + " jam");
        }
    }
}
