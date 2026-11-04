
package tda_pila;

public class Pila {

    private Nodo tope;
    private int nElementos;

    public Pila() {
        tope = null;
        nElementos = 0;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
        nElementos++;

        System.out.println("Agregado: " + dato);
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("La pila esta vacia");
        }

        int dato = tope.dato;
        tope = tope.siguiente;
        nElementos--;

        return dato;
    }

    public int peek() {
        if (empty()) {
            throw new IllegalStateException("La pila esta vacia");
        }

        return tope.dato;
    }

    public boolean empty() {
        return tope == null;
    }

    public void mostrar() {
        Nodo actual = tope;

        System.out.println("Elementos de la pila:");

        while (actual != null) {
            System.out.println("| " + actual.dato + " |");
            actual = actual.siguiente;
        }

        System.out.println("Total: " + nElementos);
    }
}
