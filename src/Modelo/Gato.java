package Modelo;
/**
 * Clase que representa un Gato, hereda de la clase Animal.
 * Implementa el metodo sonido.
 *
 * @author tobiasceac
 * @version 1.0
 */
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }


    @Override
    public String sonido() {
        return "MIAU";
    }
}
