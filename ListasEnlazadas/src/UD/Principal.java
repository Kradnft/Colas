/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Principal {
    
    
    
    //Se define un JFrame global
    public static JFrame ventana;
    
    public static void main(String[] args) {
        
        CreadorInterfaz CI = new CreadorInterfaz();
        
        JPanel PaTitulo = CI.Titulo();
        JPanel PaUsuariosTA = CI.UsuarioColaTexto();
        JPanel PaBotones = CI.Botones();
        JPanel PaNombres = CI.Nombres();
        
        //JScrollPane scroll = new JScrollPane(CI.tfUsuarios);
        //scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        ventana = new JFrame("");
        
        ventana.add(PaTitulo);
        ventana.add(PaUsuariosTA);
        ventana.add(PaBotones);
        ventana.add(PaNombres);
        //ventana.add(scroll);
        
        //Se definen las propiedades de la ventana
        ventana.setSize(750, 450);
        ventana.setTitle("Colapp");
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        //Se muestra la ventana
        ventana.setVisible(true);
               
        /*
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

        }*/

    }

}
