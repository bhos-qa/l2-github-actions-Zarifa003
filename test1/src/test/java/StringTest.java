import org.example.StringClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    @Test
    public void testAdd() {
        StringClass manipulator = new StringClass();
        String result = manipulator.add("Hello", "World");
        assertEquals("HelloWorld", result);
    }

    @Test
    public void testFindLen() {
        StringClass manipulator = new StringClass();
        int length = manipulator.findLen("HelloWorld");
        assertEquals(10, length);
    }

    @Test
    public void testReverse() {
        StringClass manipulator = new StringClass();
        String result = manipulator.reverse("Hello");
        assertEquals("olleH", result);
    }
}

