/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no3_a_3016;

/**
 *
 * @author User
 */
public class StudentStaff_3016 extends Mahasiswa_3016{
    String unitKerja_3016;
    int jamKerja_3016;
    
    public double totalPendapatan_3016(){
        return(jamKerja_3016*30000);
    }
    
    public void tampilDataStudentStaff_3016(){
        tampilDataMahasiswa_3016();
        System.out.println("Unit Kerja          : " + unitKerja_3016);
        System.out.println("Jam Kerja           : " + jamKerja_3016);
        System.out.println("Total pendapatan    : " + totalPendapatan_3016());
    }
}
