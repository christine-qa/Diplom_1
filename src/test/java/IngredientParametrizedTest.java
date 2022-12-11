
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientParametrizedTest {
    private IngredientType type;
    private String name;
    private float price;

    public IngredientParametrizedTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Ingredients: type={0}, name={1}, price={2}")
    public static Object[][] getData() {
        return new Object[][] {
                {IngredientType.SAUCE, "Соус с шипами Антарианского плоскоходца", 88},
                {IngredientType.SAUCE, "Соус фирменный Space Sauce", 80},
                {IngredientType.SAUCE, "Соус традиционный галактический", 15},
                {IngredientType.FILLING, "Говяжий метеорит (отбивная)", 3000},
                {IngredientType.FILLING, "Мясо бессмертных моллюсков Protostomia", 1337},
                {IngredientType.FILLING, "Плоды Фалленианского дерева", 874}
        };
    }

    @Test
    public void getPriceTest(){
        Ingredient ingredient = new Ingredient(type, name, price);
        float actualPrice = ingredient.getPrice();
        assertEquals("Incorrect ingredient's price",price, actualPrice, 0);
    }

    @Test
    public void getNameTest(){
        Ingredient ingredient = new Ingredient(type, name, price);
        String actualName = ingredient.getName();
        assertEquals("НIncorrect ingredient's name", name, actualName);
    }

    @Test
    public void getTypeTest(){
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actualType = ingredient.getType();
        assertEquals("Incorrect ingredient's type", type, actualType);
    }
}