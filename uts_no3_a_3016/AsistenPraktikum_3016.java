/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no3_a_3016;

/**
 *
 * @author User
 */
public class AsistenPraktikum_3016 extends Mahasiswa_3016{
    String mkAsisten_3016;
    int jmlhPertemuan_3016;
    
    public double totalPendapatan_3016(){
        return(jmlhPertemuan_3016*50000);
    }
    public void tampilDataAsistenPraktikum_3016(){
        tampilDataMahasiswa_3016();
        System.out.println("MK Asisten          : " + mkAsisten_3016);
        System.out.println("Jumlah Pertemuan    : " + jmlhPertemuan_3016);
        System.out.println("Total Pendapatan    : " + totalPendapatan_3016());
    }
}
