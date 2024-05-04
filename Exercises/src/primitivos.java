public class primitivos {
    public static void main(String[] args) {
        // En java tenemos dos tipos de datos 1. Primitivos (valor) 2. de referencia (una instancia de una clase)
        // 1. primitivos enteros
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo int corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo int corresponde en bits a " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);
            // para dividir
        System.out.println("___________________________________________");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo int corresponde en byte a " + Short.BYTES);
        System.out.println("tipo int corresponde en bits a " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);
        // para dividir
        System.out.println("___________________________________________");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);
        // para dividir
        System.out.println("___________________________________________");

        long numeroLong = 9223372036854775807L; //Se le añade la L en MAYUSCULA porq minuscula parece un 1
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo int corresponde en byte a " + Long.BYTES);
        System.out.println("tipo int corresponde en bits a " + Long.SIZE);
        System.out.println("valor máximo de un int: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Long.MIN_VALUE);

        // para dividir
        System.out.println("___________________________________________");






    }
}
