package ru.itsjava.object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс телефон должен:")
public class TelephoneTest {

    public static final String DEFAULT_NUMBER = "89111123344";
    public static final String BRAND = "Iphone";
    public static final String DEFAULT_BRAND = BRAND;
    public static final int DEFAULT_PRICE = 70000;

    //    @BeforeAll
//            public void setUp() {
//        Telephone telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
//    }
    @DisplayName("иметь корректный конструктор")

    @Test
    public void shouldHaveCorrectAllArgsConstructor() {

        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);

//        Assertions.assertEquals("89111123344", telephone.getPhoneNumber());
//        Assertions.assertEquals("Iphone", telephone.getBrand());
//        Assertions.assertEquals(70000, telephone.getPrice());
//
        assertAll("telephone",
                () -> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                () -> assertEquals(DEFAULT_PRICE, telephone.getPrice()));
    }

    @Test
    public void shouldHaveCorrectGetterPhoneNumber() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber());
    }

    @Test
    public void shouldHaveCorrectGetterBrand() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals(DEFAULT_BRAND, telephone.getBrand());
    }

    @Test
    public void shouldHaveCorrectGetterPrice() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals(DEFAULT_PRICE, telephone.getPrice());
    }
    @DisplayName("иметь корректный сеттер")
    @Test
    public void shouldHaveCorrectSetterPrice() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
telephone.setPrice(71000.500);
assertEquals(71000.500,telephone.getPrice());
    }

}
