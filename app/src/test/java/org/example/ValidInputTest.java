package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidInputTest {

    @Test
    void testObjectCreation() {
        ValidInput v = new ValidInput();
        assertNotNull(v); 
    }

    @Test
    void testReturnType() {
        ValidInput v = new ValidInput();
        assertTrue(v instanceof ValidInput);
    }
}