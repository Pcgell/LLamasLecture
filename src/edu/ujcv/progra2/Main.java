package edu.ujcv.progra2;

import java.math.BigInteger;
import java.util.Scanner;

// clase principal que sirve de punto de entrada
public class Main {

    //funcion o metodo estatico que recibe argumentos por linea de comando y
    // es el punto de partida de todos los programas
    public static void main(String[] args) {

        CsvReader csvReader = new CsvReader();
        int[] results = csvReader.getResults();

        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]+", " );
        }


        //
        //
        //
        // Arreglos.arreglos();
        //sumaEnteros(4,5);
        //new Main().repasoVariables();
	// write your code here
    }

    public void repasoVariables(){

        //reglas para declarar variables
        // 1. tipo de dato
        // 2. nombre valido
        // 3. opcional mente se le asigna un valor
        // 4. si el tipo de dato es un objeto se debe instanciar con la palabra
        //      clave new  excepto para siertos tipos que tienen alguna
        //      forma especial de inicializarse.
        int numeroEntero;
        Integer objetoEnetero = 3;
        objetoEnetero.toString();
        double numeroFlotante = 3.3d;
        String mensaje = "el mensaje !";
        Scanner sc = new Scanner(System.in);
        //int[] arregloEnteros =  new int[4];
        int[] arregloEnteros = {3,8,7,0};
        int ultimo = arregloEnteros.length - 1;
        arregloEnteros[ultimo] = 4;
    }

    // repaso metodos o funciones
    // un metodo me permite agrupar codigo que cumple una funcion y
    // permite reutilizarlo

    // reglas para declarar metodos
    // 1.[opcional] niveles de acceso, ambito o alcanze
    //      *public
    //      *private
    //      *protected
    //      *package(por defecto)
    // 2.[opcional] static - define si el metodo es de la clase o del objeto
    // 3. tipo de retorno
    // 4. nombre valido
    // 5. lista de argumentos separados por comas (parametros)
    // 6. cuerpo del metodo. definido entre las {}

    private static int sumaEnteros (int a, int b){
        int sum = a + b;
        return sum;
    }

    public  Main(){

        Bar bar = new Bar();

        bar.presentFoo();

        bar.getM_foo().setMensaje("Un mensaje sobre escrito!");

        bar.presentFoo();
    }
}
