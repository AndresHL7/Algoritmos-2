package com.usc.ui;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


/**
 *
 * @author Romix
 */
public class PanelTablero extends JPanel implements ActionListener{
  
    Random aleatorio = new Random();
    JLabel etiquetaPrueba;
    final int X=1, O=0, VACIA = -1;
    int turno_actual = 1;
    boolean ganador = false;
    JButton bot1, bot2, bot3, bot4, bot5, bot6, bot7, bot8, bot9;
    int tablero[][];
    

    public PanelTablero(){
    
       tablero = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tablero[i][j] = VACIA;
                System.out.println(" fila: "+i+" culomna: "+j+" contenido"+tablero[i][j]);
            }
        }
        
        
        
        
        this.setLayout(new GridLayout(3,3));
        
        bot1 = new JButton();
        bot1.setActionCommand("casilla1");
        bot1.addActionListener(this);
        
        bot2 = new JButton();
        bot2.setActionCommand("casilla2");
        bot2.addActionListener(this);
        
        bot3 = new JButton();
        bot3.setActionCommand("casilla3");
        bot3.addActionListener(this);
        
        bot4 = new JButton();
        bot4.setActionCommand("casilla4");
        bot4.addActionListener(this);
       
        bot5 = new JButton();
        bot5.setActionCommand("casilla5");
        bot5.addActionListener(this);
        
        bot6 = new JButton();
        bot6.setActionCommand("casilla6");
        bot6.addActionListener(this);
        
        bot7 = new JButton();
        bot7.setActionCommand("casilla7");
        bot7.addActionListener(this);
        
        bot8 = new JButton();
        bot8.setActionCommand("casilla8");
        bot8.addActionListener(this);
        
        bot9 = new JButton();
        bot9.setActionCommand("casilla9");
        bot9.addActionListener(this);
        
        add(bot1);
        add(bot2);
        add(bot3);
        add(bot4);
        add(bot5);
        add(bot6);
        add(bot7);
        add(bot8);
        add(bot9);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cualBoton = e.getActionCommand();
             if(turno_actual == X && ganador==false) {
                 System.out.println("Inicia turno Jugador");
                switch(cualBoton){

                    case "casilla1":// JOptionPane.showMessageDialog(this, "Click en boton 1");
                    bot1.setText("x");
                    bot1.setEnabled(false);
                    tablero[0][0]=X;
                    break;

                    case "casilla2": //JOptionPane.showMessageDialog(this, "Click en boton 2");
                    bot2.setText("x");
                    bot2.setEnabled(false);
                    tablero[0][1]=X;
                    break;

                    case "casilla3": //JOptionPane.showMessageDialog(this, "Click en boton 3");
                    bot3.setText("x");
                    bot3.setEnabled(false);
                    tablero[0][2]=X;
                    break;

                    case "casilla4":// JOptionPane.showMessageDialog(this, "Click en boton 4");
                    bot4.setText("x");
                    bot4.setEnabled(false);
                    tablero[1][0]=X;
                    break;

                    case "casilla5":// JOptionPane.showMessageDialog(this, "Click en boton 5");
                    bot5.setText("x");
                    bot5.setEnabled(false);
                    tablero[1][1]=X;
                    break;

                    case "casilla6":// JOptionPane.showMessageDialog(this, "Click en boton 6");
                    bot6.setText("x");
                    bot6.setEnabled(false);
                    tablero[1][2]=X;
                    break;

                    case "casilla7":// JOptionPane.showMessageDialog(this, "Click en boton 7");
                    bot7.setText("x");
                    bot7.setEnabled(false);
                    tablero[2][0]=X;
                    break;

                    case "casilla8":// JOptionPane.showMessageDialog(this, "Click en boton 8");
                    bot8.setText("x");
                    bot8.setEnabled(false);
                    tablero[2][1]=X;
                    break;

                    case "casilla9":// JOptionPane.showMessageDialog(this, "Click en boton 9");
                    bot9.setText("x");
                    bot9.setEnabled(false);
                    tablero[2][2]=X;
                    break;
                }
                
                
            }
        validar();
            
    }
    
     
    private void jugada_maquina() {
        
        if (turno_actual == O && ganador == false) {
            
            int f = aleatorio.nextInt(3);
            int c = aleatorio.nextInt(3);
            for (int i = 1; i < 2; i++) {
                System.out.println("Inicia maquina");
                //tablero[f][c] = (int)(Math.random()*3);
                if (tablero[f][c] == VACIA) {
                        
                            if (f == 0 && c == 0) {//boton1
                                bot1.setText("O");
                                bot1.setEnabled(false);
                                tablero[f][c] = O;
                            }
                                
                            else if (f == 0 && c == 1) {//boton2
                                bot2.setText("O");
                                bot2.setEnabled(false);
                                tablero[f][c] = O;
                            }
                                    
                            else if (f == 0 && c == 2) {//boton3
                                bot3.setText("O");
                                bot3.setEnabled(false);
                                tablero[f][c] = O;
                            }
                                
                            else if (f == 1 && c == 0) {//boton 4
                                bot4.setText("O");
                                bot4.setEnabled(false);
                                tablero[f][c] = O;
                            }
                                
                            else if (f == 1 && c == 1) {//boton 5
                                bot5.setText("O");
                                bot5.setEnabled(false);
                                tablero[f][c] = O;
                            }
                               
                            else if (f == 1 && c == 2) {//boton 6
                                bot6.setText("O");
                                bot6.setEnabled(false);
                                tablero[f][c] = O;
                            }
                                
                            else if (f == 2 && c == 0) {//boton 7
                                bot7.setText("O");
                                bot7.setEnabled(false);
                                tablero[f][c] = O;
                            }
                                
                            else if (f == 2 && c == 1) {//boton 8
                                bot8.setText("O");
                                bot8.setEnabled(false);
                                tablero[f][c] = O;
                            }
                                
                            else if (f == 2 && c == 2) {//boton 9
                                bot9.setText("O");
                                bot9.setEnabled(false);
                                tablero[f][c] = O;
                               
                            }
                        for(int h = 0; h < 3; h++){
                            for(int r = 0; r < 3; r++){
                                System.out.println(" fila: "+h+" culomna: "+r+" contenido"+tablero[h][r]);
                            }
                        }   
                }else if (tablero[f][c] != VACIA) {
                        i--;
                        f = aleatorio.nextInt(3);
                        c = aleatorio.nextInt(3);
                        System.out.println(" fila: "+f+" culomna: "+c+" contenido"+tablero[f][c]);
                        
                        
                }  
            }
        /*   int f, c = aleatorio.nextInt(3);
                       
            for (f = aleatorio.nextInt(3); tablero[f][c] == VACIA; f = aleatorio.nextInt(3)) {
                for (c = aleatorio.nextInt(3); tablero[f][c] == VACIA; c = aleatorio.nextInt(3)) {*/
                    
                    
              /*  }     
            }*/
                  
        }
        validar();
    }

    /*Valida si hay un ganador*/
    private void validar() {
        
        for (int i = 0; i < 3; i++) {
            if (turno_actual==X) {//turno jugador
                if (tablero[i][0] == X && tablero[i][1] == X &&tablero[i][2] == X) {//valida filas
                    ganador=true;
                    System.out.println("Gana Jugador");
                    switch (i) {
                        case 0:
                            bot1.setBackground(Color.BLUE);
                            bot2.setBackground(Color.BLUE);
                            bot3.setBackground(Color.BLUE);
                            break;
                        case 1:
                            bot4.setBackground(Color.BLUE);
                            bot5.setBackground(Color.BLUE);
                            bot6.setBackground(Color.BLUE);
                            break;
                        case 2:
                            bot7.setBackground(Color.BLUE);
                            bot8.setBackground(Color.BLUE);
                            bot9.setBackground(Color.BLUE);
                            break;
                    }
                    
                    
                }else if(tablero[0][i] == X && tablero[1][i] == X &&tablero[2][i] == X){//valida columnas
                    ganador=true;
                    System.out.println("Gana Jugador");
                    switch (i) {
                        case 0:
                            bot1.setBackground(Color.BLUE);
                            bot4.setBackground(Color.BLUE);
                            bot7.setBackground(Color.BLUE);
                            break;
                        case 1:
                            bot2.setBackground(Color.BLUE);
                            bot5.setBackground(Color.BLUE);
                            bot8.setBackground(Color.BLUE);
                            break;
                        case 2:
                            bot3.setBackground(Color.BLUE);
                            bot6.setBackground(Color.BLUE);
                            bot9.setBackground(Color.BLUE);
                            break;
                    }
                    
                }else if ((tablero[0][0] == X && tablero[1][1] == X &&tablero[2][2] == X)) {//valida diagonal 1
                    ganador=true;
                    bot1.setBackground(Color.BLUE);
                    bot5.setBackground(Color.BLUE);
                    bot9.setBackground(Color.BLUE);
                    System.out.println("Gana Jugador");
                    
                }else if ((tablero[0][2] == X && tablero[1][1] == X &&tablero[2][0] == X)) {//valida diagonal 2
                    ganador=true;
                    bot3.setBackground(Color.BLUE);
                    bot5.setBackground(Color.BLUE);
                    bot7.setBackground(Color.BLUE); 
                    System.out.println("Gana Jugador");
                }
                
            }else if (turno_actual==O) { //turno maquina
                if (tablero[i][0] == O && tablero[i][1] == O &&tablero[i][2] == O) {//valida filas
                    ganador=true;
                    System.out.println("Gana Maquina");
                    switch (i) {
                        case 0:
                            bot1.setBackground(Color.BLUE);
                            bot2.setBackground(Color.BLUE);
                            bot3.setBackground(Color.BLUE);
                            break;
                        case 1:
                            bot4.setBackground(Color.BLUE);
                            bot5.setBackground(Color.BLUE);
                            bot6.setBackground(Color.BLUE);
                            break;
                        case 2:
                            bot7.setBackground(Color.BLUE);
                            bot8.setBackground(Color.BLUE);
                            bot9.setBackground(Color.BLUE);
                            break;
                    }
                    
                }else if(tablero[0][i] == O && tablero[1][i] == O &&tablero[2][i] == O){//valida columnas
                    ganador=true;
                    System.out.println("Gana Maquina");
                     switch (i) {
                        case 0:
                            bot1.setBackground(Color.BLUE);
                            bot4.setBackground(Color.BLUE);
                            bot7.setBackground(Color.BLUE);
                            break;
                        case 1:
                            bot2.setBackground(Color.BLUE);
                            bot5.setBackground(Color.BLUE);
                            bot8.setBackground(Color.BLUE);
                            break;
                        case 2:
                            bot3.setBackground(Color.BLUE);
                            bot6.setBackground(Color.BLUE);
                            bot9.setBackground(Color.BLUE);
                            break;
                    }
                    
                }else if ((tablero[0][0] == O && tablero[1][1] == O &&tablero[2][2] == O)) {//valida diagonal 1
                    ganador=true;
                    bot1.setBackground(Color.BLUE);
                    bot5.setBackground(Color.BLUE);
                    bot9.setBackground(Color.BLUE);
                    System.out.println("Gana Maquina");
                }else if ((tablero[0][2] == O && tablero[1][1] == O &&tablero[2][0] == O)) {//valida diagonal 2
                    ganador=true;
                    bot3.setBackground(Color.BLUE);
                    bot5.setBackground(Color.BLUE);
                    bot7.setBackground(Color.BLUE);
                    System.out.println("Gana Maquina");  
                }
            }       
        }
        
        if (ganador == false) {
            if (turno_actual == X) {
                turno_actual = O;
                jugada_maquina();
                System.out.println("sigue turno de maquina");
            }else if (turno_actual == O) {
                turno_actual = X;
                System.out.println("sigue turno de jugador");
            }
        }
         
    
        
        /*
        if(turno_actual == X){//VALIDA TURNO DE JUGADOR-FILAS
            if((boton1.getText().equals("X")&&boton2.getText().equals("X")&&boton3.getText().equals("X"))){
                ganador=true;
            }else if(boton4.getText().equals("X")&&boton5.getText().equals("X")&&boton6.getText().equals("X")){
                ganador=true;
            }else if(boton7.getText().equals("X")&&boton8.getText().equals("X")&&boton9.getText().equals("X")){
                ganador=true;
            }else if(boton1.getText().equals("X")&&boton4.getText().equals("X")&&boton7.getText().equals("X")){ //VALIDA COLUMNAS
                ganador=true;   
            }else if(boton2.getText().equals("X")&&boton5.getText().equals("X")&&boton8.getText().equals("X")){
                ganador=true;
            }else if(boton3.getText().equals("X")&&boton6.getText().equals("X")&&boton9.getText().equals("X")){
                ganador=true;
            }else  if(boton1.getText().equals("X")&&boton5.getText().equals("X")&&boton9.getText().equals("X")){ //VALIDA DIAGONALES
                ganador=true;   
            }else if(boton7.getText().equals("X")&&boton5.getText().equals("X")&&boton3.getText().equals("X")){
                ganador=true;
            }
            }else  if(turno_actual == O){ //VALIDA TURNO MAQUINA-FILAS
            if((boton1.getText().equals("O")&&boton2.getText().equals("O")&&boton3.getText().equals("O"))){
                ganador=true;
            }else if(boton4.getText().equals("O")&&boton5.getText().equals("O")&&boton6.getText().equals("O")){
                ganador=true;
            }else if(boton7.getText().equals("O")&&boton8.getText().equals("O")&&boton9.getText().equals("O")){
                ganador=true;
            }else if(boton1.getText().equals("O")&&boton4.getText().equals("O")&&boton7.getText().equals("O")){ //VALIDA COLUMNAS
                ganador=true;   
            }else if(boton2.getText().equals("O")&&boton5.getText().equals("O")&&boton8.getText().equals("O")){
                ganador=true;
            }else if(boton3.getText().equals("O")&&boton6.getText().equals("O")&&boton9.getText().equals("O")){
                ganador=true;
            }else  if(boton1.getText().equals("O")&&boton5.getText().equals("O")&&boton9.getText().equals("O")){ //VALIDA DIAGONALES
                ganador=true;   
            }else if(boton7.getText().equals("O")&&boton5.getText().equals("O")&&boton3.getText().equals("O")){
                ganador=true;
            }
        }*/
        
    
    }
}
