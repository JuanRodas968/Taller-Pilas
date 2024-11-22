import java.io.IOException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        Metodos m = new Metodos();
        Stack<Integer> pila = new Stack<>();
        int Vector[] = m.Llenar_Vector();
        m.Llenar_pila(Vector, pila);
        System.out.println("Los factoriales de los numeros en el vector son:\n");
        m.Mostrar_pila(pila);

    }
}
