/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_2;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N1,N2,suma;
        System.out.print("Escribe un número:");
        N1 = sc.nextInt ();
        System.out.print("Escribe un número:");
        N2 = sc.nextInt ();
        suma = N1 + N2;
        System.out.println("El resultado es" + suma);
    }
}
