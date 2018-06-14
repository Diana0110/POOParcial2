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
public class SoldadoPrimero implements Soldado {

    int cantInicial;
    String nombre;
    int precioEnAgua;
    int precioEnComida;
    int FasesGenerados;//mas caro

    public ArrayList<SoldadoPrimero> SolPrimero = new ArrayList();//Toda el agua se guarda en un array

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

    public int getPrecioEnAgua() {
        return precioEnAgua;
    }

    public void setPrecioEnAgua(int precioEnAgua) {
        this.precioEnAgua = precioEnAgua;
    }

    public int getPrecioEnComida() {
        return precioEnComida;
    }

    public void setPrecioEnComida(int precioEnComida) {
        this.precioEnComida = precioEnComida;
    }

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }

    //constructores
    public SoldadoPrimero() {

    }

    public SoldadoPrimero(String nombre, int cantInicial, int precioEnAgua, int precioEnComida, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnAgua = precioEnAgua;
        this.precioEnAgua = precioEnComida;
        this.FasesGenerados = FasesGenerados;

    }

    @Override
    public Soldado seCrea() {
        this.setNombre("Soldado Primero");
        this.cantInicial = 1;
        this.precioEnAgua = 10;
        this.precioEnComida = 20;
        this.FasesGenerados = 3;

        SoldadoPrimero nuevoSolPrimero = new SoldadoPrimero(nombre,cantInicial,precioEnAgua,precioEnComida, FasesGenerados);
        this.SolPrimero.add(nuevoSolPrimero);
        System.out.println("SOLDADO CREADO\n");

        return nuevoSolPrimero;
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

}
