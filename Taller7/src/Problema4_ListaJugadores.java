/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador, Posición en el campo de juego, Edad, Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;
public class Problema4_ListaJugadores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, posicion, reporte = "Listado de jugadores\n";
        int edad, contador = 1, sumaEdades = 0;
        double estatura, sumaEstaturas = 0, promEdades = 0, promEstatura = 0;
        while (true) {
            System.out.print("DAME EL NOMBRE DEL JUGADOR " + contador + ": ");
            nombre = tcl.nextLine();
            System.out.print("DAME SU POSICION EN EL CAMPO: ");
            posicion = tcl.next();
            System.out.print("DAME SU EDAD Y ESTATURA: ");
            edad = tcl.nextInt();
            estatura = tcl.nextDouble();
            tcl.nextLine(); //Pasar a la siguiente linea
            reporte += contador + ". " + nombre + " -" + posicion + "-, " + "edad " + edad + ", " + "estatura " + estatura + "\n";
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            contador++;
            System.out.print("¿DESEA INGRESAR OTRO JUGADOR? (Si/No): ");
            String respuesta = tcl.next();
            tcl.nextLine();
            if (respuesta.equals("No") || respuesta.equals("no")) {             
                break;
            } 
        }
        promEdades = (contador - 1 > 0) ? sumaEdades / (contador - 1.0) : 0;
        promEstatura = (contador - 1 > 0) ? sumaEstaturas / (contador - 1.0) : 0;
        
        reporte += String.format("Promedio de edades: %.0f\n", promEdades);
        reporte += String.format("Promedio de estaturas: %.2f\n", promEstatura);
        
        System.out.println(reporte);
    }
}
/***
 * run:
 * DAME EL NOMBRE DEL JUGADOR 1: Alexander Dominguez
 * DAME SU POSICION EN EL CAMPO: Arquero
 * DAME SU EDAD Y ESTATURA: 32 1,95
 * ¿DESEA INGRESAR OTRO JUGADOR? (Si/No): Si
 * DAME EL NOMBRE DEL JUGADOR 2: Xavier Arreaga
 * DAME SU POSICION EN EL CAMPO: Defensa
 * DAME SU EDAD Y ESTATURA: 24 1,85
 * ¿DESEA INGRESAR OTRO JUGADOR? (Si/No): si
 * DAME EL NOMBRE DEL JUGADOR 3: Moises Caicedo
 * DAME SU POSICION EN EL CAMPO: Defensa
 * DAME SU EDAD Y ESTATURA: 19 1,88
 * ¿DESEA INGRESAR OTRO JUGADOR? (Si/No): Si
 * DAME EL NOMBRE DEL JUGADOR 4: Angel Mena
 * DAME SU POSICION EN EL CAMPO: Delantero
 * DAME SU EDAD Y ESTATURA: 32 1,75
 * ¿DESEA INGRESAR OTRO JUGADOR? (Si/No): Si
 * DAME EL NOMBRE DEL JUGADOR 5: Michael Estrada
 * DAME SU POSICION EN EL CAMPO: Delantero
 * DAME SU EDAD Y ESTATURA: 27 1,93
 * ¿DESEA INGRESAR OTRO JUGADOR? (Si/No): No
 * Listado de jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moises Caicedo -Defensa-, edad 19, estatura 1.88
 * 4. Angel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades: 27
 * Promedio de estaturas: 1,87
 * BUILD SUCCESSFUL (total time: 1 minute 47 seconds)
 */