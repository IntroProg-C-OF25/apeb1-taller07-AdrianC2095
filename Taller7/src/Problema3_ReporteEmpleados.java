/***
 * Realizar un programa Java que permita pedir por teclado 
 * el nombre de 5 empleados. Por cada empleado se debe solicitar 
 * el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. 
 * Presentar un reporte como el siguiente:
 * Nombre1	10	$2.5	$25
 * Nombre2	11	$2	$22
 * Nombre3	9	$3	$27
 * Nombre4	5	$4	$20
 * Nombre5	12	$2	$24
 */
import java.util.Scanner;
public class Problema3_ReporteEmpleados {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int numDiasTrabjo, contador =1;
        double costoDia, valorPagar;
        while (contador <= 5) {
            System.out.println("INGRESE NOMBRE Y DIAS TRABAJADOS DEL TRABAJOR" + contador + ": ");
            nombre = tcl.next();
            numDiasTrabjo = tcl.nextInt();
        }
    }
}
