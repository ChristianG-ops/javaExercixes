import javax.swing.*;

public class InputsV01 {
    public static void main(String[] args) {
        String stringDialog = JOptionPane.showInputDialog( null,"Ingrese un numero: "); // hay que crear el input

        int numeroDecimal = Integer.parseInt(stringDialog); // Es de tipo Int, asi que hay que tranformar la String arriba

        //decinaml
        System.out.println("Numero Decimal es: " + numeroDecimal);
        System.out.println(" ===========================================");

        //Binario
        System.out.println("Numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal) );
        int numeroBinario = 0b111110100;
        System.out.println("Numero binario : " + numeroBinario);
        System.out.println(" ===========================================");

        //Octal
        System.out.println( "Numero Octal de "+ numeroDecimal +" es: " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal :" + numeroOctal);
        System.out.println(" ===========================================");

        //Hexa
        System.out.println("Numero Hexadecimal de " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4; // Hay que colocar el 0X
        System.out.println("Numero Hexadecimal:" + numeroDecimal );


        //Ouput Message
        String messageOutput =  "Numero Decimal es: " + numeroDecimal;
        messageOutput += "\nNumero Octal de "+ numeroDecimal +" es: " + Integer.toOctalString(numeroDecimal);
        messageOutput +=  "\nNumero Hexadecimal de " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, messageOutput); // OutputMessage

    }

}
