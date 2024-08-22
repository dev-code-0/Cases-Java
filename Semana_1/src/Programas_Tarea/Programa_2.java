/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Programas_Tarea;

import java.util.Scanner;

public class Programa_2 {
    
    public static void main(String[] args){
        
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, totalSueldo, sueldoPromedio;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese el sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        
        System.out.print("Ingrese el segundo sueldo: ");
        sueldo2 = lectura.nextDouble();
        
        System.out.print("Ingrese el tercer sueldo: ");
        sueldo3 = lectura.nextDouble();
        
        System.out.print("Ingrese el cuarto sueldo: ");
        sueldo4 = lectura.nextDouble();
        
        System.out.print("Ingrese el quinto sueldo: ");
        sueldo5 = lectura.nextDouble();
        
        totalSueldo = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        
        sueldoPromedio = totalSueldo / 5;
        
        System.out.println("\tSueldos");
        System.out.println("El total de sueldos es: " + totalSueldo);
        System.out.println("El promedio de los sueldo es: " + sueldoPromedio);
        
        
    }

}
