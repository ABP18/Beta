import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, accion;

        System.out.println("Calculadora simple");
        System.out.println("__________________");
        while (true) {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1-Sumar 2-Dividir 3-Multiplicar 4-Dividir 5-Salir");
            accion = sc.nextInt();

            if (accion == 5) {
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            System.out.println("Ingrese el primer número:");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número:");
            num2 = sc.nextInt();

            double resultado = 0;

            if (accion == 1) {
            	//aqui la suma
            } else if (accion == 2) {
            	//aqui la resta
            } else if (accion == 3) {
            	//aqui la multiplicacion
            } else if (accion == 4) {
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    continue;
                }
            } else {
                System.out.println("Opción no válida. Por favor, elija una operación válida.");
                continue;
            }

            System.out.println("El resultado es: " + resultado);
        }

        sc.close();
    }
}
