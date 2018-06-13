/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Razas.Gatos.GatoFactory;
import Razas.Loros.LoroFactory;
import Razas.Perros.PerroFactory;
import java.util.Scanner;

/**
 * FACTORIA ABSTRACTA
 * @author Diana
 */
public class RazaFactory {

    public Raza crearRaza(int a) {
        Scanner entrada = new Scanner(System.in);

        switch (a) {
            case 1:
                System.out.println("Raza Perro creada ");
              
                System.out.println("Ingrese el tipo de Perro: | 1. Perro de Combate | 2. Perro Explorador | 3. Perro Guardian |");

                PerroFactory perro = new PerroFactory();
                int p = entrada.nextInt();
                
                return perro.crearPerro(p);
            case 2:
                System.out.println("Raza Gato creada");
                
                System.out.println("Ingrese el tipo de Gato: | 1. Gato de Combate | 2. Gato Explorador | 3. Gato Guardian |");

                GatoFactory gato = new GatoFactory();
                p = entrada.nextInt();
                
                return gato.crearGato(p);
            case 3:
                System.out.println("Raza Loro creada");
                
                System.out.println("Ingrese el tipo de Loro: | 1. Loro de Combate | 2. Loro Explorador | 3. Loro Guardian |");

                LoroFactory loro = new LoroFactory();
                p = entrada.nextInt();
                
                return loro.crearLoro(p);
                
            default:                
                System.out.println("Error de creacion. Intente nuevamente");

                a = entrada.nextInt();
                return this.crearRaza(a);
        }
    }
}
