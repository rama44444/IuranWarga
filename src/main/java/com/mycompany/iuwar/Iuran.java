/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iuwar;

/**
 *
 * @author Ramadian
 */
public class Iuran {
    private String namaIuran;
    private double tarifDasar;
    
    public Iuran(String namaIuran, double tarifDasar) {
        this.namaIuran = namaIuran;
        this.tarifDasar = tarifDasar;
    }
    public String getNamaIuran() {
        return namaIuran;
    }
    public double getTarifDasar() {
        return tarifDasar;
    }
    public double hitungTotalIuran(int jumlahPenghuni) {
        return tarifDasar;
    }    
}
