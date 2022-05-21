package com.usc.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelTablero extends JPanel implements ActionListener {

    JLabel etiquetaPrueba;
    final int X = 1, 0=0, VACIA = -1;
    int turno_actual;
    boolean ganador;
    
    
    JTextField casilla1, casilla2, casilla3, casilla4, casilla5,casilla6, casilla7, casilla8, casilla9;
    
    int tablero [][];
    
    JButton But_00, But_01, But_02, But_03, But_04, But_05, But_06, But_07, But_08;
   
    public PanelTablero() {
        
        tablero= new int [3][3];
        for(int i=0; i<3; i++){
        
         for(int j=0; i<3; j++){
         
         }
        
        
        }
        
        this.setLayout(new GridLayout (3,3));
        
        But_00 = new JButton();
        But_00.setActionCommand("casilla1");
        But_00.addActionListener(this);
        But_01 = new JButton();
        But_01.setActionCommand("casilla2");
        But_01.addActionListener(this);
        But_02 = new JButton();
        But_02.setActionCommand("casilla3");
        But_02.addActionListener(this);
        But_03 = new JButton();
        But_03.setActionCommand("casilla4");
        But_03.addActionListener(this);
        But_04 = new JButton();
        But_04.setActionCommand("casilla5");
        But_04.addActionListener(this);
        But_05 = new JButton();
        But_05.setActionCommand("casilla6");
        But_05.addActionListener(this);
        But_06 = new JButton();
        But_06.setActionCommand("casilla7");
        But_06.addActionListener(this);
        But_07 = new JButton();
        But_07.setActionCommand("casilla8");
        But_07.addActionListener(this);
        But_08 = new JButton();
        But_08.setActionCommand("casilla9");
        But_08.addActionListener(this);
        
        add(But_00);
        add(But_01);
        add(But_02);
        add(But_03);
        add(But_04);
        add(But_05);
        add(But_06);
        add(But_07);
        add(But_08);
        
        
   
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String cualBoton = ae.getActionCommand();
        
        switch(cualBoton){
            
            case "casilla1": JOptionPane.showMessageDialog(this, "presiono boton 1");
                 But_00.setText("X");
                 But_00.setEnabled(false);
                 tablero [0][0]=1;
                 validar();
                 jugada_maquina();
                 
            break;
            case "casilla2": JOptionPane.showMessageDialog(this, "presiono boton 2");
            break;
            case "casilla3": JOptionPane.showMessageDialog(this, "presiono boton 3");
            break;
            case "casilla4": JOptionPane.showMessageDialog(this, "presiono boton 4");
            break;
            case "casilla5": JOptionPane.showMessageDialog(this, "presiono boton 5");
            break;
            case "casilla6": JOptionPane.showMessageDialog(this, "presiono boton 6");
            break;
            case "casilla7": JOptionPane.showMessageDialog(this, "presiono boton 7");
            break;
            case "casilla8": JOptionPane.showMessageDialog(this, "presiono boton 8");
            break;
            case "casilla9": JOptionPane.showMessageDialog(this, "presiono boton 9");
            break;
        }
        
    }
}


private void jugada_maquina(){



}
private void validar(){

}
