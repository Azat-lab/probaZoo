package by.azatzootest.zen.predators;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LionTest {

    @Test
    @Order(1)
    void getRun() {
        Lion lion = new Lion("Not fast not Slow", "ROR", "Meat", 4);
        assertEquals("Not fast not Slow", lion.getMoves());
    }

    @Test
    @Order(2)
    void setRun() {
        Lion lion = new Lion("Not Fast not Slow", "ROR", "Meat", 4);
        lion.setMoves("Fast or Slow");
        assertEquals("Not Fast not Slow", lion.getMoves());
    }
    @Test
    @Order(3)
       void testIfRunIsEmpty(){
        Lion lion = new Lion("", "ROR", "Meat", 4);
        lion.setMoves("Not Fast not Slow");
        assertEquals("Not Fast not Slow", lion.getMoves());
    }

}