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

        int num1, num2 , resultado; // AQUI GENERAMOS VARIABLES

        num1 = 4; //  Les damos valor a las variables.
        num2 = 2;

        resultado = num1 * num2; //  La variable que nos falta la usamos para que nos guarde el resultado

        System.out.println( "El resultado de multiplicar la variables es: " + resultado); // Para mostrar el resultado llamos a la variable que es la que almacena los datos de n1 n2

// ----------------------------------------------- SIGUIENTE EJERCICIO------------------------------------------------------------------------
        /*-------------
        - Intercambio de Valores: REALIZA UN PROGRAMA QUE PERMIRTA EL INTERCAMBIO  DE VALORES ENTRES DOS VARIABLES.
        POR EJEMPLO: SI UNA VARIABLE NUMERO VALE 35, Y UNA VARIABLE NUMERO2 VALE 20 , REALIZA LAS ACCIONES NECESARIAS
        PARA QUE NUMERO PASE A SER 20 Y NUMERO2 PASE A VALER 35. UNA VEZ REALIZADO EL CAMBIO  MOSTRAR EL RESULTADO
        POR PANTALLA.

        int num1 =35;
        int num2 = 20;
        int aux;

        System.out.println("----ANTES----");
        System.out.println("Num1: " +num1);
        System.out.println("Num2: " +num2);

        // OPERACION
        //20  //20    //aux no vale nada al principio pero pasa a vale lo que tenia num2
        aux = num2;
        //35   //35   // num2 le amos le pasamos  lo que vale num1 que es 35
        num2 = num1;
        //20  //20    //  aux vale 20 y num1 35  pero le pasamos el valor de aux que es 20
        num1 = aux;

        System.out.println("----DESPUÉS----");
        System.out.println("Num1: " +num1);
        System.out.println("Num2: " +num2);
  */
// ----------------------------------------------- SIGUIENTE EJERCICIO-------------------------------------------------------------------------------------
   /*
         Una pequeña tienda desea calcular los sueldos de sus empleados . Los sueldos de los mismo pueden tener 3 caregorías:
           1- Reponedor, 2-Cajero 3-Supervisor.

          -Los reponedores cobran $15.890 + un bono del 10%
          -Los cajeros cobran $25.630,68
          -Los supervisores cobran $35.560,20 en bruto al cual se le descuenta un 11%

          Se necesista un programa , que dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla el
          correspondiente sueldo.

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el tipo de empleado 1-Reponedor, 2-Cajero , 3-Supervisor");
        int tipoEmpleado=lector.nextInt(); // tipo de empleado seria la palabra clave que almacena los 3 casos que tendemos y donde se realiza los calculos

        if (tipoEmpleado== 1) {
            double salariobruto = 15.890;
            double bono = salariobruto * 0.10; // calculo de porcentaje
            double salarioFinal = salariobruto+bono; // la suma del porcentaje mas el salario
            System.out.println(" El sueldo del Reponedor es: " + salarioFinal+"€");
        } else if (tipoEmpleado==2) {
            double salarioFinal=25630.68;
            System.out.println("El sueldo del Cajero es: "+ salarioFinal+"€");
        } else if (tipoEmpleado== 3) {
            double salariobruto =35560.20;
            double bono= salariobruto*0.11;
            double  salarioFinal = salariobruto-bono;
            System.out.println(" El sueldo del Supervisor es: " + salarioFinal+"€");
        }else {
            System.out.println(" debe ingresar un numero de categoria valido");
        }
   */
// ----------------------------------------------- SIGUIENTE EJERCICIO-------------------------------------------------------------------------------------
/* OPERADOR TERNARIO: Es una herramienta de Java para tomar decisiones simples en una sola linea de codigo.
    permite tomar decisiones basadas en una condición y ASIGNA UN VALOR  a una variable o expresión en funciñon
    de si la condiciçon es verdadera o es falsa.

    double media;
    String notaFinal;
    Scanner lector = new Scanner(System.in);
        System.out.println(" Ingrese la nota media del alumno ");
        media=lector.nextDouble();
     // condicional    / ? operador ternarosio   : y separador de condiciones
      notaFinal= media>=6 ? "Aprobado" : "Suspenso";
        System.out.println("La nota final del alumno es: "+ notaFinal);
 */
// ----------------------------------------------- SIGUIENTE EJERCICIO-------------------------------------------------------------------------------------
/*
    REALIZA UN PROGRAMA QUE PERMITA CARGAR 15 NÚMEROS EN UN VECTOR. UNA VEZ CARGADOS
    SE NECESITA QUE EL PROGRAMA CUENTE E INFORME POR PANTALLA CÚANTAS VECES SE CARGÓ
                                        EL NUMERO 3.


            Scanner lector = new Scanner(System.in);
            int vector [] = new int[5];
            int contador=0;
        System.out.println("Introduce 15 Números ");
        for (int fila =0; fila<5; fila++) {
            vector[fila] = lector.nextInt();// aqui almaceno lo que el usuario introduce
            if (vector[fila]==3) {
                contador++;
            }
            System.out.println("el valor en la posicion  fila: " + fila);
            System.out.println("es de:  " + vector[fila]) ;
            System.out.println("--------------------------------------");
            System.out.println("el numero 3 se ha escrito " + contador + " veces ");

        }
*/
// ----------------------------------------------- SIGUIENTE EJERCICIO-------------------------------------------------------------------------------------
    /* En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnnos de segundaria.
    Cada fila se corresponde a las notas y el promedio de cada alumno. Se necesita un programa
    que permita a un  profesor cargar, en las posiciones (columnas) de cada fila, las notas
    del alumno y que en la última columna se calculen los promedios. Una vez realizado los
    cálculos,se desea motrar las 3 notas de casa alumno y el promedio correpondiente recorriendo
    la matriz.



        double matriz[][] = new double[4][4];// tengo la tabla hecha
        Scanner lector = new Scanner(System.in);
        double suma = 0.0;
        // For para cargar

        for (int fila = 0; fila < 4; fila++) { // alumnos
            for (int columna = 0; columna < 3; columna++) { // notas
                System.out.println("Ingrese la calificación del alumno nº  " + fila);
                matriz[fila][columna] = lector.nextDouble();
                suma = suma + matriz[fila][columna]; //← lo que guardamos en la matriz se va sumando
            }
            matriz[fila][3] = suma / 3; //← Este es el promedio
            suma = 0.0;
        }
        // For para recorer

        for (int fila = 0; fila < 4; fila++) {
            System.out.println("las notas del alumno nº " + fila + " son:");
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Nota Nº, "+ "" + columna + matriz[fila][columna]);
            }
            System.out.println("El promedio de las notas es: " + matriz[fila][3]);
        }
// ----------------------------------------------- SIGUIENTE EJERCICIO-------------------------------------------------------------------------------------

    Realiza un program que muestre por pantalla  palabras que sean ingresadas por teclado hasta que se
    insgrese la palabra ("salir") tanto en mayusculas como en minusculas

    paso 1º sabemos que es un bucle de tipo while ya que  no tiene ni inicio ni final y nos muestra la palabra clave
    hasta osea que se descarta el do while porque hace una pasada

    paso 2º sabemos la con dondición de salida del bucle

    paso 3º centinela


        Scanner lector = new Scanner(System.in);
        System.out.println("introduce cualquier palabra");
        String palabra = lector.next();
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println("Introduciste la palabra: " + palabra);
            System.out.println(" Ingrese cualquier palabra ");
            palabra=lector.next();
        }

     */
    }
}