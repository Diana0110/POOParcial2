/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author Diana
 */
public interface Soldado {
    public Soldado seCrea();
    public void pelea();
    public void dispara();
    public void seMueve();
    public void asciende(); 
    public void muere();
}
