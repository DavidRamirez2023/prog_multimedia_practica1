/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresycondicionales;

/**
 *
 * @author davidramirezbastida
 */
public class Operadoresycondicionales {

    public static void main(String[] args) {
       double value = 18.37;
       double iva = 0.16;
       double dollar = 300;
       double conver = value * dollar;
       double taxes = iva * conver;
       System.out.println(" Un dollar equivale a: $ " + value + " Pesos ");
       System.out.println(" se agregaron " + dollar + " Equivalen a " + conver + " Pesos ");
       if(conver>2000){
       System.out.println(" Aplicación de taxes con total de " + (taxes + conver));
       }
       
    }
}
