/*area del circulo es: (Área = π * r^2)*/
package Programas_Clase;

import java.util.Scanner;
import java.lang.Math;

public class Programa_02 {
    public static void main(String[] args){
        
    double radio, area, pi;
    
    Scanner lectura = new Scanner(System.in);
    
        System.out.print("Ingrese el radio: ");
        radio = lectura.nextDouble();
        
        area = Math.PI * Math.pow(radio, 2);
        pi=Math.PI;
        
        System.out.println("pi es igual a: " + pi);
        
        System.out.println("El area del circulo es: " + area);
    }
}