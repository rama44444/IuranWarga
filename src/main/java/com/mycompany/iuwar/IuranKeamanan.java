/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iuwar;

/**
 *
 * @author Ramadian
 */
public class IuranKeamanan extends Iuran {
    
    public IuranKeamanan(double tarifTetap) {
        super("Keamanan", tarifTetap);
    }
    
    @Override
    public double hitungTotalIuran(int jumlahPenghuni) {
        return getTarifDasar();
    } 
}
