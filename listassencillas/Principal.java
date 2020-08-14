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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Lista listita = new Lista();

        listita.insertar(0);
        listita.insertar(15);
        listita.insertar(11);
        listita.insertar(21);
        listita.recorrer();
        
        listita.ingresarNoRepetido(2);
        

    }
    
}
