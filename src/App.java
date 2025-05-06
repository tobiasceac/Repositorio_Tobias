import Modelo.*;
/**
 * Clase app que ejecuta el programa.
 *
 * @author tobiasceac
 * @version 1.0
 */
public class App {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Pepe");

        System.out.println(perro);
        System.out.println(gato);
        perro.sonido();
        gato.sonido();
    }
}
