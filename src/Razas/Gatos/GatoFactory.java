/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Gatos;

import Razas.Raza;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class GatoFactory {
    
    int cantGatosDeCombate;
    int cantGatosExploradores;
    int cantGatosGuardianes;

    public Raza crearGato(int g) {
        switch (g) {
            case 1:
                System.out.println("Gato de combate creado\n");
                return new GatoDeCombate();
            case 2:
                System.out.println("Gato Explorador creado\n");
                cantGatosExploradores++;
                return new GatoExplorador();
            case 3:
                System.out.println("Grato Guardian creado\n");
                return new GatoGuardian();
            default:
                System.out.println("Error de creacion. Intente nuevamente");

                Scanner entrada = new Scanner(System.in);
                g = entrada.nextInt();
                return this.crearGato(g);
        }
    }
}