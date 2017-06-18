/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Amran
 */
public class TukarUang {

    public static void main(String[] args) {
        Greedy greedy = new Greedy();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nominal uang yang akan dipecahkan (Rp) :");
        int Nominal = input.nextInt();
        System.out.print("Jumlah uang yang tersedia :");
        int n = input.nextInt();
        int UangTersedia[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Uang " + (i + 1) + " dengan nominal (Rp) : ");
            UangTersedia[i] = input.nextInt();
        }
        int jumlah = 0;
        System.out.println("Kemungkinan penukaran untuk uang  "+Nominal+" adalah");
        greedy.solusiGlobal(jumlah, Nominal, new ArrayList<Integer>(), UangTersedia);

    }

}
