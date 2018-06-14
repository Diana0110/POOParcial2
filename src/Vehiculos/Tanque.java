/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;
/**
 *
 * @author Diana
 */
public class Tanque implements Vehiculo {

    int cantInicial;
    String nombre;
    int precioEnOro;
    int precioEnComida;
    int FasesGenerados;
    public ArrayList<Tanque> tanque = new ArrayList();

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

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }

    //constructores
    public Tanque() {

    }

    public Tanque(String nombre, int cantInicial, int precioEnOro, int precioEnComida, int FrasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnOro = precioEnOro;
        this.precioEnComida = precioEnComida;
        this.FasesGenerados = FrasesGenerados;

    }

    @Override
    public void ataca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seMueve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transporta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo creaVehiculo() {
        this.setNombre("Tanque");
        this.cantInicial = 1;
        this.precioEnOro = 70;
        this.precioEnComida = 30;
        this.FasesGenerados = 3;

        Tanque nuevoTanque = new Tanque(nombre, cantInicial, precioEnOro, precioEnComida, FasesGenerados);
        this.tanque.add(nuevoTanque);
        System.out.println("TANQUE CREADO\n");

        return nuevoTanque;
    }
}
