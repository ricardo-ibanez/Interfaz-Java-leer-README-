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
public class Juan extends Estadisticas implements Annotation, InterfazTipo {

    String tipo = "";
    String fuerte = "";

    @Override
    public void estadisticas(JTextArea texto) {
        annotationType();
        interfaztipo();
        ataque = 100;
        defensa = 80;
        ataqueespecial = " Botellin Mahou";
        fortaleza = " La API";
        debilidad = " La Mahou";
        texto.setText("POKEMON: JUAN" + "\nEste Pokemon es de tipo:" + tipo + "\nAtaque=" + ataque + "\nDefensa=" + defensa + "\nSu Ataque Especial es:" + ataqueespecial + "\nSu Fortaleza es:" + fortaleza + "\nSu Debilidad es:" + debilidad + "\nEs Fuerte contra:" + fuerte);

    }

    @Override
    public void annotationType() {
        fuerte = " tipo Mahou y tipo tierra";
    }

    @Override
    public void interfaztipo() {

        tipo = "Roca y Lucha";
    }

}
