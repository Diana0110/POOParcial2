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
public class Oro implements Recurso {

    int cantInicial;
    String nombre;
    //Recurso tipo;
    int precioEnComida;
    int precioEnAgua;
    int FasesRecoleccion; //por defecto
    int FasesGenerados;//mas caro

    public ArrayList<Oro> oro = new ArrayList();//Toda la comida se guarda en un array

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

    public int getPrecioEnComida() {
        return precioEnComida;
    }

    public void setPrecioEnComida(int precioEnComida) {
        this.precioEnComida = precioEnComida;
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
    
    //constructores
    public Oro(){
        
    }
    
    public Oro(String nombre, int cantInicial, int precioEnComida, int precioEnAgua, int FasesRecoleccion, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnComida = precioEnComida;
        this.precioEnAgua = precioEnAgua;
        this.FasesRecoleccion = FasesRecoleccion;
        this.FasesGenerados = FasesGenerados;
    }
    
    //metodos
    @Override
    public void comprarRecurso(Recurso agua, Recurso comida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recurso crearRecurso() {
        this.setNombre("Oro");
        this.precioEnComida = 150;
        this.cantInicial = 300;
        this.precioEnAgua = 75;
        this.FasesRecoleccion = 2;//dos fases
        this.FasesGenerados = 2;//una fase

        Oro nuevoOro = new Oro(nombre, cantInicial, precioEnComida, precioEnAgua, FasesRecoleccion, FasesGenerados);
        this.oro.add(nuevoOro);
        System.out.println("ORO CREADO");
        return nuevoOro;
    }
}

