
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericosConsole {
    public static void main(String[] args) {

        //Vamos a usar la clase Scanner
        Scanner printTerminal = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        //String numeroDecimal = printTerminal.nextLine();
        int input = 0;
        try {
            input = printTerminal.nextInt(); //Integer.parseInt(numeroDecimal);

        } catch (InputMismatchException e ){ // aqui como usamos la libreria SCANNER entonces la exepciones no son iguales
            //pero si queremos que cualquer exepcion entre en el catch entonces ponemos: catch (Exception e )
            System.out.println("Debes ingresar solo numeros");
            main(args); // El Exit en wM, osea que se devuelva al main
            System.exit(0); // Salir con estatus 0

        }



        String numero = "El numero es  : " + input;
        String binaryMessage = "En Numero Binario : " + Integer.toBinaryString(input);
        String octalMessage = "En Numero Octal : " + Integer.toOctalString(input);
        String hexaMessage = "En Numero Hexadecinal : " + Integer.toHexString(input);

        String concat = numero +"\n" + binaryMessage + "\n"+ octalMessage + "\n" + hexaMessage;
        System.out.println( concat);
}}
