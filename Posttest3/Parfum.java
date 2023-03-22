package Posttest3;

public class Parfum {
    private String nama;
    private double harga;

    public Parfum(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void notif() {
        System.out.println("Parfum Berhasil ditambah");
    }

    public static int size() {
        return 0;
    }

    public static boolean isEmpty() {
        return false;
    }
}