package com.usc.ui;

    import java.awt.*;
    import javax.swing.*;

    public class VentanaPrincipal extends JFrame{

        PanelLogo logoTriqui;
        PanelTablero TableroTriqui;
        PanelPuntaje PuntajeTriqui;

        public static void main(String[] args){

            VentanaPrincipal miVentana = new VentanaPrincipal();
            miVentana.setVisible(true);

        }

        /* metodo constructor*/
        public VentanaPrincipal(){
            this.setTitle("Mi primera aplicacion con UI");
            this.setBackground(Color.BLUE);
            this.setSize(800,600);
            this.setResizable(false);
            
            //Establecer diagramacion para la ventana principal:
            this.setLayout(new BorderLayout());

            //instanciar y agregar panel del logo:
            logoTriqui = new PanelLogo();
            this.add(logoTriqui, BorderLayout.NORTH);

            //instanciar y agregar panel del triqu
            TableroTriqui = new PanelTablero();
            this.add(TableroTriqui, BorderLayout.CENTER);

            //instanciar y agregar panel del puntaje
            PuntajeTriqui = new PanelPuntaje();
            this.add(PuntajeTriqui, BorderLayout.EAST);
        }

    }
