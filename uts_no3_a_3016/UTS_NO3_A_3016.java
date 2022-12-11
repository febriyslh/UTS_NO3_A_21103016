/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.uts_no3_a_3016;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Febri S
 * 21103016
 * SI05-A
 */
public class UTS_NO3_A_3016 {

    public static void main(String[] args) {
        //Membuat object menggunakan array
        AsistenPraktikum_3016[] ap = new AsistenPraktikum_3016[1];
        StudentStaff_3016[] ss = new StudentStaff_3016[1];
        
        ap[0] = new AsistenPraktikum_3016();
        ss[0] = new StudentStaff_3016();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data asisten praktikum
            for(int i = 0; i < 1; i++){
                System.out.println("Jumlah Asisten Praktikum :1");
                System.out.println("===Input Data Asisten Praktikum===");
                System.out.print("NIM                 : ");
                ap[i].nim_3016 = br.readLine();
                System.out.print("Nama                : ");
                ap[i].nama_3016 = br.readLine();
                System.out.print("Jurusan             : ");
                ap[i].jurusan_3016 =br.readLine();
                System.out.print("IPK                 : ");
                ap[i].ipk_3016 =Float.parseFloat(br.readLine());
                System.out.print("MK Asisten          : ");
                ap[i].mkAsisten_3016 = br.readLine();
                System.out.print("Jumlah Pertemuan    : ");
                ap[i].jmlhPertemuan_3016 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //mengisi data ke array pada data student staff
            for(int i = 0; i < 1; i++){
                 System.out.println("Jumlah Student Staff :1");
                System.out.println("===Input Data Student Staff===");
                System.out.print("NIM                 : ");
                ss[i].nim_3016 = br.readLine();
                System.out.print("Nama                : ");
                ss[i].nama_3016 = br.readLine();
                System.out.print("Jurusan             : ");
                ss[i].jurusan_3016 =br.readLine();
                System.out.print("IPK                 : ");
                ss[i].ipk_3016 =Float.parseFloat(br.readLine());
                System.out.print("Unit Kerja          : ");
                ss[i].unitKerja_3016 =br.readLine();
                System.out.print("Jam Kerja           : ");
                ss[i].jamKerja_3016 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
             //Menampilkan semua isi array pada data asisten praktikum
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3016 AP : ap){
                AP.tampilDataAsistenPraktikum_3016();
                System.out.println("");
            }
            
            //Menampilkan semua isi array pada data student staff
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3016 SS : ss){
                SS.tampilDataStudentStaff_3016();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
        
    }
}