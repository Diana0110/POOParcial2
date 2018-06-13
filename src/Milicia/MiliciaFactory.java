/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class MiliciaFactory {

    public Soldado creaSoldado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("|1. Escuadron | 2. Especialistas | 3.Soldado Primero |");
        int s = entrada.nextInt();
        switch (s) {
            case 1:
                Escuadron escuadron = new Escuadron();
                return escuadron.seCrea();
            case 2:
                Especialistas especialista = new Especialistas();
                return especialista.seCrea();
            case 3:
                SoldadoPrimero primero = new SoldadoPrimero();
                return primero.seCrea();
            default :
                System.out.println("Error de seleccion. Intente de nuevo");
                return creaSoldado();
        }
    }

}
