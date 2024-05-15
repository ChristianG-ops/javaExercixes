package part02.variables;

import javax.swing.*;

public class ConversionDeTipos {  //Class
    public static void main(String[] args) { //Method

        
        // ======= Vamos a convertir valores de String  para Any Type ===========================================

        String numeroString = "24"; // Recuerde comillas para un String
        int numeroInt = Integer.parseInt(numeroString);

        String numeroReal = "123456.43e-3";
        double numeroDouble = Double.parseDouble(numeroReal);

        String stringBoolean = "TRUE";
        boolean numeroBolean = Boolean.parseBoolean(stringBoolean); //Convertimos a boolean
        String mayuscula = Boolean.toString(numeroBolean); // despues a String para aplicar el UpperCase en el print

        //Recuerde que de string para binario es diferente el proceso.
        int   binarioNumero = 10;
        var numeroBinario = Integer.toBinaryString(binarioNumero);
        System.out.println("Byte.BYTES = " + Byte.BYTES);

        JOptionPane.showMessageDialog(null, "\n" +
                numeroBinario + "\n" + numeroInt +"\n"+ numeroDouble + "\n" + mayuscula.toUpperCase() );

        // ======= Vamos a convertir valores de  ANY TYPE para String ===========================================

        int anyToString = 19;
        System.out.println("Valor Int = " + anyToString);
        String intString = Integer.toString(anyToString); // MANERA 01
        intString = String.valueOf(anyToString);          // MANERA 02
        System.out.println("Valor Int to String = " + anyToString);

        boolean boleanToString = true;
        System.out.println("Valor boolean = " + boleanToString);
        String sString;
        sString = String.valueOf(boleanToString);
        System.out.println("Valor boolean to String = " + sString);


        // ======= JAVA CASTING convert primitive data to another primitive ======================================

        //Widening Casting:  byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting: double -> float -> long -> int -> char -> short -> byte

        double myDouble01 = 9.78d;
        int myInt02 = (int) myDouble; // Manual casting: double to int - Basicamente se forza

        System.out.println(myDouble01);   // Outputs 9.78
        System.out.println(myInt02);      // Outputs 9










    }
}
