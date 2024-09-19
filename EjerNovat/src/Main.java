//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /* // --- EJERCICIO 1º ------------------------------------------------------------------------
        ARITMÉTICOS             RELACONALES                              CONDICIONALES
                + SUMA                  == IGUAL                                 && (AND O Y) DEVUELVE TRUE SI AMBOS SON CIERTOS
        - RESTA                 (> MAYOR QUE, < MENOR QUE)               || (OR U O) DISTINTO DEVUELVE TRUE SI ALGUNO DE LOS OPERADORES ES CIERTO
        * MULTIPLICACIÓN        (>= MAYOR O IGUAL, <= MENOR O IGUAL)     ! (NOT) NEGACION INVIERTE EL RESUSLTADO, DEVUELVE FALSO SI EL OPRADOR ES TRUE.
        / DIVISIÓN              != DISTINTO
        */

        int num1, num2 , resultado; // AQUI GENERAMOS VARIABLES

        num1 = 4; //  Les damos valor a las variables.
        num2 = 2;

        resultado = num1 * num2; //  La variable que nos falta la usamos para que nos guarde el resultado

        System.out.println( "El resultado de multiplicar la variables es: " + resultado); // Para mostrar el resultado llamos a la variable que es la que almacena los datos de n1 n2



    }
}