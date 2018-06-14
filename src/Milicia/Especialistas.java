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
public class Especialistas implements Soldado {

    int cantInicial;
    String nombre;
    int precioEnOro;
    int precioEnAgua;
    int precioEnComida;
    int FasesGenerados;//mas caro

    public ArrayList<Especialistas> especialistas = new ArrayList();//Toda el agua se guarda en un array

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

    public int getPrecioEnAgua() {
        return precioEnAgua;
    }

    public void setPrecioEnAgua(int precioEnAgua) {
        this.precioEnAgua = precioEnAgua;
    }

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }
    
    

    //constructores
    public Especialistas() {

    }

    public Especialistas(String nombre, int cantInicial, int precioEnOro, int precioEnComida, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnOro = precioEnOro;
        this.precioEnAgua = precioEnComida;
        this.FasesGenerados = FasesGenerados;

    }

    @Override
    public Soldado seCrea() {
        this.setNombre("Especialista");
        this.cantInicial = 1;
        this.precioEnOro = 70;
        this.precioEnAgua = 30;
        this.FasesGenerados = 3;

        Especialistas nuevoEspecialista = new Especialistas(nombre, cantInicial,precioEnOro, precioEnComida, FasesGenerados);
        this.especialistas.add(nuevoEspecialista);
        System.out.println("ESPECIALISTA CREADO\n");

        return nuevoEspecialista;
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
