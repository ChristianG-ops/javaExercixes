import javax.swing.*;

public class BinariosInputs {
    public static void main(String[] args) {

        
        String numeroDecimal = JOptionPane.showInputDialog(null, "Ingrese un Numero");
        int input = Integer.parseInt(numeroDecimal);
        String numero = "El numero es  : " + input;
        String binaryMessage = "En Numero Binario : " + Integer.toBinaryString(input);
        String octalMessage = "En Numero Octal : " + Integer.toOctalString(input);
        String hexaMessage = "En Numero Hexadecinal : " + Integer.toHexString(input);

        String concat = numero +"\n" + binaryMessage + "\n"+ octalMessage + "\n" + hexaMessage;
        JOptionPane.showMessageDialog(null,concat);

    }
}
