import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {

    private final Bun bun;
    private final String name;
    private final float price;

    public BunTest(Bun bun, String name, float price) {
        this.bun = bun;
        this.name = name;
        this.price = price;
    }

   @Parameterized.Parameters(name="BunsTestData: bun={0}, name={1}, price={2}")
    public static Object[][] data() {
        return new Object[][] {
                {new Bun("Флюоресцентная булка R2-D3", 988), "Флюоресцентная булка R2-D3", 988},
                {new Bun("", Float.MIN_VALUE), "", Float.MIN_VALUE},
                {new Bun(null, 0), null, 0},
                {new Bun("Very long long long long long long long long long long long bun", Float.MAX_VALUE), "Very long long long long long long long long long long long bun", Float.MAX_VALUE},
                {new Bun("@%%$^%*", -100f), "@%%$^%*", -100f},
                {new Bun("LINGUA LATINA ONLY UPPER CASE",Integer.MAX_VALUE), "LINGUA LATINA ONLY UPPER CASE", Integer.MAX_VALUE},
                {new Bun("lingua latina only lower case", Integer.MIN_VALUE), "lingua latina only lower case", Integer.MIN_VALUE},
                {new Bun("123", 0.1f), "123", 0.1f}
        };
    }

    @Test
    public void getNameTest() {
        Bun actualBun = new Bun(name, price);
        assertEquals("Название булки некорректное!", bun.name, actualBun.getName());
    }

    @Test
    public void getPriceTest() {
        Bun actualBun = new Bun(name, price);
        assertEquals("Цена булки некорректная!", bun.price, actualBun.getPrice(), 0);
    }
}