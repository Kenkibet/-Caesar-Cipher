import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {

    @Before
    public void setUp() throws Exception {
        Cipher testCaesarCipher = new Cipher();
        assertTrue(testCaesarCipher instanceof Cipher);
    }

    @Test
    public void encrypt() {
        String output = new Cipher().encrypt("test", 2);
        assertTrue(output instanceof String);

        String expectedOutput = "YELLOW";
        output = new Cipher().encrypt("DESTA", 2);
        assertNotEquals(expectedOutput, output);

        output = new Cipher().encrypt("me", 2);
        assertEquals(output, "nf");
    }

    @Test
    public void decrypt() {
        String output = new Cipher().decrypt("test", 2);
        assertTrue(output instanceof String);

        String expectedOutput = "YELLOW";
        output = new Cipher().decrypt("DESTA", 2);
        assertNotEquals(expectedOutput, output);

        output = new Cipher().decrypt("me", 2);
        assertEquals(output, "nf");
    }
}