public class PrimitivoCaracteres {
    public static void main(String[] args) {
        char character = '\u0040'; // Solo soporta 1 Character y UNICODE usando el / ex. \u0040
        char decimal = 64; // Arroba en unicode es \u0040 y en decimal es 64
        System.out.println("character = " + character);
        System.out.println(" Decimal es igual a Caracter" + (character == decimal)); // Son iguales?

        // Var está disponible a partir del JDK 10 en adelante
        var varChar = 64;  // Recuerde que el var puede ser cualquier cosa, pero no va a ser un char, aquí 64 es int

        System.out.println("Bytes = " + Character.BYTES);
        System.out.println("Tamanho = " + Character.SIZE);
        System.out.println("Máximo = " + Character.MAX_VALUE); //Son básicamente caracteres, por eso el resultado es raro
        System.out.println("Máximo = " + Character.MIN_VALUE); //Son básicamente caracteres, por eso el resultado es raro

        //Podemos usar el char también para algunas funciones como:
        char espacio = '\u0020';
        char retroceso = '\b'; //Borrar el character anterior
        char tabulador = '\t'; //hacer un tab
        char nuevaLinea = '\n'; // Básicamente, dar un enter pata bajar una línea
        char retornoCarro = '\r';
        // ATENTION: estos arriba se pueden comportar diferente dependiendo del sistema operativo.
        //Para estar seguro de que, lo de arriba va a funcionar en qualiquier S.O es mejor usar esto:
        System.out.println( "Usar asi: " + nuevaLinea + Character.BYTES); //Opcion 1
        System.out.println( "Usar asi: " + System.getProperty("line.separator") + Character.BYTES); //Opcion 2
        System.out.println( "Usar asi: " + System.lineSeparator() + "Camilo"); //Opcion 3 Sugestion del IDE








    }
}
