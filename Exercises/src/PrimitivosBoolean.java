public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datologico = false ;
        System.out.println("datologico = " + datologico);
        
        double  d = 9990.43e-3; // 9,99043
        float  f = 9.99e-3f; // 0.00999
        
        datologico = d > f; // datologico es igual a 9.99043 MAYOR 0.00999
        System.out.println("valor de F = " + f);
        System.out.println("valor de d = " + d);
        System.out.println("Es:" + datologico); // Resultado de la Validation de Arriba

        boolean esIgual = (3-2 == 1); // 3 MENOS 2 ES igual a 1 ?
        System.out.println("esIgual = " + esIgual);
        
    }
}
