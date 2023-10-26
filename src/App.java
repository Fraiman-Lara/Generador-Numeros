import java.util.Scanner;

public class App {

    public static int obtenerEntrada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor: ");
        int valor = scanner.nextInt();
        return valor;
    }


    public static void generarValores(){
        int n = obtenerEntrada();
        int conteo = 0;
        while (conteo < n) {
            System.out.println(conteo);
                conteo++;
        }
    }

    public static void generarValoresPares(){
        int n =obtenerEntrada();
        for (int conteo = 0; conteo <= n; conteo++){
            if (conteo % 2 == 0) System.out.print(conteo + " ");
        }
    }


    public static void generarRandom(){
        int n = (int) (Math.random() * 3500);
        for (int conteo = 0; conteo <= n; conteo = conteo + 5){
            System.out.print(conteo + " ");
        }
    }

    public static void main(String[] args) {
        generarValores();
    }
}