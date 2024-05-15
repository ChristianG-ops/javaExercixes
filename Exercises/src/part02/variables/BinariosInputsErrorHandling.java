package part02.variables;

import javax.swing.*;

public class BinariosInputsErrorHandling {
    public static void main(String[] args) {
        String numeroDecimal = JOptionPane.showInputDialog(null, "Ingrese un Numero");
        int input = 0;
        try {
            input = Integer.parseInt(numeroDecimal);

        } catch (NumberFormatException e ){ // Si en el input colocan una letra el nombre del error en la consola sería
            // este : **NumberFormatException** por eso se debe colocar esa exepcion
            JOptionPane.showMessageDialog(null,"Debes ingresar solo numeros" ); // Mensaje
            main(args); // El Exit en wM, osea que se devuelva al main
            System.exit(0); // Salir con estatus 0

        }


        String numero = "El numero es  : " + input;
        String binaryMessage = "En Numero Binario : " + Integer.toBinaryString(input);
        String octalMessage = "En Numero Octal : " + Integer.toOctalString(input);
        String hexaMessage = "En Numero Hexadecinal : " + Integer.toHexString(input);

        String concat = numero +"\n" + binaryMessage + "\n"+ octalMessage + "\n" + hexaMessage;
        JOptionPane.showMessageDialog(null,concat);
}}
