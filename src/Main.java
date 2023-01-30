import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        String[] alberto = {"Inoperante", "Inútil", "Fuera de la Realidad", "Pusilánime"};
        for (String s : alberto) {
            System.out.println(s);
        }
        Integer[][] arrayNum = {{1, 2, 3}, {4, 5,}};
        for (Integer[] integers : arrayNum) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();

        }
        ArrayList<Integer> vectores = new ArrayList<>();
        vectores.add(1);
        vectores.add(2);
        vectores.add(3);
        vectores.add(4);
        vectores.add(5);


        for (Integer v : vectores) {
            System.out.print(v + " ");
        }
        vectores.remove(1);
        vectores.remove(2);

        for (Integer w : vectores) {
            System.out.print(w + " \n");
        }
        ////// El problema es la copia que se produce que usa muchos recursos de memoria al copiar el array

        ArrayList<String> arrayUno = new ArrayList<>();
        arrayUno.add("Hola");
        arrayUno.add("Soy");
        arrayUno.add("Un");
        arrayUno.add("ArrayList");

        for (String s : arrayUno) {
            System.out.println(s);
        }
        LinkedList<String> arrayDos = new LinkedList<>(arrayUno);
        for (String s : arrayDos) {
            System.out.println(s);
        }
        ArrayList<Integer> listaDiez = new ArrayList<>(10);
        for (int i = 0; i < 11; i++) {
            listaDiez.add(i);
        }
        System.out.println(listaDiez);
        for (int i = 0; i < listaDiez.size(); i++) {
            if (listaDiez.get(i) % 2 == 0) {
                listaDiez.remove(i);
            }
        }System.out.println(listaDiez);


    }
    public static class CopiarFicheros {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el fichero de origen: ");
            String fileIn = scanner.nextLine();
            System.out.println("Introduce el fichero de destino: ");
            String fileOut = scanner.nextLine();
            copiar(fileIn, fileOut);
        }

        private static void copiar(String fileIn, String fileOut) {
            try {
                InputStream in = new FileInputStream(fileIn);
                byte[] datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();
            } catch (Exception e) {
                System.out.println("Excepcion: " + e.getMessage());
            }
        }

    }
}


