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
public class Arbol <T>{
    
    private Nodo <T> raiz;

    public Nodo <T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo <T> raiz) {
        this.raiz = raiz;
    }
   
 public void recorrePreorden(Nodo<T> nodo){
     System.out.println(nodo.getDato());
     recorrePreorden(nodo.getIzquierda());
     recorrePreorden(nodo.getDerecha());
     
 }   
  public void recorreInorden(Nodo<T> nodo){
      if (nodo!=null){
     recorrePreorden(nodo.getIzquierda());
     System.out.println(nodo.getDato());
     recorrePreorden(nodo.getDerecha());
      }
 }   
 
   public void recorrePosorden(Nodo<T> nodo){
      if (nodo!=null){
     recorrePreorden(nodo.getIzquierda());
     recorrePreorden(nodo.getDerecha());
      System.out.println(nodo.getDato());
      }
 } 
  
 
}