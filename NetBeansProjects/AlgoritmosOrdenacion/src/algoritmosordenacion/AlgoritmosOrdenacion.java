/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion;

/**
 *
 * @author xp
 */
public class AlgoritmosOrdenacion {
    //pruebas escalera de palabras
        	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] tabla = {57,22,11,13,21,7};
    
       AlgoritmosOrdenacion ejercicios = new AlgoritmosOrdenacion();
       System.out.println(Arrays.toString(ejercicios.algoritmoBurbuja(tabla)));
    }
    
    public void algoritmoBurbuja(int[] tabla){
        int acumulador;
        for (int j=1; j<tabla.length; j++){
            for(int i=0; i < tabla.length -j; i++ ){
                if ( tabla[i] > tabla[i+1] ) {
                acumulador = tabla[i];
                tabla[i] = tabla[i+1];
                tabla[i+1] = acumulador;
                }
            }
        }
    }
}
