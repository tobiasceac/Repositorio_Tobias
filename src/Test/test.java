package Test;

import Modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class test {

    @Test
    void testPerroSonido() {
        Perro perro = new Perro("Firulais");
        String sonido = perro.sonido();
        assertEquals("GUAU", sonido, "El sonido del perro no es correcto");
    }

    @Test
    void testGatoSonido() {
        Gato gato = new Gato("Pepe");
        String sonido = gato.sonido();
        assertEquals("MIAU", sonido, "El sonido del gato no es correcto");
    }
}
