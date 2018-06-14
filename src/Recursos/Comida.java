/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class Comida implements Recurso {

    int cantInicial;
    String nombre;
    //Recurso tipo;
    int precioEnOro;
    int precioEnAgua;
    int FasesRecoleccion; //por defecto
    int FasesGenerados;//mas caro

    public ArrayList<Comida> comida = new ArrayList();//Toda la comida se guarda en un array

    public int getCantInicial() {
        return cantInicial;
    }

    public void setCantInicial(int cantInicial) {
        this.cantInicial = cantInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioEnOro() {
        return precioEnOro;
    }

    public void setPrecioEnOro(int precioEnOro) {
        this.precioEnOro = precioEnOro;
    }

    public int getPrecioEnAgua() {
        return precioEnAgua;
    }

    public void setPrecioEnAgua(int precioEnAgua) {
        this.precioEnAgua = precioEnAgua;
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

    //constructor
    
    public Comida(){
        
    }
    
    public Comida(String nombre, int cantInicial, int precioEnOro, int precioEnAgua, int FasesRecoleccion, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnOro = precioEnOro;
        this.precioEnAgua = precioEnAgua;
        this.FasesRecoleccion = FasesRecoleccion;
        this.FasesGenerados = FasesGenerados;
    }

    @Override
    public void comprarRecurso(Recurso agua, Recurso oro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recurso crearRecurso() {
        this.setNombre("Comida");
        this.precioEnOro = 120;
        this.cantInicial = 300;
        this.precioEnAgua = 60;
        this.FasesRecoleccion = 2;//dos fases
        this.FasesGenerados = 2;//una fase

        Comida nuevaComida = new Comida(nombre, cantInicial, precioEnOro, precioEnAgua, FasesRecoleccion, FasesGenerados);
        this.comida.add(nuevaComida);
        System.out.println("COMIDA CREADA");
        return nuevaComida;
    }
}
