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
                PerroDeCombate combate = new PerroDeCombate();
                System.out.println("Perro de combate creado\n");
                return combate.seCrea();
            case 2:
                PerroExplorador explorar = new PerroExplorador();
                System.out.println("Perro Explorador creado\n");
                return explorar.seCrea();
            case 3:
                PerroGuardian guardian = new PerroGuardian();
                System.out.println("Perro Guardian creado\n");
                return guardian.seCrea();
            default:
                System.out.println("Error de creacion. Intente nuevamente");

                Scanner entrada = new Scanner(System.in);
                p = entrada.nextInt();
                return this.crearPerro(p);
        } 
    }
}