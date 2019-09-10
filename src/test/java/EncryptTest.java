import Cipher.Encryption;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EncryptTest {
        @Test
        public void Encrypt_test_string(){
            Encryption encryptionTest = new Encryption();
            String expectedOutput = "Rachel";

            assertEquals(expectedOutput, encryptionTest.Encryption("hi", 4));
        }
    }
