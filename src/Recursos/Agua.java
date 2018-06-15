/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import Jugadores.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class Agua implements Recurso {

    Scanner entrada = new Scanner(System.in);
    int cantidad;
    int precioEnOro;
    int precioEnComida;
    int FasesRecoleccion; //por defecto
    int FasesGenerados;//mas caro

    public ArrayList<Agua> agua = new ArrayList();//Toda el agua se guarda en un array

    //constructor
    public Agua() {

    }

    public Agua(int cantidad) {
        this.cantidad = cantidad;
    }

    public Agua(int cantidad, int precioEnOro, int precioEnComida, int FasesRecoleccion, int FasesGenerados) {
        this.cantidad = cantidad;
        this.precioEnOro = precioEnOro;
        this.precioEnComida = precioEnComida;
        this.FasesRecoleccion = FasesRecoleccion;
        this.FasesGenerados = FasesGenerados;
    }

    public int getCantInicial() {
        return cantidad;
    }

    public void setCantInicial(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioEnOro() {
        return precioEnOro;
    }

    public void setPrecioEnOro(int precioEnOro) {
        this.precioEnOro = precioEnOro;
    }

    public int getPrecioEnComida() {
        return precioEnComida;
    }

    public void setPrecioEnComida(int precioEnComida) {
        this.precioEnComida = precioEnComida;
    }

    public int getFasesRecoleccion() {
        return FasesRecoleccion;
    }

    public void setFasesRecoleccion(int FasesRecoleccion) {
        this.FasesRecoleccion = FasesRecoleccion;
    }

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }

    @Override
    public void comprarRecurso(Recurso oro, Recurso comida) {

        System.out.println("Ya hay agua");
    }

    @Override
    public int crearRecurso(int comida, int oro) {
        System.out.println("ATENCION: \n" + ""
                + "El costo del recurso adquirido es el doble de la cantidad adquirida en el resto de recursos");
        
       System.out.println("Cuanta agua quiere?");
        int nueva = entrada.nextInt();
        if(comida > nueva && oro > nueva){
            return nueva;
    }else {
            System.out.println("No tiene los recursos necesarios para adquirir agua");
        }
        return 0;
    }

}
