/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import Edificaciones.Contenedores.ContenedorComida;
import Edificaciones.Contenedores.ContenedorDeAgua;
import Edificaciones.Contenedores.ContenedorMilicia;
import Edificaciones.Contenedores.ContenedorOro;
import Edificaciones.Contenedores.ContenedorVehiculos;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class EdificacionFactory {
    public Edificacion creaEdificacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese edificacion que desea:\n"
                + "| 1. Contendor de Comida | 2. Contendor de Agua |\n"
                + "| 3. Mina de oro | 4. Base Militar | 5. Contenedor de Vehiculos |\n"
                + "opcion: ");
        int c = entrada.nextInt();

        switch (c) {
            case 1:
                ContenedorComida comida = new ContenedorComida();
                return comida.crearEdificacion();
            case 2:
                ContenedorDeAgua agua = new ContenedorDeAgua();
                return agua.crearEdificacion();
            case 3:
                ContenedorOro oro = new ContenedorOro();
                return oro.crearEdificacion();
            case 4:
                ContenedorMilicia milicia = new ContenedorMilicia();
                return milicia.crearEdificacion();
            case 5:
                ContenedorVehiculos vehiculo = new ContenedorVehiculos();
                return vehiculo.crearEdificacion();
            default:
                System.out.println("Error de seleccion. Intente de nuevo");
                return creaEdificacion();
        }
    }
}
