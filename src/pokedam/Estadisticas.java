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
public abstract class Estadisticas {         //CLASE ABSTRACTA 

    int ataque=0;
    int defensa=0;
    String ataqueespecial = "";
    String fortaleza = "";
    String debilidad = "";

public abstract void estadisticas(JTextArea texto);
    

}
