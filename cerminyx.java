package yx;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class cerminyx {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");
        System.out.println(" *Masukkan Nilai X ");
        System.out.println(" ********************************* ");

        double x = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai Y ");
        System.out.println(" ******************************* ");

        double y = sc.nextInt();

        double x1 = y;
        double y1 = x;

        System.out.println(" ******************************* ");
        System.out.println(" *Maka X' = " + x1);
        System.out.println(" *Maka Y' = " + y1);
        System.out.println(" ******************************* ");
    }
    
}
