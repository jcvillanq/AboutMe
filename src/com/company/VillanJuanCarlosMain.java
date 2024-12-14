package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class VillanJuanCarlosMain {

    /**
     * IMPORTANTE intentare usar de forma adecuada la modularizacion usada esta UF2,
     * por lo cual buscare un equilibrio de cuando y usarla y cuando no.
     *
     * */
    //GLOBAl
    Scanner input = new Scanner(System.in);
    private VillanJuanCarlosPerfil perfil;


    public static void main(String[] args) {
        VillanJuanCarlosMain programa = new VillanJuanCarlosMain();
        programa.iniciarApp();

    }

    /**
     * PROGRAMACION MODULARIZADA UF2
     * Definimos nuestro flujo de trabajo como en los ejemplos en las sesiones de ejemplos de POO1 y POO2,
     * Creamos metodos para nuestro app iniciar>configurar>ejecutar que organizaran de manera metodica nuestro programa.
     * */

    public void iniciarApp(){
        configurarApp();
        Bienvenida();
        ejecutarApp();
    }

    private void configurarApp() {
        // creamos los arraylist de los elementos necesarios
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("🎮 Videojuegos");
        hobbies.add("📚 Lectura");
        hobbies.add("🚲 Ciclismo");

        ArrayList<String> foods = new ArrayList<>();
        foods.add("🍝 Pasta");
        foods.add("🍕 Pizza");
        foods.add("🚲 Sushi");

        ArrayList<String> funfacts = new ArrayList<>();
        funfacts.add("En mis tiempos libres me gusta leer sobre geologia");
        funfacts.add("He tenido hasta 6 perros y 3 gatos");
        funfacts.add("cuando era adolecente gane un campeonato amateur de ciclismo");
        perfil = crearPerfil(hobbies,foods,funfacts);
    }
    /**
     *
     * Crea el perfil con la información proporcionada
     * @param hobbies Lista de hobbies
     * @param foods Lista de comidas
     * @param funFacts Lista de datos curiosos
     * @return Objeto Perfil esto es muy importante asi podemos trabajar con el objeto perfil (a travez de crear perfil) y podemos modulizarlo
     */
    private VillanJuanCarlosPerfil crearPerfil(
            ArrayList<String> hobbies,
            ArrayList<String> foods,
            ArrayList<String> funFacts
    ) {
        return new VillanJuanCarlosPerfil(
                "Juan Carlos Villan",
                "Soy un estudiante de ASIR,que le gusta la tecnologia y todo lo relacionado a las nuevas tendencias",
                hobbies, foods, funFacts
        );
    }

    /**
     * Muestra el menú de opciones
     * @param nombre Nombre del perfil para personalizar el menú
     */
    private static void mostrarMenu(String nombre) {
        System.out.println("\n--- About Me [" + nombre + "] ---");
        System.out.println("[1] Story");
        System.out.println("[2] Favorites");
        System.out.println("[3] Fun Fact");
        System.out.println("[4] Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Muestra un mensaje de bienvenida al iniciar la aplicación
     */
    private void Bienvenida() {
        System.out.println("\uD83E\uDD16 Bienvenido a About Me \uD83E\uDD16 ");
        System.out.println("Explora el perfil de " + perfil.getName());
    }

    private void ejecutarApp(){


        while (true) {
            mostrarMenu(perfil.getName());
            // usaremos try - catch para capturar posibles errores


            try {
                int opcion = input.nextInt();

                switch(opcion) {
                    case 1:
                        System.out.println(perfil.getStory());
                        break;
                    case 2:
                        System.out.println(perfil.getHobbies());
                        System.out.println(perfil.getFoods());
                        break;
                    case 3:
                        System.out.println(perfil.getFunFacts());
                        break;
                    case 4:
                        System.out.println("Gracias por visitar mi perfil");
                        return;
                    default:
                        System.out.println("No valido. Intente nuevamente.");
                }

                // Pausa para que el usuario pueda leer antes de mostrar el menú de nuevo
                System.out.println("\nPresione Enter para continuar...");
                input.nextLine();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("No valido. Por favor, ingrese un número.");
                input.next(); // Limpiamos el buffer
            }
        }

    }
}
