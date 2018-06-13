/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Loros;

import Razas.Raza;
import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class LoroFactory {

    public Raza crearLoro(int l) {

        switch (l) {
            case 1:
                System.out.println("Loro de combate creado\n");
                return new LoroDeCombate();
            case 2:
                System.out.println("Loro Explorador creado\n");
                return new LoroExplorador();
            case 3:
                System.out.println("loro Guardian creado\n");
                return new LoroGuardian();

            default:
                System.out.println("Error de creacion. Intente nuevamente");

                Scanner entrada = new Scanner(System.in);
                l = entrada.nextInt();
                return this.crearLoro(l);
        }
    }
}
