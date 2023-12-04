/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bmi.bmiproject;
import java.util.Scanner;
/**
 *
 * @author ABASBOY
 */
public class bodymassindex {
 
    public static void main(String[] args) throws Exception {
        bodymassindex();
    }
    private static void bodymassindex() throws Exception {
        System.out.print("Masukkan Berat Badan : ");
        Scanner s = new Scanner(System.in);
        float berat = s.nextFloat();
        System.out.print("Masukkan Tinggi Badan : ");
        float tinggi = s.nextFloat();
         
        float bmi = (100*100*berat)/(tinggi*tinggi);
         
        System.out.println("Hasil: "+bmi);
        bmi(bmi);
         
    }

    private static void bmi(float bmi) {
        if(bmi < 18.5) {
            System.out.println("kekurangan berat badan");
        }else if (bmi < 25) {
            System.out.println("Normal");
        }else if (bmi < 30) {
            System.out.println("kelebihan berat badan");
        }else {
            System.out.println("mengalami obesitas");
        }
    }
}