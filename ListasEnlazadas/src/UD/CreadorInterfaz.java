/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD;

import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mateo
 */
public class CreadorInterfaz implements ActionListener{
    
    JLabel lbTitulo, lbAsesora, lbEntrada;
    JTextArea tfUsuarios;
    JButton btIngresar, btAtender;
    JFrame frDialogo;
    JLabel[] lbClientesArray;
    String[] stUsuarios;
    
    
    int contadorPosiciones = 5;
    int contadorPosiciones2 = 5;
    
    Cola cola = new Cola();
    String[] nombres = {"Matias Roca", "Julen Miguel", "Iluminada Gracia", "Felisa Montesinos", "Óscar Collado", "Ian Solana", "Serafin Mari", "Encarnacion del Moral", "Sebastiana Lin"};
    
    public JPanel Titulo() {

        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(0, 0, 750, 50);

        Border bordejpanel = new TitledBorder(new EtchedBorder());
        Panel.setBorder(bordejpanel);
        Panel.setBackground(new java.awt.Color(204, 166, 166));
        
        lbTitulo = new JLabel();
        lbTitulo.setText("Gestión de Colas en un Banco");
        lbTitulo.setBounds(170, 0, 700, 40);
        lbTitulo.setVisible(true);
        lbTitulo.setFont(new java.awt.Font("Cambria", 0, 29));
        Panel.add(lbTitulo);

        return Panel;
    }
    
    public JPanel UsuarioColaTexto() {
        
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(20, 60, 400, 300);
        
        lbEntrada = new JLabel();
        lbEntrada.setText("Entrada al banco");
        lbEntrada.setBounds(120, 0, 150, 40);
        lbEntrada.setVisible(true);
        lbEntrada.setIcon(new ImageIcon("./imagenes/bank.png"));
        Panel.add(lbEntrada);
        
        tfUsuarios = new JTextArea(700,1);
        tfUsuarios.setEditable(false);
        
        JScrollPane scroll = new JScrollPane(tfUsuarios);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        Panel.add(scroll);
        
        //tfUsuarios.setText("Gestión de Colas en un Banco");
        tfUsuarios.setBounds(0, 40, 400, 200);
        tfUsuarios.setVisible(true);
        tfUsuarios.setFont(new java.awt.Font("Cambria", 2, 12));
        Panel.add(tfUsuarios);
        
        lbAsesora = new JLabel();
        lbAsesora.setText("Asesora");
        lbAsesora.setBounds(140, 250, 150, 40);
        lbAsesora.setVisible(true);
        lbAsesora.setIcon(new ImageIcon("./imagenes/BankCashier.png"));
        Panel.add(lbAsesora);
        
        
        return Panel;
    }
    
    public JPanel Botones() {

        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(450, 50, 300, 310);
        
        btAtender = new JButton("Atender");
        btAtender.setBounds(40, 40, 200, 75);
        btAtender.setVisible(true);
        btAtender.addActionListener(this);
        Panel.add(btAtender);
        Panel.setBackground(new java.awt.Color(198, 198, 198));
        
        btIngresar = new JButton("Ingresar");
        btIngresar.setBounds(40, 165, 200, 75);
        btIngresar.setVisible(true);
        btIngresar.addActionListener(this);
        Panel.add(btIngresar);

        return Panel;
    }
    
    public JPanel Nombres() {

        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(0, 360, 750, 60);
        Border bordejpanel = new TitledBorder(new EtchedBorder());
        Panel.setBorder(bordejpanel);
        lbAsesora = new JLabel();
        lbAsesora.setText("Brayan A. Paredes, Kevin A. Borda, Mateo Yate G. - UDistrital - 2020-1");
        lbAsesora.setFont(new java.awt.Font("Cambria", 0, 20));
        lbAsesora.setForeground(Color.white);
        lbAsesora.setBounds(15, 5, 700, 40);
        lbAsesora.setVisible(true);
        lbAsesora.setHorizontalAlignment(SwingConstants.CENTER);
        //lbAsesora.setIcon(new ImageIcon("./imagenes/BankCashier.png"));
        Panel.add(lbAsesora);
        Panel.setBackground(new java.awt.Color(186, 107, 108));

        return Panel;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btIngresar) {
            System.out.println("Boton ingresar");
            cola.insert((int) (Math.floor(Math.random() * (20 - 1 + 1) + 1)), nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))]);
            tfUsuarios.setText(cola.imprimir());        
            
            
            
            //lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if (e.getSource() == btAtender) {
            if (cola.isEmpty()) {
                System.out.println("Estoy en el if");
                Component frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Su cola está vacia, no hay clientes por atender...");
            } else {
                cola.extraer(1);
                tfUsuarios.setText(cola.imprimir());
                

                
            }

        }

        
    }
    
}
