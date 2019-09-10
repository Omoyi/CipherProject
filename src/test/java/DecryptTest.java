import Cipher.Decryption;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecryptTest {
    @Test
    public void Decrypt_test_string() {
        Decryption decryptionTest = new Decryption();
        String expectedOutput = "Rachel";
        assertEquals(expectedOutput, decryptionTest.Decryption("hi", 4));
    }
}