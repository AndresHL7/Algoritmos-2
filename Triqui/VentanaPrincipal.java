package com.usc.ui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {
    
    
    
    
    PanelLogo logoTriqui;
    PanelTablero tableroTriqui;
    PanelPuntaje puntajeTriqui;
    
    
 /*constructor para establecer las caracteristicas de la ventana */
 public VentanaPrincipal()
 { 
     this.setTitle("Mi primera aplicación UI");
     this.setBackground(java.awt.Color.yellow);
     this.setSize(800, 600);
     this.setResizable(false);
     
     
     //Establecer diagramación para la Ventana Principal:
     this.setLayout(new BorderLayout());
     
     //Instanciar y agregar panel del logo:
     logoTriqui= new PanelLogo();
     this.add(logoTriqui, BorderLayout.NORTH);
     
     //Instanciar y agregar panel del tablero:
     tableroTriqui= new PanelTablero();
     this.add(tableroTriqui, BorderLayout.CENTER);
     
     //Instanciar y agregar panel del logo:
     puntajeTriqui= new PanelPuntaje();
     this.add(puntajeTriqui, BorderLayout.EAST);
     
     
    
     
     
     
     }

    
    public static void main (String[] args) {
        
        
        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setVisible(true);
    
    
  }

   
}
