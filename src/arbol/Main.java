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
public class Main {
    
 public static void main (String args[]){
        Arbol <String> arbol=new Arbol<>();
        Nodo <String> raiz=new Nodo("*");
        raiz.setIzquierda(new Nodo("2"));
        raiz.setDerecha(new Nodo ("3"));
        arbol.setRaiz(raiz);
        
        arbol.recorreInorden(arbol.getRaiz());
        System.out.println("\n");
        arbol.recorrePreorden(arbol.getRaiz());
    }
    
}