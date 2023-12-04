/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bmi.bmiproject;
import java.util.Scanner;
/**
 *
 * @author VALENT
 */
public class BMIKALKULATOR {
 
    public static void main(String[] args) throws Exception {
        BMIKALKULATOR();
    }
    private static void BMIKALKULATOR() throws Exception {
        System.out.print("MASUKKAN BERAT BADAN KG : ");
        Scanner s = new Scanner(System.in);
        float berat = s.nextFloat();
        System.out.print("MASUKAN TINGGI BADAN CM : ");
        float tinggi = s.nextFloat();
         
        float bmi = (100*100*berat)/(tinggi*tinggi);
         
        System.out.println("Hasil: "+bmi);
        bmicode(bmi);
         
    }

    private static void bmicode(float bmi) {
        if(bmi < 18.5) {
            System.out.println("BERAT BADAN ANDA KURANG");
        }else if (bmi < 25) {
            System.out.println("NORMAL");
        }else if (bmi < 30) {
            System.out.println("BERAT BADAN ANDA LEBIH");
        }else {
            System.out.println("OBESITAS");
        }
    }
}
