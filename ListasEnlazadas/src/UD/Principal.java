/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Cola Cola = new Cola();
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        while (opc != 4) {
            System.out.println("1. Ingresar");
            System.out.println("2. Atender");
            System.out.println("3. Imprimir");
            System.out.println("4. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese nombre");
                    String nn;
                    Scanner leernombre = new Scanner(System.in);
                    nn = leernombre.nextLine();
                    System.out.println("Numero de recibos");
                    int recibos = leer.nextInt();
                    Cola.insert(recibos, nn);
                    break;
                case 2:
                    Cola.extraer(1);
                    break;
                case 3:
                    Cola.imprimir();
                    break;
                case 4:
                    System.out.println("Buen dia");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }

    }

}
