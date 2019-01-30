package edu.ujcv.progra2;

public class Arreglos {


    public static void arreglos(){

        // que es un arreglo?
        // conjutnto de datos colocados de manera contigua en memoria
        // deben ser del mismo tipo y pueden ser indexados

        //ejemplo arreglo enteros
        //  0     1     2     3     4      tamaño: 5
        //-----------------------------
        //\ 0  |  3  |  4  |  7  |  8  |
        //-----------------------------


        // como declaro un arreglo?
        // 1. tipo de dato - puede ser primitivo o Objeto.
        // 2. abrir y cerrar corchetes  [] (opcional aqui o en el paso 4.)
        // 3. nombre valido.
        // 4. abrir y cerrar corchetes  [] (opcional aqui o en el paso 2.)
        // 5. opcional: inicalizar el arreglo usando lista de inicializacion
        //      entre llaves y separado por comas {0,3,4,7,8} o utilizando
        //      la palabra clave 'new'   ej: new int[5];


        int[] arreglo = new int[6];


        // se pueden indexar usando los [] y un entero que este dentro de el tamaño
        // del arreglo.
        arreglo[0] = 0;
        arreglo[1] = 3;
        arreglo[2] = 4;
        arreglo[3] = 7;
        arreglo[4] = 8;
        arreglo[5] = 10;

        // arreglo[5] causa una exepcion de 'index out of bounds'

        // esto es porque los arreglos normales de java no crecen o decrecen sino
        // mas bien tienen un tamaño fijo definido al momento de instanciarlos.

        // para poder agregar o quitar un elemento toca dimencionar un arreglo
        // del nuevo tamaño y copiar los datos pertinentes a este arreglo
        // omitiendo los datos que se quieren obviar y agregando los datos
        // que se desean agregar.

        //  POR SUERTE!!!!!1111  las librerias standard de java proveen de Objetos
        //  que facilitan tal comportamiento como el ArrayList.

        // para imprimir un arreglo no basta con imprimirlo de la siguiente manera
        //System.out.println(arreglo);

        // toca recorrer el arreglo de manera iterativa y imprimir cada elemento
        // se puede hacer mediante el uso de un for loop(ciclo for).
        // puedo acceder al tamaño del arreglo usando la propiedad length.

        for( int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }

        }
}
