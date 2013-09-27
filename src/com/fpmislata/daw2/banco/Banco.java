/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
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

                System.out.println("");
                System.out.println("BancStafa, Tu Ignorancia es Nuestro Beneficio...");
                Thread.sleep(2000);
                System.out.println("");

                break;
            }
        }
    }

    private static void menuEntidadBancaria() { // Menu Entidad Bancaria

        List<EntidadBancaria> listaEntidadesBancarias = new ArrayList<EntidadBancaria>(); //Declaramos una arrayList de entidades bancarias
        Map<Integer, EntidadBancaria> mapEntidadBancaria = new HashMap<>();  //Declaramos el Map de entidad bancaria.

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

                insertarEntidadBancaria(listaEntidadesBancarias, mapEntidadBancaria);

            } else if (seleccionMenuEntidad == 2) { // Ver Entidades Bancarias

                imprimirListaEntidadesBancarias(listaEntidadesBancarias);

            } else if (seleccionMenuEntidad == 3) {    // Ver Entidad Bancaria por ID
            } else if (seleccionMenuEntidad == 4) {    // Borrar Entidad Bancaria
            } else if (seleccionMenuEntidad == 0) {    // Volver

                break;
            }
        }
    }

    private static void insertarEntidadBancaria(List<EntidadBancaria> listaEntidadesBancarias, Map<Integer, EntidadBancaria> mapEntidadesBancarias) {

        EntidadBancaria entidadBancaria = new EntidadBancaria();

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Dime la Identificador de la Entidad: ");

        int id = sc.nextInt();
        entidadBancaria.setIdEntidadBancaria(id);

        System.out.println("");
        System.out.println("Dime el Codigo de la Entidad: ");

        String codigo = sc.next();
        entidadBancaria.setCodigoEntidadBancaria(codigo);

        System.out.println("");
        System.out.println("Dime el Nombre de la Entidad " + codigo + " : ");

        String nombre = sc.next();
        entidadBancaria.setNombre(nombre);

        System.out.println("");
        System.out.println("Dime el CIF de la Entidad " + nombre + " con codigo " + codigo + " : ");

        String cif = sc.next();
        entidadBancaria.setCif(cif);

        System.out.println("");
        System.out.println("Dime el tipo de Entidad: ");

        System.out.println("1- BANCO");
        System.out.println("2- CAJA_DE_AHORRO");
        System.out.println("3- COOPERATIVAS_DE_CREDITO");
        System.out.println("4- ESTABLECIMIENTOS_FINANCIEROS_DE_CREDITO");

        int tipoEntidadBcancaria = sc.nextInt();

        TipoEntidadBancaria tipoEntidadBancaria = null;

        if (tipoEntidadBcancaria == 1) {

            tipoEntidadBancaria = entidadBancaria.getTipoEntidadBancaria().BANCO;

        } else if (tipoEntidadBcancaria == 2) {

            tipoEntidadBancaria = entidadBancaria.getTipoEntidadBancaria().CAJA_DE_AHORRO;

        } else if (tipoEntidadBcancaria == 3) {

            tipoEntidadBancaria = entidadBancaria.getTipoEntidadBancaria().COOPERATIVAS_DE_CREDITO;

        } else if (tipoEntidadBcancaria == 4) {
            tipoEntidadBancaria = entidadBancaria.getTipoEntidadBancaria().ESTABLECIMIENTOS_FINANCIEROS_DE_CREDITO;
        }

        entidadBancaria.setTipoEntidadBancaria(tipoEntidadBancaria);

        mapEntidadesBancarias.put(id, entidadBancaria);  //Insertamos un map, indicando el Objeto y un indice (Id entidad)
        listaEntidadesBancarias.add(entidadBancaria);    //añadimos a la lista

    }

    private static void imprimirListaEntidadesBancarias(List<EntidadBancaria> listaEntidadesBancariasa) {
        System.out.println("");
        System.out.println("########### LISTA ############");

        for (EntidadBancaria entidadBancaria : listaEntidadesBancariasa) {
            System.out.println("-------------------------------------------------");
            System.out.println("ID: " + entidadBancaria.getIdEntidadBancaria());
            System.out.print("Codigo: " + entidadBancaria.getCodigoEntidadBancaria());
            System.out.println("Nombre: " + entidadBancaria.getNombre());
            System.out.println("Cif: " + entidadBancaria.getCif());
            System.out.println("Tipo Entidad: " + entidadBancaria.getTipoEntidadBancaria());
            System.out.println("-------------------------------------------------");
        }

        System.out.println("##############################");

        System.out.println("");
    }

    private static void menuSucursalBancaria() {
    }

    private static void menuCuentaBancaria() {

        List<CuentaBancaria> listaCuentasBancarias = new ArrayList<CuentaBancaria>(); //Declaramos una arrayList de entidades bancarias
        Map<Integer, CuentaBancaria> mapCuentaBancaria = new HashMap<>();  //Declaramos el Map de entidad bancaria.

        Scanner scEntidad = new Scanner(System.in);

        int seleccionMenuEntidad = -1;

        while (seleccionMenuEntidad != 0) {

            System.out.println("");
            System.out.println("######## MENU CUENTA BANCARIA #########");
            System.out.println("");
            System.out.println(" 1- Insertar Cuenta Bancaria");
            System.out.println(" 2- Ver Todos las Cuentas Bancarias");
            System.out.println(" 3- Ver Cuenta Bancaria por ID");
            System.out.println(" 4- Borrar Cuenta Bancaria");
            System.out.println(" 5- Ver un Cuenta Bancaria pasando Objero");
            System.out.println(" 6- Buscar Cuenta Bancaria por Map");
            System.out.println("");
            System.out.println("0- Volver");
            System.out.println("");
            System.out.println("#######################################");
            seleccionMenuEntidad = scEntidad.nextInt();

            if (seleccionMenuEntidad == 1) {   // Insertar Entidad Bancaria
                //  insertarCuentaBancaria(listaCuentasBancarias, mapCuentaBancaria);
            } else if (seleccionMenuEntidad == 2) { // Ver Entidades Bancarias
                // imprimirListaCuentasBancarias(listaCuentasBancarias);
            } else if (seleccionMenuEntidad == 3) {    // Ver Entidad Bancaria por ID
            } else if (seleccionMenuEntidad == 4) {    // Borrar Entidad Bancaria
            } else if (seleccionMenuEntidad == 5) {

                CuentaBancaria cuentaBancaria = new CuentaBancaria();




            } else if (seleccionMenuEntidad == 0) {    // Volver

                break;
            }
        }
    }

    private static void buscarCuentaBancariaMapID(Map<Integer, CuentaBancaria> mapCuentaBancaria, Integer idCuentaBancaria) {

        System.out.println("########### CUENTA BANCARIA ############");

        CuentaBancaria cuentaBancaria = mapCuentaBancaria.get(idCuentaBancaria);
        List<SucursalBancaria> listaSucursalesBancarias = cuentaBancaria.getSucursalBancaria();
        
        System.out.println("-------------------------------------------------");
           
        System.out.println(cuentaBancaria.getInformacionCuentaBancaria());
        
        
        System.out.println("-------------------------------------------------");

        System.out.println("##############################");

        System.out.println("");
    }

    private static void menuMovimientoBancario() {

        List<MovimientoBancario> listaMovimientosBancarios = new ArrayList<MovimientoBancario>(); //Declaramos una arrayList de entidades bancarias
        Map<Integer, MovimientoBancario> mapMovimientoBancaria = new HashMap<>();  //Declaramos el Map de entidad bancaria.

        Scanner scEntidad = new Scanner(System.in);

        int seleccionMenuEntidad = -1;

        while (seleccionMenuEntidad != 0) {

            System.out.println("");
            System.out.println("######## MENU MOVIMIENTO BANCARIO #########");
            System.out.println("");
            System.out.println(" 1- Insertar Movimiento Bancario");
            System.out.println(" 2- Ver Todos los Movimientos Bancarios");
            System.out.println(" 3- Ver Movimiento Bancario por ID");
            System.out.println(" 4- Borrar Entidad Bancaria");
            System.out.println(" 5- Ver un Movimiento pasando Objero");
            System.out.println("");
            System.out.println("0- Volver");
            System.out.println("");
            System.out.println("#######################################");
            seleccionMenuEntidad = scEntidad.nextInt();

            if (seleccionMenuEntidad == 1) {   // Insertar Entidad Bancaria

                insertarMovimientoBancario(listaMovimientosBancarios, mapMovimientoBancaria);

            } else if (seleccionMenuEntidad == 2) { // Ver Entidades Bancarias

                imprimirListaMovimientosBancarios(listaMovimientosBancarios);

            } else if (seleccionMenuEntidad == 3) {    // Ver Entidad Bancaria por ID
            } else if (seleccionMenuEntidad == 4) {    // Borrar Entidad Bancaria
            } else if (seleccionMenuEntidad == 5) {
            } else if (seleccionMenuEntidad == 0) {    // Volver

                break;
            }
        }
    }

    private static void insertarMovimientoBancario(List<MovimientoBancario> listaMovimientosBancarios, Map<Integer, MovimientoBancario> mapMovimientoBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void imprimirListaMovimientosBancarios(List<MovimientoBancario> listaMovimientosBancarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
