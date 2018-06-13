/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Perros;

import Razas.Raza;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class PerroFactory {

    public Raza crearPerro(int p) {
        switch (p) {
            case 1:
                System.out.println("Perro de combate creado\n");
                return new PerroDeCombate();
            case 2:
                System.out.println("Perro Explorador creado\n");
                return new PerroExplorador();
            case 3:
                System.out.println("Perro Guardian creado\n");
                return new PerroGuardian();

            default:
                System.out.println("Error de creacion. Intente nuevamente");

                Scanner entrada = new Scanner(System.in);
                p = entrada.nextInt();
                return this.crearPerro(p);
        } 
    }
}