package com.example.helloworld;
// Aqui vamos a ver que tipos de variables hay y como se usan
public class tiposDeVariables {
    public static <integer> void main(String[] args) {
        System.out.println("Tipos de variables ");
        // Clases y primitivos
        String nombre = "my name"; // Aqui la variable es de tipo String
        System.out.println(nombre);
        String nombreMetodo = "my name";
        System.out.println("nombreMetodo con Metodo UpperCase = " + nombreMetodo.toUpperCase()); // Puedo adicionar un metodo

        int number = 10; //Primitivo
        Integer numberInteger = 10; // Este ya es una clase

        Boolean valor = true;
        boolean value = true;

        int varInside = 1; // vamos a usar dentro del if
        if (value) {  // Si value es true - osea siempre porque arriba esta como true

            System.out.println("varInside = " + varInside);
            varInside = 12; // Puedo dar un valor diferente a la variable sin definirla de nuevo
        }

        System.out.println("varInside = " + varInside); // Aqui el valor que tendria dentro del IF osea el output

        // var - Basicamente cambia dependiendo el tipo de dado, es mas versatil
        var num = 1;  // Aqui es un Int
        var n1um = "camilo"; // Aqui una String
        String meth_substring = "abc".substring(2,3); // 0a 1b 2c -- Substraer del bit x hasta y
        System.out.println("c = " + meth_substring.toUpperCase()); //









    }
}
