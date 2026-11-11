/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iuwar;

/**
 *
 * @author Ramadian
 */
public class warga {
    private String idWarga;
    private String nama;
    private String noRumah;
    private int jumlahPenghuni;
    
    public warga(String idWarga, String nama, String noRumah, int jumlahPenghuni) {
        this.idWarga = idWarga;
        this.nama = nama;
        this.noRumah = noRumah;
        this.jumlahPenghuni = jumlahPenghuni;
    }
    
    public String getIdWarga() {
        return idWarga;
    }
    public void setIdWarga(String idWarga) {
        this.idWarga = idWarga;
    }
    public String getNama() {
        return nama;
    }
    public void setNama() {
        this.nama = nama;
    }
    public String getNoRumah() {
        return noRumah;
    }
    public void setNoRumah() {
        this.noRumah = noRumah;
    }
    public int getJumlahPenghuni() {
        return jumlahPenghuni;
    }
    public void setJumlahPenghuni(int jumlahPenghuni) {
        this.jumlahPenghuni = jumlahPenghuni;
    }
    
    public void tampilkanDataWarga() {
        System.out.println("ID Warga: "  + idWarga);
        System.out.println("Nama Warga: " + nama);
        System.out.println("No. Rumah: " + noRumah);
        System.out.println("Jumlah Penghuni: " + jumlahPenghuni + "orang");
    }
    
}
