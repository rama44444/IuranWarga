package com.mycompany.iuwar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<warga> daftarWarga = new ArrayList<>();

        // Inisialisasi tarif iuran
        IuranKebersihan kebersihan = new IuranKebersihan(3000); // Rp3.000 / orang
        IuranKeamanan keamanan = new IuranKeamanan(25000);    // Rp25.000 flat

        int pilihan = 0;
        int counterID = 1;

        while (pilihan != 3) {
            System.out.println("\n=== IUWAR - MENU UTAMA ===");
            System.out.println("1. Tambah Warga");
            System.out.println("2. Lihat Warga & Total Iuran");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan enter

            if (pilihan == 1) {
                String id = "W00" + counterID++;
                System.out.print("Nama Warga: ");
                String nama = scanner.nextLine();
                
                System.out.print("No Rumah: ");
                String noRumah = scanner.nextLine();
                
                System.out.print("Jumlah Penghuni: ");
                int penghuni = scanner.nextInt();

                // Simpan ke ArrayList
                warga w = new warga(id, nama, noRumah, penghuni);
                daftarWarga.add(w);
                System.out.println("-> Data warga berhasil ditambahkan!");

            } else if (pilihan == 2) {
                System.out.println("\n--- DAFTAR WARGA & IURAN ---");
                if (daftarWarga.isEmpty()) {
                    System.out.println("Belum ada data warga.");
                } else {
                    for (warga w : daftarWarga) {
                        w.tampilkanDataWarga();
                        
                        // Hitung iuran dari Subclass
                        double totalKebersihan = kebersihan.hitungTotalIuran(w.getJumlahPenghuni());
                        double totalKeamanan = keamanan.hitungTotalIuran(w.getJumlahPenghuni());
                        double totalWajibBayar = totalKebersihan + totalKeamanan;

                        System.out.println("Iuran Kebersihan : Rp" + (long) totalKebersihan);
                        System.out.println("Iuran Keamanan   : Rp" + (long) totalKeamanan);
                        System.out.println("TOTAL IURAN      : Rp" + (long) totalWajibBayar);
                        System.out.println("---------------------------------");
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Program selesai. Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        
        scanner.close();
    }
}