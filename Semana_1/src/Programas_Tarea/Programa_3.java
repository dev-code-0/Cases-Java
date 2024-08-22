/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Programas_Tarea;

import java.util.Scanner;

public class Programa_3 {
    
    public static void main(String args[]){
        String nombre, cargo;
        double ingreso, gastoMensual;
        double  ahorroMensual, ahorroBimestral, ahorroSemestral, ahorroAnual;
        
        Scanner  lectura = new Scanner (System.in);
        
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = lectura.next();
        
        System.out.print("Ingrese el cargo del empleado: ");
        cargo = lectura.next();
        
        System.out.print("Ingrese los ingresos mensuales: ");
        ingreso = lectura.nextDouble();
        
        System.out.print("ingrese los gastos mensuales: ");
        gastoMensual = lectura.nextDouble();

        ahorroMensual = ingreso - gastoMensual;
        ahorroBimestral = ahorroMensual * 2;
        ahorroSemestral = ahorroMensual * 6;
        ahorroAnual = ahorroMensual * 12;
        
        System.out.println("Nombre del Empleado: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Ahorro Mensual: " + ahorroMensual);
        System.out.println("Ahorro Bimestral: " + ahorroBimestral);
        System.out.println("Ahorro Semestral: " + ahorroSemestral);
        System.out.println("Ahorro Anual: " + ahorroAnual);
    }

}
