/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedam;
import javax.swing.*;
/**
 *
 * @author rikid
 */
public class Isaias extends Estadisticas implements Annotation, InterfazTipo {
 String tipo="";
 String fuerte=""; 
    @Override
    public void estadisticas(JTextArea texto) {
        annotationType();
        interfaztipo();
        ataque = 80;
        defensa = 60;
        ataqueespecial = " El ataque Trabajos";
        fortaleza = " Aguantar a sus alumnos";
        debilidad = " El humor negro ";
         
       texto.setText("POKEMON: ISAIAS"+"\nEste Pokemon es de tipo:"+tipo+"\nAtaque="+ataque+"\nDefensa="+defensa+"\nSu Ataque Especial es:"+ataqueespecial+"\nSu Fortaleza es:"+fortaleza+"\nSu Debilidad es:"+debilidad+ "\nEs Fuerte contra:" + fuerte);
    }

    @Override
    public void annotationType() {
      fuerte=" tipo Fantasma y Tipo Planta";
    }
    @Override
    public void interfaztipo() {
         tipo = "Fuego y Legendario";

    }

  
 
 
}
