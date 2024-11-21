/***
 * Realizar un programa Java que permita presentar en 
 * pantalla la siguiente secuencia: 
 * 5/10, 10/12 ,15/14 ,20/16 ,25/18, 30/20
 * @author UTPL
 */
import java.util.Scanner;
public class Problema2_Serie2 {
    public static void main(String[] args) {
       Scanner tcl = new Scanner (System.in);
       int contador = 5, limite;
        System.out.print("DAME EL LIMITE: ");
        limite = tcl.nextInt();
        while (contador <= limite) {
            System.out.print(contador + "/" + (contador + 2) + ", ");
            contador = contador + 5;
        }
    }
}