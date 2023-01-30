import java.util.Scanner;

public class CadenaAlReves {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto");
        texto = scanner.nextLine();

        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();

        System.out.println(texto);
    }
}

