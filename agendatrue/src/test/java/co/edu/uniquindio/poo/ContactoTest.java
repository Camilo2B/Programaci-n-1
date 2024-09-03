/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class,()-> new Contactos(" ", " ", " ", " ", " "));


        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test validacionCorreo");

        assertThrows(Throwable.class,()-> new Contactos("Erwin", "Harder", "xxxx", "312xxxx", "erwinj.uqvirtual.edu.co"));

        LOG.info("Finalizando test validacionCorreo");
    }
}

