import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void subtract() {
        // Fails
        assertEquals(3, SkillDemo1.subtract(5, 3));
        // Success
        // assertEquals(3, SkillDemo1.subtract(5, 2));
    }
}