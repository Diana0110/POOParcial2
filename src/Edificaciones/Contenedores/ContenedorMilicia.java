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
public class ContenedorMilicia implements Edificacion {
    int cantInicial;
    String nombre;
    int precioEnAgua;
    int precioEnOro;
    int FasesGenerados;//mas caro

    public ArrayList<ContenedorMilicia> contMilicia = new ArrayList();

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

    public int getPrecioEnOro() {
        return precioEnOro;
    }

    public void setPrecioEnOro(int precioEnOro) {
        this.precioEnOro = precioEnOro;
    }

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }

    //constructores
    public ContenedorMilicia() {

    }

    public ContenedorMilicia(String nombre, int cantInicial, int precioEnAgua, int precioEnOro, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnOro = precioEnOro;
        this.precioEnAgua = precioEnAgua;
        this.FasesGenerados = FasesGenerados;
    }

    @Override
    public Edificacion crearEdificacion() {
        this.setNombre("Contendor de Milicia");
        this.precioEnOro = 70;
        this.precioEnAgua = 25;
        this.cantInicial = 0;
        this.FasesGenerados = 3;

        ContenedorMilicia nuevoContMilicia = new ContenedorMilicia(nombre, cantInicial, precioEnAgua, precioEnAgua, FasesGenerados);
        this.contMilicia.add(nuevoContMilicia);

        return nuevoContMilicia;
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
