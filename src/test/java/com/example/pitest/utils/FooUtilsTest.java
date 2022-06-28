package com.example.pitest.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FooUtilsTest {

    @Test
    void getterShouldReturnValue() {
        var text = "text";
        var foo = new FooUtils(text);
        assertEquals(text, foo.getText());
    }
}