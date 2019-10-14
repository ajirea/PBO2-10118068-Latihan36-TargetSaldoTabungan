/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Membuat program untuk menghitung target saldo tabungan
 * berbasis object
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        
        tabungan.setSaldo(3500000);
        tabungan.setSaldoTarget(6000000);
        tabungan.setBunga(0.08);
        
        tabungan.hitungTarget();
    }
    
}
