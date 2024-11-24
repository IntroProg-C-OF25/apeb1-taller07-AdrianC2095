/***
 * Generar un programa Java que permita ingresar 4 estudiantes; 
 * por cada uno de ellos ingresar el nombre del estudiante, 
 * el promedio de ciclo. Presentar el siguiente reporte
 * Estudiante 1 	10 	Aprobado
 * Estudiante 2 	6.9 	Reprobado
 * Estudiante 3 	7 	Aprobado
 * Estudiante 4 	5 	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar
 * en cada registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Problema5_Promedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("INGRESE NOMBRES Y EL PROMEDIO DEL EST_" + contador + ": ");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 6.5) {
                estado = "REPROBADO";               
            }else 
                estado = "APRODADO";
            System.out.printf("|   %s\t |  %s | %s\t |\n", "NOMBRE", "PROMEDIO", "ESTADO");
            System.out.printf("|   %s\t |   %.2f   | %s\t |\n", nombre, promedio, estado);
            contador++;
        }
    }
}
/***
 * run:
 * INGRESE NOMBRES Y EL PROMEDIO DEL EST_1: Adrian 10
 * |   NOMBRE	 |  PROMEDIO | ESTADO	 |
 * |   Adrian	 |   10,00   | APRODADO	 |
 * INGRESE NOMBRES Y EL PROMEDIO DEL EST_2: Juan 6,9
 * |   NOMBRE	 |  PROMEDIO | ESTADO	 |
 * |   Juan	 |    6,90   | APRODADO	 |
 * INGRESE NOMBRES Y EL PROMEDIO DEL EST_3: Marco 7
 * |   NOMBRE	 |  PROMEDIO | ESTADO	 |
 * |   Marco	 |    7,00   | APRODADO	 |
 * INGRESE NOMBRES Y EL PROMEDIO DEL EST_4: Andres 5
 * |   NOMBRE	 |  PROMEDIO | ESTADO	 |
 * |   Andres	 |    5,00   | REPROBADO |
 * BUILD SUCCESSFUL (total time: 19 seconds)
 */