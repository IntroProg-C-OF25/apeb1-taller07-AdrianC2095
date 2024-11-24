/***
 * Problema 7
Generar e imprimir la siguiente serie:
sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
import java.util.Scanner;
public class Problema7_Serie3 {
    public static void main(String[] args) {
        int contador = 1;
        String serie = "Sumatoria = ";
        while (contador <= 10) {
            if (contador % 2 == 1) {
                serie = serie + "-(1/" + contador + ")";
            }else {
                serie = serie + "+(1/" + contador + ")";
            }
            contador++;
        }
        System.out.println(serie);
    }
}
/***
 * run:
 * Sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
