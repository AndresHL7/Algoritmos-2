package com.usc.ui;

import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {
    
    
    
    
    PanelLogo logoTriqui;
    PanelTablero tableroTriqui;
    PanelPuntaje puntajeTriqui;
    
    
    
    
    public static void main (String[] args) {
        
        
        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setVisible(true);
    
    
  }
    
 /*constructor para establecer las caracteristicas de la ventana */
 public VentanaPrincipal()
 { 
     this.setTitle("Mi primera aplicación UI");
     this.setBackground(java.awt.Color.yellow);
     this.setSize(800, 600);
     this.setResizable(false);
     
     
     
     //Instanciar y agregar panel del logo:
     logoTriqui= new PanelLogo();
     this.add(logoTriqui);
     
     //Instanciar y agregar panel del tablero:
     tableroTriqui= new PanelTablero();
     this.add(tableroTriqui);
     
     //Instanciar y agregar panel del logo:
     puntajeTriqui= new PanelTablero();
     this.add(puntajeTriqui);
     
     
     
     
     
 
 
 
 }

   
}
