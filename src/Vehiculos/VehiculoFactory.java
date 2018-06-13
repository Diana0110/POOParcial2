/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class VehiculoFactory {
    public Vehiculo creaVehiculo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese edificacion que desea:\n"
                + "| 1. Avion | 2. Tanque |\n"
                + "| 3. Transporte tipo 1 | 4. Transporte tipo 2 |\n"
                + "opcion: ");
        int c = entrada.nextInt();

        switch (c) {
            case 1:
                Avion avion = new Avion();
                return avion.creaVehiculo();
            case 2:
                Tanque tanque = new Tanque();
                return tanque.creaVehiculo();
            case 3:
                TransporteTipo1 tipo1 = new TransporteTipo1();
                return tipo1.creaVehiculo();
            case 4:
                 TransporteTipo2 tipo2 = new TransporteTipo2();
                return tipo2.creaVehiculo();
            default:
                System.out.println("Error de seleccion. Intente de nuevo");
                return creaVehiculo();
        }
    }
}
