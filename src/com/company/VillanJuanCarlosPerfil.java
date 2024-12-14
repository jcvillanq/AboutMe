package com.company;
import java.util.ArrayList;
/**
 * TAREA 1  CLASE PERFIL
 * creamos el perfil con su respectivo constructor que usaremos mas adelante.
 *
 * */
public class VillanJuanCarlosPerfil {
    private String name;
    private String story;
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;


    //Aqui procedemos a crear nuestro contructor
    /**
     * Constructor para crear un perfil completo
     * @param name Nombre del perfil
     * @param story Historia personal
     * @param hobbies Lista de hobbies
     * @param foods Lista de comidas favoritas
     * @param funFacts Lista de datos curiosos
     */

    public VillanJuanCarlosPerfil(String name, String story,
                                  ArrayList<String> hobbies,
                                  ArrayList<String> foods,
                                  ArrayList<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }


    /**
     * TAREA 2
     * Ahora procederemos a crear getter/metodos algunos dando formato y otros
     * en clase VillanJuanCarlosMain declaramos los datos mecionados en la tarea 2.
     * */


    // Getter para acceder al attributo
    public String getName(){
        return name;
    }

    /**
     * Metodo para mostrar con formato nuestra historia personal
     * @return historia del perfil
     */
    public String getStory() {
        return " \uD83D\uDC68\uD83C\uDFFF\u200D\uD83D\uDCBB My Story \uD83D\uDC68\uD83C\uDFFF\u200D\uD83D\uDCBB \n" + story;
    }

/**
 * Usaremos para dar formato a los arraylist con StringBuilder una clase que nos brinda metodos muy practicos,
 * en este caso usaremos StringBuilder.append(elemento) para dar formato al elemento y luego iterarlo con
 * for para tener en cuenta
 * se puede consultar en el siguiente enlace sobre su uso:
 * *https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html**
 * */



    public String getFoods() {
        StringBuilder cadena = new StringBuilder(" \uD83C\uDF7D\uFE0F  My Favorite Foods:\n");
        for (String food : foods) {
            cadena.append("* ").append(food).append("\n");
        }
        return cadena.toString();
    }


    public String getHobbies() {
        StringBuilder cadena = new StringBuilder("\uD83C\uDFA8 My hobbies:\n");
        for (String hobbie : hobbies) {
            cadena.append("* ").append(hobbie).append("\n");
        }
        return cadena.toString();
    }


    public String getFunFacts (){
        StringBuilder cadena = new StringBuilder("\uD83C\uDFB2 Datos Curiosos:\n");
        for (String funfact: funFacts) {
            cadena.append("* \uD83D\uDC40  ").append(funfact).append("\n");
        }
        return cadena.toString();
    }

}
