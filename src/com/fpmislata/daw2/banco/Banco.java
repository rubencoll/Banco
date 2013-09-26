/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.banco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        
        int seleccionMenu = -1;

        while (seleccionMenu != 0) {

            System.out.println("");
            System.out.println("############# BANCSTAFA ##############");
            System.out.println("");
            System.out.println(" 1- Menu Entidad Bancaria");
            System.out.println(" 2- Menu Sucursal Bancaria");
            System.out.println(" 3- Menu Cuenta Bancaria");
            System.out.println(" 4- Menu Movimiento Bancario");
            System.out.println("");
            System.out.println("0- Salir");
            System.out.println("");
            System.out.println("#######################################");
            seleccionMenu = sc.nextInt();

            if (seleccionMenu == 1) {   // Menu Entidad Bancaria

                menuEntidadBancaria();

            } else if (seleccionMenu == 2) { // Menu Sucursal Bancaria

                menuSucursalBancaria();

            } else if (seleccionMenu == 3) {    // Menu Cuenta Bancaria

                menuCuentaBancaria();

            } else if (seleccionMenu == 4) {    // Menu Movimiento Bancario

                menuMovimientoBancario();

            } else if (seleccionMenu == 0) {    //Salir

                break;
            }
        }
    }

    private static void menuEntidadBancaria() {
        
         Scanner scEntidad = new Scanner(System.in);
        
        int seleccionMenuEntidad = -1;

        while (seleccionMenuEntidad != 0) {

            System.out.println("");
            System.out.println("############ MENU ENTIDAD #############");
            System.out.println("");
            System.out.println(" 1- Insertar Entidad Bancaria");
            System.out.println(" 2- Ver Entidades Bancarias");
            System.out.println(" 3- Ver Entidad Bancaria por ID");
            System.out.println(" 4- Borrar Entidad Bancaria");
            System.out.println("");
            System.out.println("0- Volver");
            System.out.println("");
            System.out.println("#######################################");
            seleccionMenuEntidad = scEntidad.nextInt();

            if (seleccionMenuEntidad == 1) {   // Insertar Entidad Bancaria

                menuEntidadBancaria();

            } else if (seleccionMenuEntidad == 2) { // Ver Entidades Bancarias

                menuSucursalBancaria();

            } else if (seleccionMenuEntidad == 3) {    // Ver Entidad Bancaria por ID

                menuCuentaBancaria();

            } else if (seleccionMenuEntidad == 4) {    // Borrar Entidad Bancaria

                menuMovimientoBancario();

            } else if (seleccionMenuEntidad == 0) {    // Volver

                break;
            }
        }  
    }

    private static void menuSucursalBancaria() {
    }

    private static void menuCuentaBancaria() {
    }

    private static void menuMovimientoBancario() {
    }
}
