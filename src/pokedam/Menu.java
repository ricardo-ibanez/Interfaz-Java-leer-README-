/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedam;



import java.util.*;
import javax.swing.*;
/**
 *
 * @author rikid
 */
public class Menu {
 
    int opcion;

    public void menu(JTextArea texto, int opcion) { // le paso el Jlable(clase) con un texto (argumento)



    Isaias i = new Isaias();
    Luisa l = new Luisa();
    Juan j = new Juan();
    Carolina c = new Carolina();

    Scanner sc = new Scanner(System.in);

    
        
            texto.setText("¿De qué Profesor quieres información?\n1.Isaias\n2.Luisa\n3.Juan\n4.Carolina");
        

        switch (opcion) {
            case 1:  //ISAIAS
                i.estadisticas(texto);

                break;
            case 2: //LUISA
                l.estadisticas(texto);

                break;
            case 3://JUAN
                j.estadisticas(texto);

                break;
            case 4: //CAROLINA
                c.estadisticas(texto);

                break;
                
            case 5:
                texto.setText("¿De qué Profesor quieres información?\n1.Isaias\n2.Luisa\n3.Juan\n4.Carolina");
                break;

            default:
                System.err.println("INTRODUZCA UNA OPCIÓN VALIDA");

        }

    


    }

    }
