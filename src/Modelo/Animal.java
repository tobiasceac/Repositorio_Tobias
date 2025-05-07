package Modelo;
/**
 * Clase abstracta  Animal.
 * Contiene atributos y métodos para los animales.
 *
 * @author tobiasceac
 * @version 1.0
 */
public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract String sonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
