package Test;

import Modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class test {

    @Test
    void testPerroSonido() {
        Perro perro = new Perro("Firulais");
        assertEquals("GUAU", getSonido(perro));
    }

    @Test
    void testGatoSonido() {
        Gato gato = new Gato("Pepe");
        assertEquals("MIAU", getSonido(gato));
    }

    private String getSonido(Animal animal) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        animal.sonido();
        System.setOut(System.out); // Restaura la salida estándar
        return out.toString().trim();
    }
}
