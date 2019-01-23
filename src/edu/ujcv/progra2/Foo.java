package edu.ujcv.progra2;

// Repaso Contencion
// Nombre del archivo y la clase principal deben ser identicos.
// reglas Contencion
// 1. miembros privados
// 2. accesoras y mutadoras
// 3. definir constructores especialmente el de copia.

public class Foo {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Foo(){
        mensaje = "Hola Foo!!";
    }

    // constructor de copia para definir si va ser superficial o profunda.
    public Foo(Foo otroFoo){
        //copia profunda!
        this.mensaje = new String(otroFoo.mensaje);

        //copia superficail.
        //this.mensaje = otroFoo.mensaje;

    }
}
