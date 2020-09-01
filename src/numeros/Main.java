/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author jonathanfb
 */
public class Main {
    public static void main(String[] args) {
         Scanner ns = new Scanner(System.in);
        int dato = 0, cantidad;
        
        do {
            System.out.print("Digite el tamaño del arrglo: ");
            cantidad = ns.nextInt();
            int ingre[] = new int[cantidad];;
             
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Digite el número: ");
                int a = ns.nextInt();
                ingre[i] = a;
                
            }
            Ingresar pasarArreglo = new Ingresar();
            pasarArreglo.par_impar(ingre);
            pasarArreglo.menor(ingre);

           
                System.out.println("Desea ingresar nuevos números");
                System.out.println("1. Si");
                System.out.println("0. No");
                System.out.print("Escoga: ");
                dato = ns.nextInt();
            

        } while (dato == 1);
    }
}
