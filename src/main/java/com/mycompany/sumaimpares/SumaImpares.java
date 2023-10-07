/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumaimpares;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class SumaImpares {
    public static Scanner s= new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=0;
        int resultado=0;
        System.out.println("Ingresa el último número impar");
        n =s.nextInt();
        resultado=(int) Math.pow((n+1)/2,2);
                
        System.out.println("La suma de los impares hasta "+n+" es: "+ resultado);
        
    }
}
