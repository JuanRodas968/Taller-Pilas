import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Metodos {

    public BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

    public int[] Llenar_Vector() throws IOException {

        int tam = 0;
        int vector[] = null;

        do {

            try {

                System.out.println("Ingrese el tamaño del vector: ");
                tam = Integer.parseInt(cp.readLine());

                if (tam < 1) {
                    System.out.println("Porfavor Ingrese un número positivo adecuado para el tamaño del vector...");
                    tam = 0;
                } else {

                    vector = new int[tam];
                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número...");
                tam = 0;
            }

        } while (tam <= 0);

        for (int i = 0; i < vector.length; i++) {

            boolean right = false;

            do {
                try {

                    System.out.println("Ingrese un número para la posicion " + i + " del vector: ");
                    int num = Integer.parseInt(cp.readLine());
                    if (num < 0) {
                        System.out.println("Por favor ingrese un número positivo...");
                        // no se puede hallar el factorial de un número positivo

                    } else {
                        vector[i] = num;
                        right = true;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese un número...");

                }

            } while (right == false);

        }

        return vector;
    }

    public Stack Llenar_pila(int[] vector, Stack<Integer> pila) {

        for (int i = 0; i < vector.length; i++) {
            
            int result = 1;

            for (int j = 1; j <= vector[i]; j++) {
                result *= j;

            }

            pila.push(result);
        }

        return pila;
    }

    public void Mostrar_pila(Stack pila) {

        System.out.println(pila);
    }
}
