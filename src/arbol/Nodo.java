/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arbol;

/**
 *
 * @author Coqiz
 */
public class Nodo <T>{

   
    private T dato;
    private Nodo <T> izquierda;
    private Nodo <T> derecha;

    public Nodo(T dato){
        this.dato=dato;
    }
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the izquierda
     */
    public Nodo <T> getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(Nodo <T> izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecha
     */
    public Nodo <T> getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(Nodo <T> derecha) {
        this.derecha = derecha;
    }
    

   
}