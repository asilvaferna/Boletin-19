/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;

/**
 *
 * @author Adri
 */
public class Mail {
    private String contenido;
    private boolean leido;

    public Mail() {
        setLeido(false);
    }

    public Mail(String contenido, boolean leido) {
        this.contenido = contenido;
        this.leido = leido;
        setLeido(false);
    }

    public String getContenido() {
        setLeido(true);
        return contenido;
    }
    
    public boolean isLeido() {
        return leido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
    
    
}
