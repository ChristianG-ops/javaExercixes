package com.example.Introduccion;
// Aquí vamos a ver qué tipos de variables hay y como se usan
public class tiposDeVariables {
    public static <integer> void main(String[] args) {
        System.out.println("Tipos de variables ");
        // Clases y primitivos
        String nombre = "my name"; // Aqui la variable es de tipo String
        System.out.println(nombre);
        String nombreMeth = "my name";
        System.out.println("nombreMeth con Método UpperCase = " + nombreMeth.toUpperCase()); // Puedo adicionar un método

        int number = 10; //Primitivo
        Integer numberInteger = 10; // Este ya es una clase

        Boolean valor = true;
        boolean value = true;

        int varInside = 1; // vamos a usar dentro del if
        if (value) {  // Si value es true - sea siempre porque arriba esta como true

            System.out.println("varInside = " + varInside);
            varInside = 12; // Puedo dar un valor diferente a la variable sin definirla de nuevo
        }

        System.out.println("varInside = " + varInside); // Aquí el valor que tendría dentro del IF o sea el output

        // var - Cambia dependiendo el tipo de dado, es más versátil
        var num = 1;  // Aquí es un Int
        var n1um = "camilo"; // Aquí una String
        String meth_substring = "abc".substring(2,3); // 0a 1b 2c -- Substraer del bit x hasta y
        System.out.println("c = " + meth_substring.toUpperCase()); //

        // Variable sin valor
        String variableSinValor;
        int branch = 1;
        if (branch == 0) {

           variableSinValor = "Camilo";
        }
        else {
            variableSinValor = "sofia";
        }
        byte bytesEnteros = 127; // Vea la tabla de valores para enteros,
        char copyright = '\u00A9'; // Esto se llama Unicode y se usa con el char la lista aquí  https://www.fileformat.info/info/unicode/char/a.htm
        System.out.println( copyright + " " + variableSinValor);
    }
}
