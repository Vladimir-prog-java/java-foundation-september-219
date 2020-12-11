package ru.itsjava.object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс телефон должен:")
public class TelephoneTest {

    public static final String DEFAULT_NUMBER = "89111123344";

    public static final String DEFAULT_BRAND = "Iphone";
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
    @DisplayName("иметь корректный геттер PhoneNumber")
    @Test
    public void shouldHaveCorrectGetterPhoneNumber() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber());
    }
    @DisplayName("иметь корректный геттер Brand")
    @Test
    public void shouldHaveCorrectGetterBrand() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals(DEFAULT_BRAND, telephone.getBrand());
    }
    @DisplayName("иметь корректный геттер Price")
    @Test
    public void shouldHaveCorrectGetterPrice() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals(DEFAULT_PRICE, telephone.getPrice());
    }
    @DisplayName("иметь корректный сеттер Price")
    @Test
    public void shouldHaveCorrectSetterPrice() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
telephone.setPrice(71000.500);
assertEquals(71000.500,telephone.getPrice());
    }
    @DisplayName("иметь корректный equals True")
    @Test
    public void shouldHaveCorrectEqualsTrue(){
        var telephone1 = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        var telephone2 = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);

        assertTrue(telephone1.equals(telephone2));
    }
    @DisplayName("иметь корректный equals False")
    @Test
    public void shouldHaveCorrectEqualsFalse(){
        var telephone1 = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        var telephone2 = new Telephone("9211111111", DEFAULT_BRAND, DEFAULT_PRICE);

        assertFalse(telephone1.equals(telephone2));
    }
    @DisplayName("иметь корректный toString")
    @Test
    public void shouldHaveCorrectToString(){
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals("{brand: " + DEFAULT_BRAND + ", tel" + DEFAULT_NUMBER + "}",telephone.toString());
    }
}
