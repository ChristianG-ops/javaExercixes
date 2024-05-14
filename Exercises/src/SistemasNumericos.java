public class SistemasNumericos {
    public static void main(String[] args) {
        var validar = 12;
        var validar01 = 1231;
        boolean  camilo = validar01 > validar;
        System.out.println( camilo);

        // 1. El Numero que vamos a usar:
        int numeroDecimal = 500;
        System.out.println("Numero Decimal es: " + numeroDecimal);
        System.out.println(" ===========================================");

        //Binario
        System.out.println("Numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal) );
        int numeroBinario = 0b111110100; // Se debeee colocar el 0b para decir que es un binario, sino lo toma de manera literal como entero
        System.out.println("Numero binario : " + numeroBinario); // Notese que basto adionar el 0b para tranformar el binario en Entero
        System.out.println(" ===========================================");
        //Octal
        System.out.println( "Numero Octal de "+ numeroDecimal +" es: " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; // Temos que colocar un 0 Cero antes del numero para que el sepa que es octal
        System.out.println("numeroOctal :" + numeroOctal);
        System.out.println(" ===========================================");
        //Hexa
        System.out.println("Numero Hexadecimal de " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4; // Hay que colocar el 0X
        System.out.println("Numero Hexadecimal:" + numeroDecimal );






    }
}
