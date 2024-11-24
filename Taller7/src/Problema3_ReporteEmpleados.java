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
        String nombre, reporte = "Reporte\n";
        int numDiasTrabjo, contador =1;
        double costoDia, valorPagar;
        while (contador <= 5) {
            System.out.print("INGRESE NOMBRE, DIAS TRABAJADOS DEL TRABAJOR Y COSTO DEL DIA DE TRBAJO" + contador + ": ");
            nombre = tcl.next();
            numDiasTrabjo = tcl.nextInt();
            costoDia = tcl.nextDouble();
            valorPagar = numDiasTrabjo * costoDia;
            reporte += nombre + "\t" + numDiasTrabjo + "\t$" + String.format("%.1f", costoDia) + "\t$" + String.format("%.0f", valorPagar) + "\n";
            contador++;
        }
        System.out.println(reporte);
    }
}
/***
 * run:
 * INGRESE NOMBRE, DIAS TRABAJADOS DEL TRABAJOR Y COSTO DEL DIA DE TRBAJO1: Juan 10 2,5
 * INGRESE NOMBRE, DIAS TRABAJADOS DEL TRABAJOR Y COSTO DEL DIA DE TRBAJO2: Andres 11 2
 * INGRESE NOMBRE, DIAS TRABAJADOS DEL TRABAJOR Y COSTO DEL DIA DE TRBAJO3: Marta 9 3
 * INGRESE NOMBRE, DIAS TRABAJADOS DEL TRABAJOR Y COSTO DEL DIA DE TRBAJO4: Sofia 5 4
 * INGRESE NOMBRE, DIAS TRABAJADOS DEL TRABAJOR Y COSTO DEL DIA DE TRBAJO5: Luis 12 2
 * Reporte
 * Juan     10      $2,5	$25
 * Andres   11      $2,0	$22
 * Marta    9       $3,0	$27
 * Sofia    5       $4,0	$20
 * Luis     12      $2,0	$24

BUILD SUCCESSFUL (total time: 25 seconds)
 */