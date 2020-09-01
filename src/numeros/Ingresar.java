/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author jonathanfb
 */
public class Ingresar {
    int numeros[] ;
    public Ingresar() {
       
    }
    
    public void par_impar(int numeros[]) {
       
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 1) {
                System.out.println(numeros[i]+" El número es par");
            }else {
                System.out.println(numeros[i]+" El número es impar");
            }
        }
    }
    
    public void menor(int numeros[]) {
        int menor = 0;
        int cont = 0;
        for (int i = 1; i < numeros.length-1; i++) {
            for (int j = 0; j < i; j++) {
                if(numeros[i] > numeros[j]) {
                    menor = numeros[i];
                }
            }
                
            
        }
        System.out.println("El número menor del arreglo es: "+menor);
    }
}
