/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comddddddd.listassencillas;

/**
 *
 * @author abian
 */
public class Lista {
    Nodo inicio = null;
    
    public void insertar (int dato){
        
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        
        if (inicio != null){
            nuevo.siguiente = inicio;
        } 
            inicio = nuevo;
    }
    
    
    public void insertarFinal (int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        if(inicio == null){
            inicio = nuevo;
        }else{
            Nodo aux = inicio;
            while (aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }

    }
    
    public void insertar0rdenado (int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        if (inicio == null){
            inicio = nuevo;
        }else {
            Nodo ant = null;
            Nodo aux = inicio;
            while ((aux != null) && (aux.dato < nuevo.dato)) {
                ant = aux;
                aux = aux.siguiente;                
            }
            if (ant == null){
                nuevo.siguiente = inicio;
                inicio = nuevo;
            } else if(aux == null){
                ant.siguiente = nuevo;
                nuevo.siguiente = aux;
            }
        } 
    }
    
    
    public void recorrer(){
        Nodo aux = inicio;
        while (aux != null){
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
        System.out.println(" ");
    }
    
    
    public void eliminarInicio(){        
        if (inicio != null){
            Nodo aux = inicio;
            inicio=inicio.siguiente;
            aux.siguiente=null;                    
        }
    }
    
    
    public void eliminarFinal (){
        if (inicio != null){
            Nodo anterior = null;
            Nodo aux = inicio;
            while (aux.siguiente != null){
                anterior=aux;
                aux=aux.siguiente;
            }
            anterior.siguiente=null;
        }
    }
    
    
    
    public void verificar(int dato){
        
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        Nodo aux = inicio;

        while (aux.siguiente != null ){
            if (aux.dato == nuevo.dato){
                System.out.print(nuevo.dato);
                System.out.println(" Ya existe");
            } 
            aux = aux.siguiente;
            if (aux.dato == nuevo.dato){
                System.out.print(nuevo.dato);
                System.out.println(" Ya existe");

            }

        }
        
    }
    
    
    
     public void ingresarNoRepetido (int dato){
        
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        Nodo aux = inicio;
        while (aux.siguiente != null ){
            if (aux.dato == nuevo.dato){
                System.out.print(nuevo.dato);
                System.out.println(" Ya existe");
            dato = -8;
            } 
            aux = aux.siguiente;
            if (aux.dato == nuevo.dato){
                System.out.print(nuevo.dato);
                System.out.println(" Ya existe");
                dato = -8;
            }

            }
        if (dato != -8){

        System.out.print(nuevo.dato);
        }
        
            
    } 

    void eliminarFinal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


