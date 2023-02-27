mport java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String titular = "Valentina";
        double cantidad_inicial = 0.0;
        double cantidad_actual = 0.0;
        final int OPCION_DEPOSITO = 1;
        final int OPCION_RETIRO = 2;

        System.out.println("Hola " + titular);
        System.out.println("Saldo:"+ cantidad_inicial);
        while(cantidad_actual < 100){
            System.out.println("¿Qué quieres hacer?");
           System.out.println("1. Depositar");
           System.out.println("2. Retirar");

        double eleccion_usuario = entrada.nextDouble();

        if (eleccion_usuario == OPCION_DEPOSITO) {
            System.out.println("¿Cuánto quieres depositar?");
            Double cantidad_deposito = entrada.nextDouble();

            if (cantidad_deposito > 0) {
                cantidad_actual = cantidad_inicial + cantidad_deposito;
                System.out.println("cantidad inicial:  " + cantidad_inicial);
                cantidad_inicial = cantidad_actual;
                System.out.println("Tu saldo final es: " + cantidad_actual);
            } else {
                System.out.println("La cantidad de depósito debe ser mayor a cero y no puede ser negativa.");
            }
            }else if (eleccion_usuario == OPCION_RETIRO){
                System.out.println("¿Cuánto quieres retirar?");
                Double cantidad_retiro = entrada.nextDouble();

                if (cantidad_retiro > 0) {
                    cantidad_actual = cantidad_inicial - cantidad_retiro;
                    System.out.println("cantidad inicial:  " + cantidad_inicial);
                    cantidad_inicial = cantidad_actual;
                    System.out.println("Tu saldo final es: " + cantidad_actual);
                } else if(cantidad_retiro < 0){
                    System.out.println("No puedes retirar una cantidad negativa.");
                }else if(cantidad_retiro > cantidad_actual){
                    System.out.println("saldo insuficiente");
                }
            } 

     
    }
}
}
