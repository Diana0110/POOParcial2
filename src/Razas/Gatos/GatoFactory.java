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
                GatoDeCombate combate = new GatoDeCombate();
                System.out.println("Gato de combate creado\n");
                return combate.seCrea();
            case 2:
                GatoExplorador explorador = new GatoExplorador();
                System.out.println("Gato Explorador creado\n");
                return explorador.seCrea();
            case 3:
                GatoGuardian guardian = new GatoGuardian();
                System.out.println("Grato Guardian creado\n");
                return guardian.seCrea();
            default:
                System.out.println("Error de creacion. Intente nuevamente");

                Scanner entrada = new Scanner(System.in);
                g = entrada.nextInt();
                return this.crearGato(g);
        }
    }
}
