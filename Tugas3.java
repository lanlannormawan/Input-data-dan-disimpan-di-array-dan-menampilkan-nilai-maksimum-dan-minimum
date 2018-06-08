
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Tugas3 {
    public static void main(String[] args){
        System.out.println("Mencari nilai minimum dan maksimum pada index array dengan -1 sebagai pelatuknya");
        Scanner sc = new Scanner(System.in);
        int x[] = new int[100];
        int jml = 100,stop = 0;
        for(int i = 0;i<jml;i++){
            System.out.print("Masukkan array isi "+(i+1) + " = ");
            x[i] = sc.nextInt();
            if(x[i]==-1){
                jml = -1;
                stop = i;
            }
        }
        int maks = x[0],min = x[0];
        for(int i = 0;i<stop;i++){
            if(x[i]>maks){
                maks = x[i];
            }
            else if(x[i]<min){
                min = x[i];
            }
        }
        System.out.println("");
        System.out.println("Nilai maksimum : " + maks);
        System.out.println("Nilai minimum  : " + min);
        
    }
    
}
