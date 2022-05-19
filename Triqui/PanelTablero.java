package com.usc.ui;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelTablero extends JPanel {

    JLabel etiquetaPrueba;
    
    JTextField casilla0, casilla1, casilla2, casilla3, casilla4, casilla5, casilla6, casilla7, casilla8, casilla9;

    public PanelTablero() {

        etiquetaPrueba = new JLabel("Aqui va el tablero");
        this.add(etiquetaPrueba);
        this.setLayout(new GridLayout (3,3));
        
       

    }
}
