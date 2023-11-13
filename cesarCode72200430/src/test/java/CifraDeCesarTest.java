import org.example.CifraDeCesar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CifraDeCesarTest {

    @Test
    public void testCriptografar() {
        assertEquals("Udidho Jxlpdudhv Vdnxudl", CifraDeCesar.criptografar("Rafael Guimaraes Sakurai", 3));

        assertEquals("B", CifraDeCesar.criptografar("A", 1));

        assertEquals("Texto Original", CifraDeCesar.criptografar("Texto Original", 26));
    }

    @Test
    public void testDescriptografar() {
        assertEquals("Rafael Guimaraes Sakurai", CifraDeCesar.descriptografar("Udidho Jxlpdudhv Vdnxudl", 3));

        assertEquals("A", CifraDeCesar.descriptografar("B", 1));

        assertEquals("Texto Original", CifraDeCesar.descriptografar("Texto Original", 26));
    }
}
