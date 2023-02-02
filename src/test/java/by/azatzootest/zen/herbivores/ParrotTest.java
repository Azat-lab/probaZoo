package by.azatzootest.zen.herbivores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ParrotTest {

    Parrot parrot;

    @BeforeEach
    void prepareData(){
        parrot = new Parrot("Doesn't fly high", "fruits and greens", "CWIK", 2, "rainbow");
    }

    @ParameterizedTest
    @CsvSource({"'red and green', 'red and green', 'blue and pink', 'blue and pink'"})
    void testSetParrotColor(String color, String color1) {
        parrot.setColor(color);
        assertEquals(color1, parrot.getColor());
    }

    @Test
    void testGetSomethingForParrot() {
       Exception ex = assertThrows(Exception.class, () -> {
            parrot.getDietFor();
        });
       assertEquals("Error", ex.getMessage());
    }
}
//"Error don't give it!!!"