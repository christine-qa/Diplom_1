package praktikum;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BunTest {
    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("Флюоресцентная булка R2-D3", 988);
    }

    @Test
    public void getNameTest() {
        String expectedName = "Флюоресцентная булка R2-D3";
        String actualName = bun.getName();
        assertEquals("Название булки некорректное!",expectedName, actualName);
    }

    @Test
    public void getPriceTest() {
        int expectedPrice = 988;
        float actualPrice = bun.getPrice();
        assertEquals("Цена булки некорректная!",expectedPrice, actualPrice, 0);
    }
}
