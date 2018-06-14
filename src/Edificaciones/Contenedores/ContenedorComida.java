/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones.Contenedores;

import Edificaciones.Edificacion;
import Recursos.Recurso;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class ContenedorComida implements Edificacion {

    int cantInicial;
    String nombre;
    int precioEnOro;
    int precioEnAgua;
    int FasesGenerados;//mas caro

    public ArrayList<ContenedorComida> contComida = new ArrayList();

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

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }

    //constructores
    public ContenedorComida() {

    }

    public ContenedorComida(String nombre, int cantInicial, int precioEnOro, int precioEnAgua, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnAgua = precioEnAgua;
        this.precioEnOro = precioEnOro;
        this.FasesGenerados = FasesGenerados;
    }

    @Override
    public Edificacion crearEdificacion() {
        this.setNombre("Contendor de Comida");
        this.precioEnAgua = 60;
        this.precioEnOro = 75;
        this.cantInicial = 0;

        ContenedorComida nuevoContComida = new ContenedorComida(nombre, cantInicial, precioEnAgua, precioEnOro, FasesGenerados);
        this.contComida.add(nuevoContComida);

        return nuevoContComida;
    }

    @Override
    public Recurso Almacena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seDestruye() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
