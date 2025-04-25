package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer nombre");
        String nombre1 = scanner.nextLine();
        
        System.out.print("Ingrese el segundo nombre");
        String nombre2 = scanner.nextLine();
        
        System.out.print("Ingrese el primer apellido");
        String apellido1 = scanner.nextLine();
        
        System.out.print("Ingrese el segundo apellido");
        String apellido2 = scanner.nextLine();
        
        String nombreCompleto = nombre1 + " " + nombre2 + " " + apellido1 + " " + apellido2;
        
        System.out.println("Nombre completo: " + nombreCompleto);
        
        scanner.close();
    }
}