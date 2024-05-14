import javax.swing.*;

public class InputsV02 {
    public static void main(String[] args) {
        String stringDialog = JOptionPane.showInputDialog( null,"Ingrese un numero: "); // hay que crear el input

        int numeroDecimal = Integer.parseInt(stringDialog); // Es de tipo Int, asi que hay que tranformar la String arriba

        //decinaml
        System.out.println("Numero Decimal es: " + numeroDecimal);
        System.out.println(" ===========================================");

        //Binario
        String resultadoBinario = "Numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b111110100;
        System.out.println("Numero binario : " + numeroBinario);
        System.out.println(" ===========================================");

        //Octal
        String  resultadoOctal = "Numero Octal de "+ numeroDecimal +" es: " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal :" + numeroOctal);
        System.out.println(" ===========================================");

        //Hexa
        System.out.println("Numero Hexadecimal de " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4; // Hay que colocar el 0X
        System.out.println("Numero Hexadecimal:" + numeroDecimal );


        //Ouput Message
        String messageOutput =  "Numero Decimal es: " + numeroDecimal;
        messageOutput += "\n" + resultadoBinario;
        messageOutput +=  "\n" + resultadoOctal;

        JOptionPane.showMessageDialog(null, messageOutput); // OutputMessage

    }

}
