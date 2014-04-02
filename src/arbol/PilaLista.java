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
public class PilaLista {
    
    Integer [] pila=new Integer [10];
    int tope=-1;
    
    void Push (Integer dato){
        if(tope <pila.length-1){
            pila[tope+1]=dato;
            tope++;
            
        }else{
            System.out.println("Pila Llenaa");
        }
    }
        
    Integer Pop(){
        Integer resultado=0;
        if(tope>-1){
            resultado=pila[tope];
        }else
            System.out.println("Pila Vacia");
            
   return resultado;
        }

        
    }
