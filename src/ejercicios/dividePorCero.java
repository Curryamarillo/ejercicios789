package ejercicios;

import java.util.Scanner;

public class dividePorCero {
    public static int dividir() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        System.out.print(":");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor");
        System.out.print(":");
        try {int divisor = scanner.nextInt();
            return dividendo / divisor;}
         catch (ArithmeticException e) { System.out.println("Esto no se puede hacer"); }

     finally {  System.out.println("Demo de código");}

        return dividendo;
    }

    }


