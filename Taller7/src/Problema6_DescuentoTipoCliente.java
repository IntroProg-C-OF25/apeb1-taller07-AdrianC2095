/***
 * Problema 6
 * Una empresa de comercialización de computadoras realiza el proceso
 * de venta haciendo un descuento por tipo de cliente: Si es cliente 
 * tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento
 * del 20% En caso que sea otro tipo de cliente, no hay descuento. 
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar 
 * los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */
import java.util.Scanner;
public class Problema6_DescuentoTipoCliente {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreCliente;
        double costoPc, descuento, costoFinal;
        int tipoCliente, contador = 1;
        while (contador <= 7){
            System.out.print("INGRESE NOMBRE DEL CLIENTE" + contador + ", EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: ");
            nombreCliente = tcl.next();
            costoPc = tcl.nextDouble();
            tipoCliente = tcl.nextInt();
            descuento = switch (tipoCliente) {
                case 1 -> 0.10;
                case 2 -> 0.20;
                default -> 0.00;
            };
            costoFinal = costoPc * (1 - descuento);
            System.out.printf("Nombre: %s, Cliente tipo: %d, Compra computadora con precio de : $%.2f\nSe aplica descuento de: %.2f\nTotal a pagar: $%.2f \n", nombreCliente, tipoCliente, costoPc, costoPc * descuento , costoFinal);
            contador++;
        }
    }
}
/***
 * run:
 * run:
 * INGRESE NOMBRE DEL CLIENTE1, EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: Alan 1000 1
 * Nombre: Alan, Cliente tipo: 1, Compra computadora con precio de : $1000,00
 * Se aplica descuento de: 100,00
 * Total a pagar: $900,00 
 * INGRESE NOMBRE DEL CLIENTE2, EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: Pedro 1000 2
 * Nombre: Pedro, Cliente tipo: 2, Compra computadora con precio de : $1000,00
 * Se aplica descuento de: 200,00
 * Total a pagar: $800,00 
 * INGRESE NOMBRE DEL CLIENTE3, EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: Rafael 1000 3
 * Nombre: Rafael, Cliente tipo: 3, Compra computadora con precio de : $1000,00
 * Se aplica descuento de: 0,00
 * Total a pagar: $1000,00 
 * INGRESE NOMBRE DEL CLIENTE4, EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: Jose 480 2
 * Nombre: Jose, Cliente tipo: 2, Compra computadora con precio de : $480,00
 * Se aplica descuento de: 96,00
 * Total a pagar: $384,00 
 * INGRESE NOMBRE DEL CLIENTE5, EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: Marco 985 1
 * Nombre: Marco, Cliente tipo: 1, Compra computadora con precio de : $985,00
 * Se aplica descuento de: 98,50
 * Total a pagar: $886,50 
 * INGRESE NOMBRE DEL CLIENTE6, EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: Fernanda 2500 2
 * Nombre: Fernanda, Cliente tipo: 2, Compra computadora con precio de : $2500,00
 * Se aplica descuento de: 500,00
 * Total a pagar: $2000,00 
 * INGRESE NOMBRE DEL CLIENTE7, EL COSTO DEL COMPUTADOR Y TIPO DE CLIENTE: Joel 4500 3
 * Nombre: Joel, Cliente tipo: 3, Compra computadora con precio de : $4500,00
 * Se aplica descuento de: 0,00
 * Total a pagar: $4500,00 
 * BUILD SUCCESSFUL (total time: 1 minute 6 seconds)
 */