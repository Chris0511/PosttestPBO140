/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.parfum;

public class Tambah {
    private String nama;
    private String harga;

    public Tambah(String nama, String harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void notif() {
        System.out.println("Parfum Berhasil ditambah");
    }
}
