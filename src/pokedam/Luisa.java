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
public class Luisa extends Estadisticas implements Annotation, InterfazTipo {

    String tipo = "";
    String fuerte = "";

    @Override
    public void estadisticas(JTextArea texto) {
        annotationType();
        interfaztipo();
        ataque = 30;
        defensa = 48;
        ataqueespecial = " Separar a Pedro y a Koke";
        fortaleza = " Leer diapositivas";
        debilidad = " Los posits";
        texto.setText("POKEMON: LUISA" + "\nEste Pokemon es de tipo:" + tipo + "\nAtaque=" + ataque + "\nDefensa=" + defensa + "\nSu Ataque Especial es:" + ataqueespecial + "\nSu Fortaleza es:" + fortaleza + "\nSu Debilidad es:" + debilidad + "\nEs Fuerte contra:" + fuerte);
    }

    @Override
    public void annotationType() {
        fuerte = " tipo Koke y tipo Pedro";
    }

    @Override
    public void interfaztipo() {

        tipo = "Psiquico";
    }
}
