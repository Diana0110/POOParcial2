/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import Jugadores.Usuario;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
//esto sera para la compra de recursos predetermida 
public class RecursosFactory {

    Scanner entrada = new Scanner(System.in);

    public Recurso creaRecursos() {
        System.out.println("Ingrese el recurso que desea:\n"
                + "1. Agua | 2. Comida |  3.Oro");
        int r = entrada.nextInt();
        switch (r) {
            case 1:
                Agua agua = new Agua();
                return agua.crearRecurso();
            case 2:
                Comida comida = new Comida();
                return comida.crearRecurso();
            case 3:
                Oro oro = new Oro();
                return oro.crearRecurso();
            default:
                System.out.println("No ha seleccionado ningun recurso. Intente de nuevo");
                return creaRecursos();
        }
    }
}
