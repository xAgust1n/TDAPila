
package tda_pila;

public class TDA_Pila {

 public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println("Esta vacia: " + pila.empty());
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        pila.mostrar();

        System.out.println("Tope actual: " + pila.peek());

        System.out.println("Elemento extraido: " + pila.pop());

        System.out.println("Nuevo tope: " + pila.peek());

        pila.mostrar();

        System.out.println("Esta vacia: " + pila.empty());
    }
}
