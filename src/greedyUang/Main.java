/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyUang;

import java.util.Scanner;

/**
 *
 * @author Amran
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nominal uang yang akan dipecahkan (Rp) :");
        int uang = input.nextInt();
        System.out.print("Jumlah uang yang tersedia :");
        int n = input.nextInt();
        int koin[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Uang " + (i + 1) + " dengan nominal (Rp) : ");
            koin[i] = input.nextInt();
        }
        System.out.print("Masukkan jumlah Kemungkinan uang yang bisa ditukarkan dengan uang "+uang+"  :");
        int batas = input.nextInt();
        int hasil[] = new int[batas];
        int jumlah[] = new int[batas];
        // instansiasi objek greedy
        Greedy greedy = new Greedy();
        for (int i = 0; i < batas; i++) {
            System.out.print("Pecahan ke " + (i + 1) + " yaitu ");
            greedy.Greedy(koin, hasil, jumlah, uang, i);
        }
        greedy.solusiGlobal(hasil, jumlah, uang);
    }
    
}
