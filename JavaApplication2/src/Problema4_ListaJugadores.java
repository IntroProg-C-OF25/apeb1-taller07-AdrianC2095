/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
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
        String nombre, posicion;
        int edad, contador =1;
        double peso, estatura, promEdades, pormEstatura;
        while (contador <= 5)
            System.out.print("INGRESE NOM. JUGADOR, POSICION EN EL CAMPO, EDAD Y ESTATURA" + contador + ": ");
            nombre = tcl.next();
            posicion = tcl.next();
            edad = tcl.nextInt();
            estatura = tcl.nextDouble();
            System.out.println(nombre + posicion + edad + estatura);
            contador++;
            promEdades = (edad * contador);
        }
    }
