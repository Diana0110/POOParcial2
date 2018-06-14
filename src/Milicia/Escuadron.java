/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class Escuadron implements Soldado {

    int cantInicial;
    String nombre;
    int precioEnOro;
    int precioEnComida;
    int FasesRecoleccion; //por defecto
    int FasesGenerados;//mas caro

    public ArrayList<Escuadron> escuadron = new ArrayList();//Toda el agua se guarda en un array
    
        //constructores
    public Escuadron(){
        
    }
    
    public Escuadron(String nombre, int cantInicial, int precioEnOro, int precioEnComida, int FasesRecoleccion, int FasesGenerados){
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnOro = precioEnOro;
        this.precioEnComida = precioEnComida;
        this.FasesRecoleccion = FasesRecoleccion;
        this.FasesGenerados = FasesGenerados;
    }

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
    public void pelea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dispara() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seMueve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asciende() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void muere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Soldado seCrea() {
    this.setNombre("Escuadron");
    this.cantInicial = 3;
    this.precioEnOro = 50;
    this.precioEnComida = 30;
    this.FasesRecoleccion = 3;
    this.FasesGenerados = 2;
    
    Escuadron nuevoEscuadron = new Escuadron();
    this.escuadron.add(nuevoEscuadron);
    System.out.println("ESCUADRON CREADO\n");
    
    return nuevoEscuadron;
    }
}
