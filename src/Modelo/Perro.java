package Modelo;
/**
 * Clase que representa un Perro, hereda de la clase Animal.
 * Implementa el metodo  sonido.
 *
 * @author tobiasceac
 * @version 1.0
 */
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String sonido() {
        return "GUAU";
    }

}
